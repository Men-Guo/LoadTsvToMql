package com.predictspring.controller;

import com.predictspring.service.ProductService;
import com.predictspring.vo.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class LoadProductData{
    @Autowired
    ProductService productService;

    @RequestMapping("filepath")
    public RespBean loadProductDataFromAFile(@RequestParam(value = "path") String path){
        return productService.loadProductFromFile(path);
    }
}
