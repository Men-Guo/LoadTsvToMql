package com.predictspring.controller;

import com.predictspring.entity.SolrParam;
import com.predictspring.entity.SolrProduct;
import com.predictspring.vo.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("solr")
public class SolarSearchController {

    @Autowired
    private SolrClient solrClient;

    @RequestMapping("uploadAll")
    public RespBean uploadAll(){
        try{
            //solrClient.request("http://localhost:8983/solr/dih/dataimport?command=delta-import");
            SolrQuery params = new SolrQuery();
            params.setRequestHandler("dataimport");
            params.set("command", "full-import").set("commit", "true");
            QueryResponse queryResponse = solrClient.query(params);
            log.info("Sucessfully update all data into solr from database.");
            return RespBean.success();
        }catch (Exception e){
            log.info("Failed to upload data from database to solr.");
        }
        return RespBean.error();
    }

    @RequestMapping("deleteAll")
    public RespBean deleteAll(){
        try{
            solrClient.deleteByQuery("*:*");
            solrClient.commit();
            return RespBean.success("Delete Success.");
        }catch (Exception e){
            log.info("Failed to delete documents from solr.", e);
        }
        return RespBean.error("Failed to delete documents from solr.");
    }

    @RequestMapping("search")
    public RespBean search(@RequestBody SolrParam solrParam){
        try{
            SolrQuery params = new SolrQuery();
            //todo valid solrParam
            params.set("q", solrParam.getQ().equals("") ? "*:*" : solrParam.getQ())
                    .set("fq", solrParam.getFq().equals("") ? "" : solrParam.getFq())
                    .set("sort", solrParam.getSort().equals("") ? "" : solrParam.getSort())
                    .set("fl", solrParam.getFl().equals("") ? "" : solrParam.getFl());
            params.setStart(solrParam.getStart() == 0 ? 0 : solrParam.getStart());
            params.setRows(solrParam.getRow() == 0 ? 10 : solrParam.getRow());

            if (solrParam.isHighlight()){
                params.setHighlight(true);
                params.addHighlightField(solrParam.getHighlightField().equals("")? "" : solrParam.getHighlightField());
                params.setHighlightSimplePre(solrParam.getHightlightSimplePre().equals("") ? "" : solrParam.getHightlightSimplePre());
                params.setHighlightSimplePost(solrParam.getHighlightSimplePost().equals("") ? "" : solrParam.getHighlightSimplePost());
            }
            //todo valid query
            QueryResponse queryResponse = solrClient.query(params);
            SolrDocumentList results = queryResponse.getResults();

            long numFound = results.getNumFound();
            if (numFound == 0){
                log.info("Query return 0 entity.");
                return RespBean.success("Query not found entity.");
            }
            return RespBean.success(queryResponse.getBeans(SolrProduct.class));
        }catch (Exception e){
            log.info("Input data has error, double check the data resource", e);
        }
        return RespBean.error("Input data has error, double check the data resource.");
    }
}
