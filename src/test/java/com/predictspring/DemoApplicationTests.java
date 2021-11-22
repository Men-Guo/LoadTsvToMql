package com.predictspring;

import com.predictspring.controller.SolrSearchController;
import com.predictspring.mapper.ProductMapper;
import com.predictspring.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    SolrSearchController solrSearchController;

    @Autowired
    ProductService productService;

    @Autowired
    ProductMapper productMapper;

    @Test
    void serivedLoadProductFromFileTest() {
        productService.loadProductFromFile("E:/Product_feed.tsv");
    }

    //Product Service test
    @Test
    void addProductServiceSucessTest(){

    }

    @Test
    void addProductServiceFailedTest(){

    }

    @Test
    void loadProductFromFileByEmptyPath(){

    }

    @Test
    void loadProductFromFileByWrongPath(){

    }

    @Test
    void loadProductFromFileByPathSucess(){

    }

    @Test
    void convertStringToProductSuccess(){

    }

    @Test
    void convertStringToProductFail(){

    }

    //Product Mapper test
    @Test
    void productMapperInsertMethedSucessTest(){

    }

    @Test
    void productMapperInsertMethedFailedTest(){

    }

    @Test
    void productMapperInsertSelectiveMethodSucessTest(){

    }

    @Test
    void productMapperInsertSelectiveMethodFailedTest(){

    }

    @Test
    void testDeleteAllDocmentFromSolrTest(){
        solrSearchController.deleteAll();
    }

    //validator
    @Test
    void testValidatePriceSuccess(){

    }

    @Test
    void testValidatePriceEmpty(){

    }

    @Test
    void testValidatePriceNull(){

    }

    @Test
    void testValidateInputStringSucess(){

    }

    @Test
    void testValidateInputStringfail(){

    }


}
