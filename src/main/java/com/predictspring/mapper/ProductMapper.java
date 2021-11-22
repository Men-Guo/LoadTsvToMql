package com.predictspring.mapper;

import com.predictspring.entity.Product;
import com.predictspring.entity.ProductExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductMapper {
    int insert(Product record);
    int insertSelective(Product record);
}