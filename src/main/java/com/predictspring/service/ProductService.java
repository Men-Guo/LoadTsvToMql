package com.predictspring.service;

import com.predictspring.entity.Product;
import com.predictspring.vo.RespBean;
import org.springframework.stereotype.Service;

/**
 * ProductService interface
 * There are three method:
 * 1. call mapper that add data into database
 * 2. Load product data from a path into database
 * 3. Cover each line of file to product entity
 */
@Service
public interface ProductService {
    int addProduct(Product product);
    RespBean loadProductFromFile(String path);
    Product convertStringToProduct(String line);
}
