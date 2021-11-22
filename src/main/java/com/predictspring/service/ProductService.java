package com.predictspring.service;

import com.predictspring.entity.Product;
import com.predictspring.vo.RespBean;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    int addProduct(Product product);
    RespBean loadProductFromFile(String path);
    Product convertStringToProduct(String line);
}
