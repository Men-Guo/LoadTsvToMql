package com.predictspring.mapper;

import com.predictspring.entity.Product;
import com.predictspring.entity.ProductExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * The interface of ProductMapper
 * with two method:
 * 1. insert: insert a full product
 * 2. insert: insert a product that may have some variable that missing.
 */
@Mapper
public interface ProductMapper {
    int insert(Product record);
    int insertSelective(Product record);
}