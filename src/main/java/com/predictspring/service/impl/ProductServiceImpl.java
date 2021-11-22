package com.predictspring.service.impl;

import com.predictspring.entity.Product;
import com.predictspring.mapper.ProductMapper;
import com.predictspring.service.ProductService;
import com.predictspring.validator.ProductValidator;
import com.predictspring.vo.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.*;

@Service
@Configuration
@Slf4j
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductValidator productValidator;

    @Resource
    ProductMapper productMapper;

    @Override
    public int addProduct(Product product) {
        try {
            return productMapper.insertSelective(product);
        } catch (Exception e){
            log.info(e.getMessage(), product.toString());
        }
        return 0;
    }

    @Override
    @Transactional
    public RespBean loadProductFromFile(String path) {
        FileReader file = null;
        try{
            file = new FileReader(path);
            BufferedReader br = new BufferedReader(file);
            br.readLine();
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.equals("")) continue;
                Product product = convertStringToProduct(line);
                if (product != null && !product.getProductID().equals("")) {
                    if (addProduct(product) == 0)
                        log.info("failed to add data with:" + product.toString());
                }
            }
            return RespBean.success("Done, adding all data into Mysql from " + path);
        }
        catch (FileNotFoundException e) {
            log.info(e.getMessage());
        }catch (IOException e){
            log.info("Error in loading table from path", e);
        }catch (Exception e){
            log.info("Error in add data from line of data",e);
        }finally {
            if (file != null){
                try{
                    file.close();
                } catch (IOException e) {
                    log.info(e.getMessage());
                }
            }
        }
        return RespBean.error("failed adding data from " + path);
    }


    public Product convertStringToProduct(String line){

        //Validate line data
        String[] tokens = productValidator.validateInputString(line);
        Product product = new Product();
        if (tokens == null){
            log.info("Error in input data at file", line);
            return null;
        }
        product.setProductID(tokens[0]); // skuID
        product.setName(tokens[22]); //title
        product.setDescription(tokens[24]); //prod_description
        product.setMerchantCategory(tokens[41]); //product category
        product.setGoogleCategory(tokens[41]);
        product.setProductURL(tokens[23]);
        product.setImageURL(tokens[1]);
        product.setAdditionalImageURL(tokens[2]);
        product.setProductCondition("NEW");
        product.setPrice(productValidator.validatePrice(tokens[17]));
        product.setSalesPrice(productValidator.validatePrice(tokens[18]));
        product.setBrand(null);
        product.setManufacturer(tokens[16]);
        product.setManufacturerDetails(null);
        product.setManufacturerLocation(null);
        product.setGTIN(null);
        product.setMPN(null);
        product.setAgeRangeHigh(null);
        product.setAgeRangeLow(null);
        product.setVariantGroupID(tokens[4]);
        product.setColor(tokens[5]);
        product.setSize(tokens[8]);
        product.setMaterial(tokens[32]);
        product.setPattern(tokens[33]);
        product.setShipping(null);
        product.setShippingWeight(null);
        product.setBundle(null);
        product.setMerchantSKU(null);
        product.setTopSellerRank(null);
        product.setTax(tokens[15]);
        product.setChannelApplicability("ALL");
        product.setInternalProductID(tokens[4]);
        product.setPromotionID(tokens[40]);
        product.setIsDefaultVariant(true);
        product.setProcessingTime(null);
        product.setCustomization(null);
        product.setLastUpdate(null);
        product.setActive(!tokens[25].equals(""));
        product.setAgeGroup(null);
        product.setAvailability(null);
        product.setCurrencyCode(tokens[20]);
        product.setPromotionTitle(tokens[39]);
        if (product.getSalesPrice().equals(-1)) {
            product.setPromotionEnd(null);
            product.setPromotionStart(null);
            product.setIsOnSale(false);
            product.setSalePriceStart(null);
            product.setSalePriceEnd(null);
        }else {
            //since no variables contains information, remains
            product.setPromotionEnd(null);
            product.setPromotionStart(null);
            product.setIsOnSale(false);
            product.setSalePriceStart(null);
            product.setSalePriceEnd(null);
        }
        product.setColorSwatchUrl(null);
        product.setProductLocation(null);
        product.setSizeGuideURL(null);
        product.setSearchImageURL(null);
        return product;
    }

}
