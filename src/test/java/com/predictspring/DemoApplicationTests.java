package com.predictspring;

import com.predictspring.controller.SolarSearchController;
import com.predictspring.mapper.ProductMapper;
import com.predictspring.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    SolarSearchController solarSearchController;

    @Autowired
    ProductService productService;

    @Autowired
    ProductMapper productMapper;

    @Test
    void serivedLoadProductFromFile() {
        productService.loadProductFromFile("E:/Product_feed.tsv");
    }

    @Test
    void testDeleteAllDocmentFromSolr(){
        solarSearchController.deleteAll();
    }
}
