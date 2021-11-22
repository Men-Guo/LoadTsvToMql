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

    /**
     * API: /product/filepath?path=...
     * From web input the path value where the file location is.
     * @param path - String
     * @return RespBean success/failed
     */
    @RequestMapping("filepath")
    public RespBean loadProductDataFromAFile(@RequestParam(value = "path") String path){
        return productService.loadProductFromFile(path);
    }
}
