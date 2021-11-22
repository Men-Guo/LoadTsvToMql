package com.predictspring.validator;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ProductValidator {

    /**
     * Validate the input data is valid or not
     * @param data - A string that separated by \\t
     * @return String[] tokens
     */
    public String[] validateInputString(String data){
        String[] tokens = data.split("\\t");
        if (tokens.length > 0){
            return tokens;
        }
        else
            return null;
    }

    /**
     * Remove duplicated price, only return first price.
     * @param price
     * @return BigDecimal price.
     */
    public BigDecimal validatePrice(String price){
        // price int but have more than one sale price.
        if (price == null || price.equals("")) return new BigDecimal(-1);
        if (price.indexOf(',') != -1) price = price.substring(0 ,price.indexOf(','));
        return new BigDecimal(price);
    }
}
