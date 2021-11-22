package com.predictspring;

import com.predictspring.controller.SolrSearchController;
import com.predictspring.entity.Product;
import com.predictspring.mapper.ProductMapper;
import com.predictspring.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        Product product = new Product();
        product.setProductID("666666");
        int result = productService.addProduct(product);
        assertEquals(1, result);
    }

    @Test
    void addProductServiceFailedTest(){
        Product product = new Product();
        product.setProductID(null);
        int result = productService.addProduct(product);
        assertEquals(0, result);
    }

    @Test
    void convertStringToProductSuccess(){

    }

    @Test
    void convertStringToProductFail(){
        //todo
    }

    //Product Mapper test
    @Test
    void productMapperInsertMethedSucessTest(){
        //todo
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
