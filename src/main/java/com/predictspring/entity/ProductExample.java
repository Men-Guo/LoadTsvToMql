package com.predictspring.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ProductExample class from mybatis auto generator
 */
public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProductIDIsNull() {
            addCriterion("ProductID is null");
            return (Criteria) this;
        }

        public Criteria andProductIDIsNotNull() {
            addCriterion("ProductID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIDEqualTo(String value) {
            addCriterion("ProductID =", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDNotEqualTo(String value) {
            addCriterion("ProductID <>", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDGreaterThan(String value) {
            addCriterion("ProductID >", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDGreaterThanOrEqualTo(String value) {
            addCriterion("ProductID >=", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDLessThan(String value) {
            addCriterion("ProductID <", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDLessThanOrEqualTo(String value) {
            addCriterion("ProductID <=", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDLike(String value) {
            addCriterion("ProductID like", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDNotLike(String value) {
            addCriterion("ProductID not like", value, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDIn(List<String> values) {
            addCriterion("ProductID in", values, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDNotIn(List<String> values) {
            addCriterion("ProductID not in", values, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDBetween(String value1, String value2) {
            addCriterion("ProductID between", value1, value2, "productID");
            return (Criteria) this;
        }

        public Criteria andProductIDNotBetween(String value1, String value2) {
            addCriterion("ProductID not between", value1, value2, "productID");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGoogleCategoryIsNull() {
            addCriterion("GoogleCategory is null");
            return (Criteria) this;
        }

        public Criteria andGoogleCategoryIsNotNull() {
            addCriterion("GoogleCategory is not null");
            return (Criteria) this;
        }

        public Criteria andGoogleCategoryEqualTo(String value) {
            addCriterion("GoogleCategory =", value, "googleCategory");
            return (Criteria) this;
        }

        public Criteria andGoogleCategoryNotEqualTo(String value) {
            addCriterion("GoogleCategory <>", value, "googleCategory");
            return (Criteria) this;
        }

        public Criteria andGoogleCategoryGreaterThan(String value) {
            addCriterion("GoogleCategory >", value, "googleCategory");
            return (Criteria) this;
        }

        public Criteria andGoogleCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("GoogleCategory >=", value, "googleCategory");
            return (Criteria) this;
        }

        public Criteria andGoogleCategoryLessThan(String value) {
            addCriterion("GoogleCategory <", value, "googleCategory");
            return (Criteria) this;
        }

        public Criteria andGoogleCategoryLessThanOrEqualTo(String value) {
            addCriterion("GoogleCategory <=", value, "googleCategory");
            return (Criteria) this;
        }

        public Criteria andGoogleCategoryLike(String value) {
            addCriterion("GoogleCategory like", value, "googleCategory");
            return (Criteria) this;
        }

        public Criteria andGoogleCategoryNotLike(String value) {
            addCriterion("GoogleCategory not like", value, "googleCategory");
            return (Criteria) this;
        }

        public Criteria andGoogleCategoryIn(List<String> values) {
            addCriterion("GoogleCategory in", values, "googleCategory");
            return (Criteria) this;
        }

        public Criteria andGoogleCategoryNotIn(List<String> values) {
            addCriterion("GoogleCategory not in", values, "googleCategory");
            return (Criteria) this;
        }

        public Criteria andGoogleCategoryBetween(String value1, String value2) {
            addCriterion("GoogleCategory between", value1, value2, "googleCategory");
            return (Criteria) this;
        }

        public Criteria andGoogleCategoryNotBetween(String value1, String value2) {
            addCriterion("GoogleCategory not between", value1, value2, "googleCategory");
            return (Criteria) this;
        }

        public Criteria andProductURLIsNull() {
            addCriterion("ProductURL is null");
            return (Criteria) this;
        }

        public Criteria andProductURLIsNotNull() {
            addCriterion("ProductURL is not null");
            return (Criteria) this;
        }

        public Criteria andProductURLEqualTo(String value) {
            addCriterion("ProductURL =", value, "productURL");
            return (Criteria) this;
        }

        public Criteria andProductURLNotEqualTo(String value) {
            addCriterion("ProductURL <>", value, "productURL");
            return (Criteria) this;
        }

        public Criteria andProductURLGreaterThan(String value) {
            addCriterion("ProductURL >", value, "productURL");
            return (Criteria) this;
        }

        public Criteria andProductURLGreaterThanOrEqualTo(String value) {
            addCriterion("ProductURL >=", value, "productURL");
            return (Criteria) this;
        }

        public Criteria andProductURLLessThan(String value) {
            addCriterion("ProductURL <", value, "productURL");
            return (Criteria) this;
        }

        public Criteria andProductURLLessThanOrEqualTo(String value) {
            addCriterion("ProductURL <=", value, "productURL");
            return (Criteria) this;
        }

        public Criteria andProductURLLike(String value) {
            addCriterion("ProductURL like", value, "productURL");
            return (Criteria) this;
        }

        public Criteria andProductURLNotLike(String value) {
            addCriterion("ProductURL not like", value, "productURL");
            return (Criteria) this;
        }

        public Criteria andProductURLIn(List<String> values) {
            addCriterion("ProductURL in", values, "productURL");
            return (Criteria) this;
        }

        public Criteria andProductURLNotIn(List<String> values) {
            addCriterion("ProductURL not in", values, "productURL");
            return (Criteria) this;
        }

        public Criteria andProductURLBetween(String value1, String value2) {
            addCriterion("ProductURL between", value1, value2, "productURL");
            return (Criteria) this;
        }

        public Criteria andProductURLNotBetween(String value1, String value2) {
            addCriterion("ProductURL not between", value1, value2, "productURL");
            return (Criteria) this;
        }

        public Criteria andImageURLIsNull() {
            addCriterion("ImageURL is null");
            return (Criteria) this;
        }

        public Criteria andImageURLIsNotNull() {
            addCriterion("ImageURL is not null");
            return (Criteria) this;
        }

        public Criteria andImageURLEqualTo(String value) {
            addCriterion("ImageURL =", value, "imageURL");
            return (Criteria) this;
        }

        public Criteria andImageURLNotEqualTo(String value) {
            addCriterion("ImageURL <>", value, "imageURL");
            return (Criteria) this;
        }

        public Criteria andImageURLGreaterThan(String value) {
            addCriterion("ImageURL >", value, "imageURL");
            return (Criteria) this;
        }

        public Criteria andImageURLGreaterThanOrEqualTo(String value) {
            addCriterion("ImageURL >=", value, "imageURL");
            return (Criteria) this;
        }

        public Criteria andImageURLLessThan(String value) {
            addCriterion("ImageURL <", value, "imageURL");
            return (Criteria) this;
        }

        public Criteria andImageURLLessThanOrEqualTo(String value) {
            addCriterion("ImageURL <=", value, "imageURL");
            return (Criteria) this;
        }

        public Criteria andImageURLLike(String value) {
            addCriterion("ImageURL like", value, "imageURL");
            return (Criteria) this;
        }

        public Criteria andImageURLNotLike(String value) {
            addCriterion("ImageURL not like", value, "imageURL");
            return (Criteria) this;
        }

        public Criteria andImageURLIn(List<String> values) {
            addCriterion("ImageURL in", values, "imageURL");
            return (Criteria) this;
        }

        public Criteria andImageURLNotIn(List<String> values) {
            addCriterion("ImageURL not in", values, "imageURL");
            return (Criteria) this;
        }

        public Criteria andImageURLBetween(String value1, String value2) {
            addCriterion("ImageURL between", value1, value2, "imageURL");
            return (Criteria) this;
        }

        public Criteria andImageURLNotBetween(String value1, String value2) {
            addCriterion("ImageURL not between", value1, value2, "imageURL");
            return (Criteria) this;
        }

        public Criteria andAdditionalImageURLIsNull() {
            addCriterion("AdditionalImageURL is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalImageURLIsNotNull() {
            addCriterion("AdditionalImageURL is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalImageURLEqualTo(String value) {
            addCriterion("AdditionalImageURL =", value, "additionalImageURL");
            return (Criteria) this;
        }

        public Criteria andAdditionalImageURLNotEqualTo(String value) {
            addCriterion("AdditionalImageURL <>", value, "additionalImageURL");
            return (Criteria) this;
        }

        public Criteria andAdditionalImageURLGreaterThan(String value) {
            addCriterion("AdditionalImageURL >", value, "additionalImageURL");
            return (Criteria) this;
        }

        public Criteria andAdditionalImageURLGreaterThanOrEqualTo(String value) {
            addCriterion("AdditionalImageURL >=", value, "additionalImageURL");
            return (Criteria) this;
        }

        public Criteria andAdditionalImageURLLessThan(String value) {
            addCriterion("AdditionalImageURL <", value, "additionalImageURL");
            return (Criteria) this;
        }

        public Criteria andAdditionalImageURLLessThanOrEqualTo(String value) {
            addCriterion("AdditionalImageURL <=", value, "additionalImageURL");
            return (Criteria) this;
        }

        public Criteria andAdditionalImageURLLike(String value) {
            addCriterion("AdditionalImageURL like", value, "additionalImageURL");
            return (Criteria) this;
        }

        public Criteria andAdditionalImageURLNotLike(String value) {
            addCriterion("AdditionalImageURL not like", value, "additionalImageURL");
            return (Criteria) this;
        }

        public Criteria andAdditionalImageURLIn(List<String> values) {
            addCriterion("AdditionalImageURL in", values, "additionalImageURL");
            return (Criteria) this;
        }

        public Criteria andAdditionalImageURLNotIn(List<String> values) {
            addCriterion("AdditionalImageURL not in", values, "additionalImageURL");
            return (Criteria) this;
        }

        public Criteria andAdditionalImageURLBetween(String value1, String value2) {
            addCriterion("AdditionalImageURL between", value1, value2, "additionalImageURL");
            return (Criteria) this;
        }

        public Criteria andAdditionalImageURLNotBetween(String value1, String value2) {
            addCriterion("AdditionalImageURL not between", value1, value2, "additionalImageURL");
            return (Criteria) this;
        }

        public Criteria andProductConditionIsNull() {
            addCriterion("ProductCondition is null");
            return (Criteria) this;
        }

        public Criteria andProductConditionIsNotNull() {
            addCriterion("ProductCondition is not null");
            return (Criteria) this;
        }

        public Criteria andProductConditionEqualTo(String value) {
            addCriterion("ProductCondition =", value, "productCondition");
            return (Criteria) this;
        }

        public Criteria andProductConditionNotEqualTo(String value) {
            addCriterion("ProductCondition <>", value, "productCondition");
            return (Criteria) this;
        }

        public Criteria andProductConditionGreaterThan(String value) {
            addCriterion("ProductCondition >", value, "productCondition");
            return (Criteria) this;
        }

        public Criteria andProductConditionGreaterThanOrEqualTo(String value) {
            addCriterion("ProductCondition >=", value, "productCondition");
            return (Criteria) this;
        }

        public Criteria andProductConditionLessThan(String value) {
            addCriterion("ProductCondition <", value, "productCondition");
            return (Criteria) this;
        }

        public Criteria andProductConditionLessThanOrEqualTo(String value) {
            addCriterion("ProductCondition <=", value, "productCondition");
            return (Criteria) this;
        }

        public Criteria andProductConditionLike(String value) {
            addCriterion("ProductCondition like", value, "productCondition");
            return (Criteria) this;
        }

        public Criteria andProductConditionNotLike(String value) {
            addCriterion("ProductCondition not like", value, "productCondition");
            return (Criteria) this;
        }

        public Criteria andProductConditionIn(List<String> values) {
            addCriterion("ProductCondition in", values, "productCondition");
            return (Criteria) this;
        }

        public Criteria andProductConditionNotIn(List<String> values) {
            addCriterion("ProductCondition not in", values, "productCondition");
            return (Criteria) this;
        }

        public Criteria andProductConditionBetween(String value1, String value2) {
            addCriterion("ProductCondition between", value1, value2, "productCondition");
            return (Criteria) this;
        }

        public Criteria andProductConditionNotBetween(String value1, String value2) {
            addCriterion("ProductCondition not between", value1, value2, "productCondition");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIsNull() {
            addCriterion("SalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIsNotNull() {
            addCriterion("SalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPriceEqualTo(BigDecimal value) {
            addCriterion("SalesPrice =", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotEqualTo(BigDecimal value) {
            addCriterion("SalesPrice <>", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceGreaterThan(BigDecimal value) {
            addCriterion("SalesPrice >", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice >=", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceLessThan(BigDecimal value) {
            addCriterion("SalesPrice <", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SalesPrice <=", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIn(List<BigDecimal> values) {
            addCriterion("SalesPrice in", values, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotIn(List<BigDecimal> values) {
            addCriterion("SalesPrice not in", values, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice between", value1, value2, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SalesPrice not between", value1, value2, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("Brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("Brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("Brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("Brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("Brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("Brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("Brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("Brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("Brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("Brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("Brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("Brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("Brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("Brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("Manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("Manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("Manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("Manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("Manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("Manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("Manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("Manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("Manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("Manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("Manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("Manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("Manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("Manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLocationIsNull() {
            addCriterion("ManufacturerLocation is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerLocationIsNotNull() {
            addCriterion("ManufacturerLocation is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerLocationEqualTo(String value) {
            addCriterion("ManufacturerLocation =", value, "manufacturerLocation");
            return (Criteria) this;
        }

        public Criteria andManufacturerLocationNotEqualTo(String value) {
            addCriterion("ManufacturerLocation <>", value, "manufacturerLocation");
            return (Criteria) this;
        }

        public Criteria andManufacturerLocationGreaterThan(String value) {
            addCriterion("ManufacturerLocation >", value, "manufacturerLocation");
            return (Criteria) this;
        }

        public Criteria andManufacturerLocationGreaterThanOrEqualTo(String value) {
            addCriterion("ManufacturerLocation >=", value, "manufacturerLocation");
            return (Criteria) this;
        }

        public Criteria andManufacturerLocationLessThan(String value) {
            addCriterion("ManufacturerLocation <", value, "manufacturerLocation");
            return (Criteria) this;
        }

        public Criteria andManufacturerLocationLessThanOrEqualTo(String value) {
            addCriterion("ManufacturerLocation <=", value, "manufacturerLocation");
            return (Criteria) this;
        }

        public Criteria andManufacturerLocationLike(String value) {
            addCriterion("ManufacturerLocation like", value, "manufacturerLocation");
            return (Criteria) this;
        }

        public Criteria andManufacturerLocationNotLike(String value) {
            addCriterion("ManufacturerLocation not like", value, "manufacturerLocation");
            return (Criteria) this;
        }

        public Criteria andManufacturerLocationIn(List<String> values) {
            addCriterion("ManufacturerLocation in", values, "manufacturerLocation");
            return (Criteria) this;
        }

        public Criteria andManufacturerLocationNotIn(List<String> values) {
            addCriterion("ManufacturerLocation not in", values, "manufacturerLocation");
            return (Criteria) this;
        }

        public Criteria andManufacturerLocationBetween(String value1, String value2) {
            addCriterion("ManufacturerLocation between", value1, value2, "manufacturerLocation");
            return (Criteria) this;
        }

        public Criteria andManufacturerLocationNotBetween(String value1, String value2) {
            addCriterion("ManufacturerLocation not between", value1, value2, "manufacturerLocation");
            return (Criteria) this;
        }

        public Criteria andGTINIsNull() {
            addCriterion("GTIN is null");
            return (Criteria) this;
        }

        public Criteria andGTINIsNotNull() {
            addCriterion("GTIN is not null");
            return (Criteria) this;
        }

        public Criteria andGTINEqualTo(String value) {
            addCriterion("GTIN =", value, "GTIN");
            return (Criteria) this;
        }

        public Criteria andGTINNotEqualTo(String value) {
            addCriterion("GTIN <>", value, "GTIN");
            return (Criteria) this;
        }

        public Criteria andGTINGreaterThan(String value) {
            addCriterion("GTIN >", value, "GTIN");
            return (Criteria) this;
        }

        public Criteria andGTINGreaterThanOrEqualTo(String value) {
            addCriterion("GTIN >=", value, "GTIN");
            return (Criteria) this;
        }

        public Criteria andGTINLessThan(String value) {
            addCriterion("GTIN <", value, "GTIN");
            return (Criteria) this;
        }

        public Criteria andGTINLessThanOrEqualTo(String value) {
            addCriterion("GTIN <=", value, "GTIN");
            return (Criteria) this;
        }

        public Criteria andGTINLike(String value) {
            addCriterion("GTIN like", value, "GTIN");
            return (Criteria) this;
        }

        public Criteria andGTINNotLike(String value) {
            addCriterion("GTIN not like", value, "GTIN");
            return (Criteria) this;
        }

        public Criteria andGTINIn(List<String> values) {
            addCriterion("GTIN in", values, "GTIN");
            return (Criteria) this;
        }

        public Criteria andGTINNotIn(List<String> values) {
            addCriterion("GTIN not in", values, "GTIN");
            return (Criteria) this;
        }

        public Criteria andGTINBetween(String value1, String value2) {
            addCriterion("GTIN between", value1, value2, "GTIN");
            return (Criteria) this;
        }

        public Criteria andGTINNotBetween(String value1, String value2) {
            addCriterion("GTIN not between", value1, value2, "GTIN");
            return (Criteria) this;
        }

        public Criteria andMPNIsNull() {
            addCriterion("MPN is null");
            return (Criteria) this;
        }

        public Criteria andMPNIsNotNull() {
            addCriterion("MPN is not null");
            return (Criteria) this;
        }

        public Criteria andMPNEqualTo(String value) {
            addCriterion("MPN =", value, "MPN");
            return (Criteria) this;
        }

        public Criteria andMPNNotEqualTo(String value) {
            addCriterion("MPN <>", value, "MPN");
            return (Criteria) this;
        }

        public Criteria andMPNGreaterThan(String value) {
            addCriterion("MPN >", value, "MPN");
            return (Criteria) this;
        }

        public Criteria andMPNGreaterThanOrEqualTo(String value) {
            addCriterion("MPN >=", value, "MPN");
            return (Criteria) this;
        }

        public Criteria andMPNLessThan(String value) {
            addCriterion("MPN <", value, "MPN");
            return (Criteria) this;
        }

        public Criteria andMPNLessThanOrEqualTo(String value) {
            addCriterion("MPN <=", value, "MPN");
            return (Criteria) this;
        }

        public Criteria andMPNLike(String value) {
            addCriterion("MPN like", value, "MPN");
            return (Criteria) this;
        }

        public Criteria andMPNNotLike(String value) {
            addCriterion("MPN not like", value, "MPN");
            return (Criteria) this;
        }

        public Criteria andMPNIn(List<String> values) {
            addCriterion("MPN in", values, "MPN");
            return (Criteria) this;
        }

        public Criteria andMPNNotIn(List<String> values) {
            addCriterion("MPN not in", values, "MPN");
            return (Criteria) this;
        }

        public Criteria andMPNBetween(String value1, String value2) {
            addCriterion("MPN between", value1, value2, "MPN");
            return (Criteria) this;
        }

        public Criteria andMPNNotBetween(String value1, String value2) {
            addCriterion("MPN not between", value1, value2, "MPN");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("Gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("Gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("Gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("Gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("Gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("Gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("Gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("Gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("Gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("Gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("Gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("Gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("Gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("Gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeRangeLowIsNull() {
            addCriterion("AgeRangeLow is null");
            return (Criteria) this;
        }

        public Criteria andAgeRangeLowIsNotNull() {
            addCriterion("AgeRangeLow is not null");
            return (Criteria) this;
        }

        public Criteria andAgeRangeLowEqualTo(Integer value) {
            addCriterion("AgeRangeLow =", value, "ageRangeLow");
            return (Criteria) this;
        }

        public Criteria andAgeRangeLowNotEqualTo(Integer value) {
            addCriterion("AgeRangeLow <>", value, "ageRangeLow");
            return (Criteria) this;
        }

        public Criteria andAgeRangeLowGreaterThan(Integer value) {
            addCriterion("AgeRangeLow >", value, "ageRangeLow");
            return (Criteria) this;
        }

        public Criteria andAgeRangeLowGreaterThanOrEqualTo(Integer value) {
            addCriterion("AgeRangeLow >=", value, "ageRangeLow");
            return (Criteria) this;
        }

        public Criteria andAgeRangeLowLessThan(Integer value) {
            addCriterion("AgeRangeLow <", value, "ageRangeLow");
            return (Criteria) this;
        }

        public Criteria andAgeRangeLowLessThanOrEqualTo(Integer value) {
            addCriterion("AgeRangeLow <=", value, "ageRangeLow");
            return (Criteria) this;
        }

        public Criteria andAgeRangeLowIn(List<Integer> values) {
            addCriterion("AgeRangeLow in", values, "ageRangeLow");
            return (Criteria) this;
        }

        public Criteria andAgeRangeLowNotIn(List<Integer> values) {
            addCriterion("AgeRangeLow not in", values, "ageRangeLow");
            return (Criteria) this;
        }

        public Criteria andAgeRangeLowBetween(Integer value1, Integer value2) {
            addCriterion("AgeRangeLow between", value1, value2, "ageRangeLow");
            return (Criteria) this;
        }

        public Criteria andAgeRangeLowNotBetween(Integer value1, Integer value2) {
            addCriterion("AgeRangeLow not between", value1, value2, "ageRangeLow");
            return (Criteria) this;
        }

        public Criteria andAgeRangeHighIsNull() {
            addCriterion("AgeRangeHigh is null");
            return (Criteria) this;
        }

        public Criteria andAgeRangeHighIsNotNull() {
            addCriterion("AgeRangeHigh is not null");
            return (Criteria) this;
        }

        public Criteria andAgeRangeHighEqualTo(Integer value) {
            addCriterion("AgeRangeHigh =", value, "ageRangeHigh");
            return (Criteria) this;
        }

        public Criteria andAgeRangeHighNotEqualTo(Integer value) {
            addCriterion("AgeRangeHigh <>", value, "ageRangeHigh");
            return (Criteria) this;
        }

        public Criteria andAgeRangeHighGreaterThan(Integer value) {
            addCriterion("AgeRangeHigh >", value, "ageRangeHigh");
            return (Criteria) this;
        }

        public Criteria andAgeRangeHighGreaterThanOrEqualTo(Integer value) {
            addCriterion("AgeRangeHigh >=", value, "ageRangeHigh");
            return (Criteria) this;
        }

        public Criteria andAgeRangeHighLessThan(Integer value) {
            addCriterion("AgeRangeHigh <", value, "ageRangeHigh");
            return (Criteria) this;
        }

        public Criteria andAgeRangeHighLessThanOrEqualTo(Integer value) {
            addCriterion("AgeRangeHigh <=", value, "ageRangeHigh");
            return (Criteria) this;
        }

        public Criteria andAgeRangeHighIn(List<Integer> values) {
            addCriterion("AgeRangeHigh in", values, "ageRangeHigh");
            return (Criteria) this;
        }

        public Criteria andAgeRangeHighNotIn(List<Integer> values) {
            addCriterion("AgeRangeHigh not in", values, "ageRangeHigh");
            return (Criteria) this;
        }

        public Criteria andAgeRangeHighBetween(Integer value1, Integer value2) {
            addCriterion("AgeRangeHigh between", value1, value2, "ageRangeHigh");
            return (Criteria) this;
        }

        public Criteria andAgeRangeHighNotBetween(Integer value1, Integer value2) {
            addCriterion("AgeRangeHigh not between", value1, value2, "ageRangeHigh");
            return (Criteria) this;
        }

        public Criteria andVariantGroupIDIsNull() {
            addCriterion("VariantGroupID is null");
            return (Criteria) this;
        }

        public Criteria andVariantGroupIDIsNotNull() {
            addCriterion("VariantGroupID is not null");
            return (Criteria) this;
        }

        public Criteria andVariantGroupIDEqualTo(String value) {
            addCriterion("VariantGroupID =", value, "variantGroupID");
            return (Criteria) this;
        }

        public Criteria andVariantGroupIDNotEqualTo(String value) {
            addCriterion("VariantGroupID <>", value, "variantGroupID");
            return (Criteria) this;
        }

        public Criteria andVariantGroupIDGreaterThan(String value) {
            addCriterion("VariantGroupID >", value, "variantGroupID");
            return (Criteria) this;
        }

        public Criteria andVariantGroupIDGreaterThanOrEqualTo(String value) {
            addCriterion("VariantGroupID >=", value, "variantGroupID");
            return (Criteria) this;
        }

        public Criteria andVariantGroupIDLessThan(String value) {
            addCriterion("VariantGroupID <", value, "variantGroupID");
            return (Criteria) this;
        }

        public Criteria andVariantGroupIDLessThanOrEqualTo(String value) {
            addCriterion("VariantGroupID <=", value, "variantGroupID");
            return (Criteria) this;
        }

        public Criteria andVariantGroupIDLike(String value) {
            addCriterion("VariantGroupID like", value, "variantGroupID");
            return (Criteria) this;
        }

        public Criteria andVariantGroupIDNotLike(String value) {
            addCriterion("VariantGroupID not like", value, "variantGroupID");
            return (Criteria) this;
        }

        public Criteria andVariantGroupIDIn(List<String> values) {
            addCriterion("VariantGroupID in", values, "variantGroupID");
            return (Criteria) this;
        }

        public Criteria andVariantGroupIDNotIn(List<String> values) {
            addCriterion("VariantGroupID not in", values, "variantGroupID");
            return (Criteria) this;
        }

        public Criteria andVariantGroupIDBetween(String value1, String value2) {
            addCriterion("VariantGroupID between", value1, value2, "variantGroupID");
            return (Criteria) this;
        }

        public Criteria andVariantGroupIDNotBetween(String value1, String value2) {
            addCriterion("VariantGroupID not between", value1, value2, "variantGroupID");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("Color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("Color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("Color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("Color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("Color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("Color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("Color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("Color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("Color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("Color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("Color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("Color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("Color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("Color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("Size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("Size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("Size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("Size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("Size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("Size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("Size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("Size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("Size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("Size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("Size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("Size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("Size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("Size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("Material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("Material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("Material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("Material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("Material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("Material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("Material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("Material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("Material like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("Material not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("Material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("Material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("Material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("Material not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andPatternIsNull() {
            addCriterion("Pattern is null");
            return (Criteria) this;
        }

        public Criteria andPatternIsNotNull() {
            addCriterion("Pattern is not null");
            return (Criteria) this;
        }

        public Criteria andPatternEqualTo(String value) {
            addCriterion("Pattern =", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternNotEqualTo(String value) {
            addCriterion("Pattern <>", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternGreaterThan(String value) {
            addCriterion("Pattern >", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternGreaterThanOrEqualTo(String value) {
            addCriterion("Pattern >=", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternLessThan(String value) {
            addCriterion("Pattern <", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternLessThanOrEqualTo(String value) {
            addCriterion("Pattern <=", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternLike(String value) {
            addCriterion("Pattern like", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternNotLike(String value) {
            addCriterion("Pattern not like", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternIn(List<String> values) {
            addCriterion("Pattern in", values, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternNotIn(List<String> values) {
            addCriterion("Pattern not in", values, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternBetween(String value1, String value2) {
            addCriterion("Pattern between", value1, value2, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternNotBetween(String value1, String value2) {
            addCriterion("Pattern not between", value1, value2, "pattern");
            return (Criteria) this;
        }

        public Criteria andShippingIsNull() {
            addCriterion("Shipping is null");
            return (Criteria) this;
        }

        public Criteria andShippingIsNotNull() {
            addCriterion("Shipping is not null");
            return (Criteria) this;
        }

        public Criteria andShippingEqualTo(String value) {
            addCriterion("Shipping =", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotEqualTo(String value) {
            addCriterion("Shipping <>", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingGreaterThan(String value) {
            addCriterion("Shipping >", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingGreaterThanOrEqualTo(String value) {
            addCriterion("Shipping >=", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingLessThan(String value) {
            addCriterion("Shipping <", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingLessThanOrEqualTo(String value) {
            addCriterion("Shipping <=", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingLike(String value) {
            addCriterion("Shipping like", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotLike(String value) {
            addCriterion("Shipping not like", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingIn(List<String> values) {
            addCriterion("Shipping in", values, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotIn(List<String> values) {
            addCriterion("Shipping not in", values, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingBetween(String value1, String value2) {
            addCriterion("Shipping between", value1, value2, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotBetween(String value1, String value2) {
            addCriterion("Shipping not between", value1, value2, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingWeightIsNull() {
            addCriterion("ShippingWeight is null");
            return (Criteria) this;
        }

        public Criteria andShippingWeightIsNotNull() {
            addCriterion("ShippingWeight is not null");
            return (Criteria) this;
        }

        public Criteria andShippingWeightEqualTo(String value) {
            addCriterion("ShippingWeight =", value, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightNotEqualTo(String value) {
            addCriterion("ShippingWeight <>", value, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightGreaterThan(String value) {
            addCriterion("ShippingWeight >", value, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightGreaterThanOrEqualTo(String value) {
            addCriterion("ShippingWeight >=", value, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightLessThan(String value) {
            addCriterion("ShippingWeight <", value, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightLessThanOrEqualTo(String value) {
            addCriterion("ShippingWeight <=", value, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightLike(String value) {
            addCriterion("ShippingWeight like", value, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightNotLike(String value) {
            addCriterion("ShippingWeight not like", value, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightIn(List<String> values) {
            addCriterion("ShippingWeight in", values, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightNotIn(List<String> values) {
            addCriterion("ShippingWeight not in", values, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightBetween(String value1, String value2) {
            addCriterion("ShippingWeight between", value1, value2, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andShippingWeightNotBetween(String value1, String value2) {
            addCriterion("ShippingWeight not between", value1, value2, "shippingWeight");
            return (Criteria) this;
        }

        public Criteria andBundleIsNull() {
            addCriterion("Bundle is null");
            return (Criteria) this;
        }

        public Criteria andBundleIsNotNull() {
            addCriterion("Bundle is not null");
            return (Criteria) this;
        }

        public Criteria andBundleEqualTo(String value) {
            addCriterion("Bundle =", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleNotEqualTo(String value) {
            addCriterion("Bundle <>", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleGreaterThan(String value) {
            addCriterion("Bundle >", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleGreaterThanOrEqualTo(String value) {
            addCriterion("Bundle >=", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleLessThan(String value) {
            addCriterion("Bundle <", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleLessThanOrEqualTo(String value) {
            addCriterion("Bundle <=", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleLike(String value) {
            addCriterion("Bundle like", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleNotLike(String value) {
            addCriterion("Bundle not like", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleIn(List<String> values) {
            addCriterion("Bundle in", values, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleNotIn(List<String> values) {
            addCriterion("Bundle not in", values, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleBetween(String value1, String value2) {
            addCriterion("Bundle between", value1, value2, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleNotBetween(String value1, String value2) {
            addCriterion("Bundle not between", value1, value2, "bundle");
            return (Criteria) this;
        }

        public Criteria andMerchantSKUIsNull() {
            addCriterion("MerchantSKU is null");
            return (Criteria) this;
        }

        public Criteria andMerchantSKUIsNotNull() {
            addCriterion("MerchantSKU is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantSKUEqualTo(String value) {
            addCriterion("MerchantSKU =", value, "merchantSKU");
            return (Criteria) this;
        }

        public Criteria andMerchantSKUNotEqualTo(String value) {
            addCriterion("MerchantSKU <>", value, "merchantSKU");
            return (Criteria) this;
        }

        public Criteria andMerchantSKUGreaterThan(String value) {
            addCriterion("MerchantSKU >", value, "merchantSKU");
            return (Criteria) this;
        }

        public Criteria andMerchantSKUGreaterThanOrEqualTo(String value) {
            addCriterion("MerchantSKU >=", value, "merchantSKU");
            return (Criteria) this;
        }

        public Criteria andMerchantSKULessThan(String value) {
            addCriterion("MerchantSKU <", value, "merchantSKU");
            return (Criteria) this;
        }

        public Criteria andMerchantSKULessThanOrEqualTo(String value) {
            addCriterion("MerchantSKU <=", value, "merchantSKU");
            return (Criteria) this;
        }

        public Criteria andMerchantSKULike(String value) {
            addCriterion("MerchantSKU like", value, "merchantSKU");
            return (Criteria) this;
        }

        public Criteria andMerchantSKUNotLike(String value) {
            addCriterion("MerchantSKU not like", value, "merchantSKU");
            return (Criteria) this;
        }

        public Criteria andMerchantSKUIn(List<String> values) {
            addCriterion("MerchantSKU in", values, "merchantSKU");
            return (Criteria) this;
        }

        public Criteria andMerchantSKUNotIn(List<String> values) {
            addCriterion("MerchantSKU not in", values, "merchantSKU");
            return (Criteria) this;
        }

        public Criteria andMerchantSKUBetween(String value1, String value2) {
            addCriterion("MerchantSKU between", value1, value2, "merchantSKU");
            return (Criteria) this;
        }

        public Criteria andMerchantSKUNotBetween(String value1, String value2) {
            addCriterion("MerchantSKU not between", value1, value2, "merchantSKU");
            return (Criteria) this;
        }

        public Criteria andTopSellerRankIsNull() {
            addCriterion("TopSellerRank is null");
            return (Criteria) this;
        }

        public Criteria andTopSellerRankIsNotNull() {
            addCriterion("TopSellerRank is not null");
            return (Criteria) this;
        }

        public Criteria andTopSellerRankEqualTo(Integer value) {
            addCriterion("TopSellerRank =", value, "topSellerRank");
            return (Criteria) this;
        }

        public Criteria andTopSellerRankNotEqualTo(Integer value) {
            addCriterion("TopSellerRank <>", value, "topSellerRank");
            return (Criteria) this;
        }

        public Criteria andTopSellerRankGreaterThan(Integer value) {
            addCriterion("TopSellerRank >", value, "topSellerRank");
            return (Criteria) this;
        }

        public Criteria andTopSellerRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("TopSellerRank >=", value, "topSellerRank");
            return (Criteria) this;
        }

        public Criteria andTopSellerRankLessThan(Integer value) {
            addCriterion("TopSellerRank <", value, "topSellerRank");
            return (Criteria) this;
        }

        public Criteria andTopSellerRankLessThanOrEqualTo(Integer value) {
            addCriterion("TopSellerRank <=", value, "topSellerRank");
            return (Criteria) this;
        }

        public Criteria andTopSellerRankIn(List<Integer> values) {
            addCriterion("TopSellerRank in", values, "topSellerRank");
            return (Criteria) this;
        }

        public Criteria andTopSellerRankNotIn(List<Integer> values) {
            addCriterion("TopSellerRank not in", values, "topSellerRank");
            return (Criteria) this;
        }

        public Criteria andTopSellerRankBetween(Integer value1, Integer value2) {
            addCriterion("TopSellerRank between", value1, value2, "topSellerRank");
            return (Criteria) this;
        }

        public Criteria andTopSellerRankNotBetween(Integer value1, Integer value2) {
            addCriterion("TopSellerRank not between", value1, value2, "topSellerRank");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("Tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("Tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(String value) {
            addCriterion("Tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(String value) {
            addCriterion("Tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(String value) {
            addCriterion("Tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(String value) {
            addCriterion("Tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(String value) {
            addCriterion("Tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(String value) {
            addCriterion("Tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLike(String value) {
            addCriterion("Tax like", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotLike(String value) {
            addCriterion("Tax not like", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<String> values) {
            addCriterion("Tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<String> values) {
            addCriterion("Tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(String value1, String value2) {
            addCriterion("Tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(String value1, String value2) {
            addCriterion("Tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andChannelApplicabilityIsNull() {
            addCriterion("ChannelApplicability is null");
            return (Criteria) this;
        }

        public Criteria andChannelApplicabilityIsNotNull() {
            addCriterion("ChannelApplicability is not null");
            return (Criteria) this;
        }

        public Criteria andChannelApplicabilityEqualTo(String value) {
            addCriterion("ChannelApplicability =", value, "channelApplicability");
            return (Criteria) this;
        }

        public Criteria andChannelApplicabilityNotEqualTo(String value) {
            addCriterion("ChannelApplicability <>", value, "channelApplicability");
            return (Criteria) this;
        }

        public Criteria andChannelApplicabilityGreaterThan(String value) {
            addCriterion("ChannelApplicability >", value, "channelApplicability");
            return (Criteria) this;
        }

        public Criteria andChannelApplicabilityGreaterThanOrEqualTo(String value) {
            addCriterion("ChannelApplicability >=", value, "channelApplicability");
            return (Criteria) this;
        }

        public Criteria andChannelApplicabilityLessThan(String value) {
            addCriterion("ChannelApplicability <", value, "channelApplicability");
            return (Criteria) this;
        }

        public Criteria andChannelApplicabilityLessThanOrEqualTo(String value) {
            addCriterion("ChannelApplicability <=", value, "channelApplicability");
            return (Criteria) this;
        }

        public Criteria andChannelApplicabilityLike(String value) {
            addCriterion("ChannelApplicability like", value, "channelApplicability");
            return (Criteria) this;
        }

        public Criteria andChannelApplicabilityNotLike(String value) {
            addCriterion("ChannelApplicability not like", value, "channelApplicability");
            return (Criteria) this;
        }

        public Criteria andChannelApplicabilityIn(List<String> values) {
            addCriterion("ChannelApplicability in", values, "channelApplicability");
            return (Criteria) this;
        }

        public Criteria andChannelApplicabilityNotIn(List<String> values) {
            addCriterion("ChannelApplicability not in", values, "channelApplicability");
            return (Criteria) this;
        }

        public Criteria andChannelApplicabilityBetween(String value1, String value2) {
            addCriterion("ChannelApplicability between", value1, value2, "channelApplicability");
            return (Criteria) this;
        }

        public Criteria andChannelApplicabilityNotBetween(String value1, String value2) {
            addCriterion("ChannelApplicability not between", value1, value2, "channelApplicability");
            return (Criteria) this;
        }

        public Criteria andInternalProductIDIsNull() {
            addCriterion("InternalProductID is null");
            return (Criteria) this;
        }

        public Criteria andInternalProductIDIsNotNull() {
            addCriterion("InternalProductID is not null");
            return (Criteria) this;
        }

        public Criteria andInternalProductIDEqualTo(String value) {
            addCriterion("InternalProductID =", value, "internalProductID");
            return (Criteria) this;
        }

        public Criteria andInternalProductIDNotEqualTo(String value) {
            addCriterion("InternalProductID <>", value, "internalProductID");
            return (Criteria) this;
        }

        public Criteria andInternalProductIDGreaterThan(String value) {
            addCriterion("InternalProductID >", value, "internalProductID");
            return (Criteria) this;
        }

        public Criteria andInternalProductIDGreaterThanOrEqualTo(String value) {
            addCriterion("InternalProductID >=", value, "internalProductID");
            return (Criteria) this;
        }

        public Criteria andInternalProductIDLessThan(String value) {
            addCriterion("InternalProductID <", value, "internalProductID");
            return (Criteria) this;
        }

        public Criteria andInternalProductIDLessThanOrEqualTo(String value) {
            addCriterion("InternalProductID <=", value, "internalProductID");
            return (Criteria) this;
        }

        public Criteria andInternalProductIDLike(String value) {
            addCriterion("InternalProductID like", value, "internalProductID");
            return (Criteria) this;
        }

        public Criteria andInternalProductIDNotLike(String value) {
            addCriterion("InternalProductID not like", value, "internalProductID");
            return (Criteria) this;
        }

        public Criteria andInternalProductIDIn(List<String> values) {
            addCriterion("InternalProductID in", values, "internalProductID");
            return (Criteria) this;
        }

        public Criteria andInternalProductIDNotIn(List<String> values) {
            addCriterion("InternalProductID not in", values, "internalProductID");
            return (Criteria) this;
        }

        public Criteria andInternalProductIDBetween(String value1, String value2) {
            addCriterion("InternalProductID between", value1, value2, "internalProductID");
            return (Criteria) this;
        }

        public Criteria andInternalProductIDNotBetween(String value1, String value2) {
            addCriterion("InternalProductID not between", value1, value2, "internalProductID");
            return (Criteria) this;
        }

        public Criteria andPromotionIDIsNull() {
            addCriterion("PromotionID is null");
            return (Criteria) this;
        }

        public Criteria andPromotionIDIsNotNull() {
            addCriterion("PromotionID is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionIDEqualTo(String value) {
            addCriterion("PromotionID =", value, "promotionID");
            return (Criteria) this;
        }

        public Criteria andPromotionIDNotEqualTo(String value) {
            addCriterion("PromotionID <>", value, "promotionID");
            return (Criteria) this;
        }

        public Criteria andPromotionIDGreaterThan(String value) {
            addCriterion("PromotionID >", value, "promotionID");
            return (Criteria) this;
        }

        public Criteria andPromotionIDGreaterThanOrEqualTo(String value) {
            addCriterion("PromotionID >=", value, "promotionID");
            return (Criteria) this;
        }

        public Criteria andPromotionIDLessThan(String value) {
            addCriterion("PromotionID <", value, "promotionID");
            return (Criteria) this;
        }

        public Criteria andPromotionIDLessThanOrEqualTo(String value) {
            addCriterion("PromotionID <=", value, "promotionID");
            return (Criteria) this;
        }

        public Criteria andPromotionIDLike(String value) {
            addCriterion("PromotionID like", value, "promotionID");
            return (Criteria) this;
        }

        public Criteria andPromotionIDNotLike(String value) {
            addCriterion("PromotionID not like", value, "promotionID");
            return (Criteria) this;
        }

        public Criteria andPromotionIDIn(List<String> values) {
            addCriterion("PromotionID in", values, "promotionID");
            return (Criteria) this;
        }

        public Criteria andPromotionIDNotIn(List<String> values) {
            addCriterion("PromotionID not in", values, "promotionID");
            return (Criteria) this;
        }

        public Criteria andPromotionIDBetween(String value1, String value2) {
            addCriterion("PromotionID between", value1, value2, "promotionID");
            return (Criteria) this;
        }

        public Criteria andPromotionIDNotBetween(String value1, String value2) {
            addCriterion("PromotionID not between", value1, value2, "promotionID");
            return (Criteria) this;
        }

        public Criteria andIsDefaultVariantIsNull() {
            addCriterion("IsDefaultVariant is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultVariantIsNotNull() {
            addCriterion("IsDefaultVariant is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultVariantEqualTo(Boolean value) {
            addCriterion("IsDefaultVariant =", value, "isDefaultVariant");
            return (Criteria) this;
        }

        public Criteria andIsDefaultVariantNotEqualTo(Boolean value) {
            addCriterion("IsDefaultVariant <>", value, "isDefaultVariant");
            return (Criteria) this;
        }

        public Criteria andIsDefaultVariantGreaterThan(Boolean value) {
            addCriterion("IsDefaultVariant >", value, "isDefaultVariant");
            return (Criteria) this;
        }

        public Criteria andIsDefaultVariantGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDefaultVariant >=", value, "isDefaultVariant");
            return (Criteria) this;
        }

        public Criteria andIsDefaultVariantLessThan(Boolean value) {
            addCriterion("IsDefaultVariant <", value, "isDefaultVariant");
            return (Criteria) this;
        }

        public Criteria andIsDefaultVariantLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDefaultVariant <=", value, "isDefaultVariant");
            return (Criteria) this;
        }

        public Criteria andIsDefaultVariantIn(List<Boolean> values) {
            addCriterion("IsDefaultVariant in", values, "isDefaultVariant");
            return (Criteria) this;
        }

        public Criteria andIsDefaultVariantNotIn(List<Boolean> values) {
            addCriterion("IsDefaultVariant not in", values, "isDefaultVariant");
            return (Criteria) this;
        }

        public Criteria andIsDefaultVariantBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDefaultVariant between", value1, value2, "isDefaultVariant");
            return (Criteria) this;
        }

        public Criteria andIsDefaultVariantNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDefaultVariant not between", value1, value2, "isDefaultVariant");
            return (Criteria) this;
        }

        public Criteria andProcessingTimeIsNull() {
            addCriterion("ProcessingTime is null");
            return (Criteria) this;
        }

        public Criteria andProcessingTimeIsNotNull() {
            addCriterion("ProcessingTime is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingTimeEqualTo(String value) {
            addCriterion("ProcessingTime =", value, "processingTime");
            return (Criteria) this;
        }

        public Criteria andProcessingTimeNotEqualTo(String value) {
            addCriterion("ProcessingTime <>", value, "processingTime");
            return (Criteria) this;
        }

        public Criteria andProcessingTimeGreaterThan(String value) {
            addCriterion("ProcessingTime >", value, "processingTime");
            return (Criteria) this;
        }

        public Criteria andProcessingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ProcessingTime >=", value, "processingTime");
            return (Criteria) this;
        }

        public Criteria andProcessingTimeLessThan(String value) {
            addCriterion("ProcessingTime <", value, "processingTime");
            return (Criteria) this;
        }

        public Criteria andProcessingTimeLessThanOrEqualTo(String value) {
            addCriterion("ProcessingTime <=", value, "processingTime");
            return (Criteria) this;
        }

        public Criteria andProcessingTimeLike(String value) {
            addCriterion("ProcessingTime like", value, "processingTime");
            return (Criteria) this;
        }

        public Criteria andProcessingTimeNotLike(String value) {
            addCriterion("ProcessingTime not like", value, "processingTime");
            return (Criteria) this;
        }

        public Criteria andProcessingTimeIn(List<String> values) {
            addCriterion("ProcessingTime in", values, "processingTime");
            return (Criteria) this;
        }

        public Criteria andProcessingTimeNotIn(List<String> values) {
            addCriterion("ProcessingTime not in", values, "processingTime");
            return (Criteria) this;
        }

        public Criteria andProcessingTimeBetween(String value1, String value2) {
            addCriterion("ProcessingTime between", value1, value2, "processingTime");
            return (Criteria) this;
        }

        public Criteria andProcessingTimeNotBetween(String value1, String value2) {
            addCriterion("ProcessingTime not between", value1, value2, "processingTime");
            return (Criteria) this;
        }

        public Criteria andCustomizationIsNull() {
            addCriterion("Customization is null");
            return (Criteria) this;
        }

        public Criteria andCustomizationIsNotNull() {
            addCriterion("Customization is not null");
            return (Criteria) this;
        }

        public Criteria andCustomizationEqualTo(String value) {
            addCriterion("Customization =", value, "customization");
            return (Criteria) this;
        }

        public Criteria andCustomizationNotEqualTo(String value) {
            addCriterion("Customization <>", value, "customization");
            return (Criteria) this;
        }

        public Criteria andCustomizationGreaterThan(String value) {
            addCriterion("Customization >", value, "customization");
            return (Criteria) this;
        }

        public Criteria andCustomizationGreaterThanOrEqualTo(String value) {
            addCriterion("Customization >=", value, "customization");
            return (Criteria) this;
        }

        public Criteria andCustomizationLessThan(String value) {
            addCriterion("Customization <", value, "customization");
            return (Criteria) this;
        }

        public Criteria andCustomizationLessThanOrEqualTo(String value) {
            addCriterion("Customization <=", value, "customization");
            return (Criteria) this;
        }

        public Criteria andCustomizationLike(String value) {
            addCriterion("Customization like", value, "customization");
            return (Criteria) this;
        }

        public Criteria andCustomizationNotLike(String value) {
            addCriterion("Customization not like", value, "customization");
            return (Criteria) this;
        }

        public Criteria andCustomizationIn(List<String> values) {
            addCriterion("Customization in", values, "customization");
            return (Criteria) this;
        }

        public Criteria andCustomizationNotIn(List<String> values) {
            addCriterion("Customization not in", values, "customization");
            return (Criteria) this;
        }

        public Criteria andCustomizationBetween(String value1, String value2) {
            addCriterion("Customization between", value1, value2, "customization");
            return (Criteria) this;
        }

        public Criteria andCustomizationNotBetween(String value1, String value2) {
            addCriterion("Customization not between", value1, value2, "customization");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("LastUpdate is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("LastUpdate is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Date value) {
            addCriterion("LastUpdate =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Date value) {
            addCriterion("LastUpdate <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Date value) {
            addCriterion("LastUpdate >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LastUpdate >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Date value) {
            addCriterion("LastUpdate <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
            addCriterion("LastUpdate <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Date> values) {
            addCriterion("LastUpdate in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Date> values) {
            addCriterion("LastUpdate not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Date value1, Date value2) {
            addCriterion("LastUpdate between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
            addCriterion("LastUpdate not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("Active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("Active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Byte value) {
            addCriterion("Active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Byte value) {
            addCriterion("Active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Byte value) {
            addCriterion("Active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Byte value) {
            addCriterion("Active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Byte value) {
            addCriterion("Active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Byte value) {
            addCriterion("Active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Byte> values) {
            addCriterion("Active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Byte> values) {
            addCriterion("Active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Byte value1, Byte value2) {
            addCriterion("Active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Byte value1, Byte value2) {
            addCriterion("Active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andAgeGroupIsNull() {
            addCriterion("AgeGroup is null");
            return (Criteria) this;
        }

        public Criteria andAgeGroupIsNotNull() {
            addCriterion("AgeGroup is not null");
            return (Criteria) this;
        }

        public Criteria andAgeGroupEqualTo(String value) {
            addCriterion("AgeGroup =", value, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupNotEqualTo(String value) {
            addCriterion("AgeGroup <>", value, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupGreaterThan(String value) {
            addCriterion("AgeGroup >", value, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupGreaterThanOrEqualTo(String value) {
            addCriterion("AgeGroup >=", value, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupLessThan(String value) {
            addCriterion("AgeGroup <", value, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupLessThanOrEqualTo(String value) {
            addCriterion("AgeGroup <=", value, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupLike(String value) {
            addCriterion("AgeGroup like", value, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupNotLike(String value) {
            addCriterion("AgeGroup not like", value, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupIn(List<String> values) {
            addCriterion("AgeGroup in", values, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupNotIn(List<String> values) {
            addCriterion("AgeGroup not in", values, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupBetween(String value1, String value2) {
            addCriterion("AgeGroup between", value1, value2, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAgeGroupNotBetween(String value1, String value2) {
            addCriterion("AgeGroup not between", value1, value2, "ageGroup");
            return (Criteria) this;
        }

        public Criteria andAvailabilityIsNull() {
            addCriterion("Availability is null");
            return (Criteria) this;
        }

        public Criteria andAvailabilityIsNotNull() {
            addCriterion("Availability is not null");
            return (Criteria) this;
        }

        public Criteria andAvailabilityEqualTo(String value) {
            addCriterion("Availability =", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityNotEqualTo(String value) {
            addCriterion("Availability <>", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityGreaterThan(String value) {
            addCriterion("Availability >", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityGreaterThanOrEqualTo(String value) {
            addCriterion("Availability >=", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityLessThan(String value) {
            addCriterion("Availability <", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityLessThanOrEqualTo(String value) {
            addCriterion("Availability <=", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityLike(String value) {
            addCriterion("Availability like", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityNotLike(String value) {
            addCriterion("Availability not like", value, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityIn(List<String> values) {
            addCriterion("Availability in", values, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityNotIn(List<String> values) {
            addCriterion("Availability not in", values, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityBetween(String value1, String value2) {
            addCriterion("Availability between", value1, value2, "availability");
            return (Criteria) this;
        }

        public Criteria andAvailabilityNotBetween(String value1, String value2) {
            addCriterion("Availability not between", value1, value2, "availability");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIsNull() {
            addCriterion("IsOnSale is null");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIsNotNull() {
            addCriterion("IsOnSale is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleEqualTo(Boolean value) {
            addCriterion("IsOnSale =", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotEqualTo(Boolean value) {
            addCriterion("IsOnSale <>", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleGreaterThan(Boolean value) {
            addCriterion("IsOnSale >", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsOnSale >=", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleLessThan(Boolean value) {
            addCriterion("IsOnSale <", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleLessThanOrEqualTo(Boolean value) {
            addCriterion("IsOnSale <=", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIn(List<Boolean> values) {
            addCriterion("IsOnSale in", values, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotIn(List<Boolean> values) {
            addCriterion("IsOnSale not in", values, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOnSale between", value1, value2, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsOnSale not between", value1, value2, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIsNull() {
            addCriterion("CurrencyCode is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIsNotNull() {
            addCriterion("CurrencyCode is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeEqualTo(String value) {
            addCriterion("CurrencyCode =", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotEqualTo(String value) {
            addCriterion("CurrencyCode <>", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeGreaterThan(String value) {
            addCriterion("CurrencyCode >", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CurrencyCode >=", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLessThan(String value) {
            addCriterion("CurrencyCode <", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLessThanOrEqualTo(String value) {
            addCriterion("CurrencyCode <=", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLike(String value) {
            addCriterion("CurrencyCode like", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotLike(String value) {
            addCriterion("CurrencyCode not like", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIn(List<String> values) {
            addCriterion("CurrencyCode in", values, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotIn(List<String> values) {
            addCriterion("CurrencyCode not in", values, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeBetween(String value1, String value2) {
            addCriterion("CurrencyCode between", value1, value2, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotBetween(String value1, String value2) {
            addCriterion("CurrencyCode not between", value1, value2, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andPromotionEndIsNull() {
            addCriterion("PromotionEnd is null");
            return (Criteria) this;
        }

        public Criteria andPromotionEndIsNotNull() {
            addCriterion("PromotionEnd is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionEndEqualTo(Date value) {
            addCriterion("PromotionEnd =", value, "promotionEnd");
            return (Criteria) this;
        }

        public Criteria andPromotionEndNotEqualTo(Date value) {
            addCriterion("PromotionEnd <>", value, "promotionEnd");
            return (Criteria) this;
        }

        public Criteria andPromotionEndGreaterThan(Date value) {
            addCriterion("PromotionEnd >", value, "promotionEnd");
            return (Criteria) this;
        }

        public Criteria andPromotionEndGreaterThanOrEqualTo(Date value) {
            addCriterion("PromotionEnd >=", value, "promotionEnd");
            return (Criteria) this;
        }

        public Criteria andPromotionEndLessThan(Date value) {
            addCriterion("PromotionEnd <", value, "promotionEnd");
            return (Criteria) this;
        }

        public Criteria andPromotionEndLessThanOrEqualTo(Date value) {
            addCriterion("PromotionEnd <=", value, "promotionEnd");
            return (Criteria) this;
        }

        public Criteria andPromotionEndIn(List<Date> values) {
            addCriterion("PromotionEnd in", values, "promotionEnd");
            return (Criteria) this;
        }

        public Criteria andPromotionEndNotIn(List<Date> values) {
            addCriterion("PromotionEnd not in", values, "promotionEnd");
            return (Criteria) this;
        }

        public Criteria andPromotionEndBetween(Date value1, Date value2) {
            addCriterion("PromotionEnd between", value1, value2, "promotionEnd");
            return (Criteria) this;
        }

        public Criteria andPromotionEndNotBetween(Date value1, Date value2) {
            addCriterion("PromotionEnd not between", value1, value2, "promotionEnd");
            return (Criteria) this;
        }

        public Criteria andPromotionStartIsNull() {
            addCriterion("PromotionStart is null");
            return (Criteria) this;
        }

        public Criteria andPromotionStartIsNotNull() {
            addCriterion("PromotionStart is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionStartEqualTo(Date value) {
            addCriterion("PromotionStart =", value, "promotionStart");
            return (Criteria) this;
        }

        public Criteria andPromotionStartNotEqualTo(Date value) {
            addCriterion("PromotionStart <>", value, "promotionStart");
            return (Criteria) this;
        }

        public Criteria andPromotionStartGreaterThan(Date value) {
            addCriterion("PromotionStart >", value, "promotionStart");
            return (Criteria) this;
        }

        public Criteria andPromotionStartGreaterThanOrEqualTo(Date value) {
            addCriterion("PromotionStart >=", value, "promotionStart");
            return (Criteria) this;
        }

        public Criteria andPromotionStartLessThan(Date value) {
            addCriterion("PromotionStart <", value, "promotionStart");
            return (Criteria) this;
        }

        public Criteria andPromotionStartLessThanOrEqualTo(Date value) {
            addCriterion("PromotionStart <=", value, "promotionStart");
            return (Criteria) this;
        }

        public Criteria andPromotionStartIn(List<Date> values) {
            addCriterion("PromotionStart in", values, "promotionStart");
            return (Criteria) this;
        }

        public Criteria andPromotionStartNotIn(List<Date> values) {
            addCriterion("PromotionStart not in", values, "promotionStart");
            return (Criteria) this;
        }

        public Criteria andPromotionStartBetween(Date value1, Date value2) {
            addCriterion("PromotionStart between", value1, value2, "promotionStart");
            return (Criteria) this;
        }

        public Criteria andPromotionStartNotBetween(Date value1, Date value2) {
            addCriterion("PromotionStart not between", value1, value2, "promotionStart");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleIsNull() {
            addCriterion("PromotionTitle is null");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleIsNotNull() {
            addCriterion("PromotionTitle is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleEqualTo(String value) {
            addCriterion("PromotionTitle =", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleNotEqualTo(String value) {
            addCriterion("PromotionTitle <>", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleGreaterThan(String value) {
            addCriterion("PromotionTitle >", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleGreaterThanOrEqualTo(String value) {
            addCriterion("PromotionTitle >=", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleLessThan(String value) {
            addCriterion("PromotionTitle <", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleLessThanOrEqualTo(String value) {
            addCriterion("PromotionTitle <=", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleLike(String value) {
            addCriterion("PromotionTitle like", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleNotLike(String value) {
            addCriterion("PromotionTitle not like", value, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleIn(List<String> values) {
            addCriterion("PromotionTitle in", values, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleNotIn(List<String> values) {
            addCriterion("PromotionTitle not in", values, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleBetween(String value1, String value2) {
            addCriterion("PromotionTitle between", value1, value2, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andPromotionTitleNotBetween(String value1, String value2) {
            addCriterion("PromotionTitle not between", value1, value2, "promotionTitle");
            return (Criteria) this;
        }

        public Criteria andColorSwatchUrlIsNull() {
            addCriterion("ColorSwatchUrl is null");
            return (Criteria) this;
        }

        public Criteria andColorSwatchUrlIsNotNull() {
            addCriterion("ColorSwatchUrl is not null");
            return (Criteria) this;
        }

        public Criteria andColorSwatchUrlEqualTo(String value) {
            addCriterion("ColorSwatchUrl =", value, "colorSwatchUrl");
            return (Criteria) this;
        }

        public Criteria andColorSwatchUrlNotEqualTo(String value) {
            addCriterion("ColorSwatchUrl <>", value, "colorSwatchUrl");
            return (Criteria) this;
        }

        public Criteria andColorSwatchUrlGreaterThan(String value) {
            addCriterion("ColorSwatchUrl >", value, "colorSwatchUrl");
            return (Criteria) this;
        }

        public Criteria andColorSwatchUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ColorSwatchUrl >=", value, "colorSwatchUrl");
            return (Criteria) this;
        }

        public Criteria andColorSwatchUrlLessThan(String value) {
            addCriterion("ColorSwatchUrl <", value, "colorSwatchUrl");
            return (Criteria) this;
        }

        public Criteria andColorSwatchUrlLessThanOrEqualTo(String value) {
            addCriterion("ColorSwatchUrl <=", value, "colorSwatchUrl");
            return (Criteria) this;
        }

        public Criteria andColorSwatchUrlLike(String value) {
            addCriterion("ColorSwatchUrl like", value, "colorSwatchUrl");
            return (Criteria) this;
        }

        public Criteria andColorSwatchUrlNotLike(String value) {
            addCriterion("ColorSwatchUrl not like", value, "colorSwatchUrl");
            return (Criteria) this;
        }

        public Criteria andColorSwatchUrlIn(List<String> values) {
            addCriterion("ColorSwatchUrl in", values, "colorSwatchUrl");
            return (Criteria) this;
        }

        public Criteria andColorSwatchUrlNotIn(List<String> values) {
            addCriterion("ColorSwatchUrl not in", values, "colorSwatchUrl");
            return (Criteria) this;
        }

        public Criteria andColorSwatchUrlBetween(String value1, String value2) {
            addCriterion("ColorSwatchUrl between", value1, value2, "colorSwatchUrl");
            return (Criteria) this;
        }

        public Criteria andColorSwatchUrlNotBetween(String value1, String value2) {
            addCriterion("ColorSwatchUrl not between", value1, value2, "colorSwatchUrl");
            return (Criteria) this;
        }

        public Criteria andProductLocationIsNull() {
            addCriterion("ProductLocation is null");
            return (Criteria) this;
        }

        public Criteria andProductLocationIsNotNull() {
            addCriterion("ProductLocation is not null");
            return (Criteria) this;
        }

        public Criteria andProductLocationEqualTo(String value) {
            addCriterion("ProductLocation =", value, "productLocation");
            return (Criteria) this;
        }

        public Criteria andProductLocationNotEqualTo(String value) {
            addCriterion("ProductLocation <>", value, "productLocation");
            return (Criteria) this;
        }

        public Criteria andProductLocationGreaterThan(String value) {
            addCriterion("ProductLocation >", value, "productLocation");
            return (Criteria) this;
        }

        public Criteria andProductLocationGreaterThanOrEqualTo(String value) {
            addCriterion("ProductLocation >=", value, "productLocation");
            return (Criteria) this;
        }

        public Criteria andProductLocationLessThan(String value) {
            addCriterion("ProductLocation <", value, "productLocation");
            return (Criteria) this;
        }

        public Criteria andProductLocationLessThanOrEqualTo(String value) {
            addCriterion("ProductLocation <=", value, "productLocation");
            return (Criteria) this;
        }

        public Criteria andProductLocationLike(String value) {
            addCriterion("ProductLocation like", value, "productLocation");
            return (Criteria) this;
        }

        public Criteria andProductLocationNotLike(String value) {
            addCriterion("ProductLocation not like", value, "productLocation");
            return (Criteria) this;
        }

        public Criteria andProductLocationIn(List<String> values) {
            addCriterion("ProductLocation in", values, "productLocation");
            return (Criteria) this;
        }

        public Criteria andProductLocationNotIn(List<String> values) {
            addCriterion("ProductLocation not in", values, "productLocation");
            return (Criteria) this;
        }

        public Criteria andProductLocationBetween(String value1, String value2) {
            addCriterion("ProductLocation between", value1, value2, "productLocation");
            return (Criteria) this;
        }

        public Criteria andProductLocationNotBetween(String value1, String value2) {
            addCriterion("ProductLocation not between", value1, value2, "productLocation");
            return (Criteria) this;
        }

        public Criteria andSalePriceStartIsNull() {
            addCriterion("SalePriceStart is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceStartIsNotNull() {
            addCriterion("SalePriceStart is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceStartEqualTo(Date value) {
            addCriterion("SalePriceStart =", value, "salePriceStart");
            return (Criteria) this;
        }

        public Criteria andSalePriceStartNotEqualTo(Date value) {
            addCriterion("SalePriceStart <>", value, "salePriceStart");
            return (Criteria) this;
        }

        public Criteria andSalePriceStartGreaterThan(Date value) {
            addCriterion("SalePriceStart >", value, "salePriceStart");
            return (Criteria) this;
        }

        public Criteria andSalePriceStartGreaterThanOrEqualTo(Date value) {
            addCriterion("SalePriceStart >=", value, "salePriceStart");
            return (Criteria) this;
        }

        public Criteria andSalePriceStartLessThan(Date value) {
            addCriterion("SalePriceStart <", value, "salePriceStart");
            return (Criteria) this;
        }

        public Criteria andSalePriceStartLessThanOrEqualTo(Date value) {
            addCriterion("SalePriceStart <=", value, "salePriceStart");
            return (Criteria) this;
        }

        public Criteria andSalePriceStartIn(List<Date> values) {
            addCriterion("SalePriceStart in", values, "salePriceStart");
            return (Criteria) this;
        }

        public Criteria andSalePriceStartNotIn(List<Date> values) {
            addCriterion("SalePriceStart not in", values, "salePriceStart");
            return (Criteria) this;
        }

        public Criteria andSalePriceStartBetween(Date value1, Date value2) {
            addCriterion("SalePriceStart between", value1, value2, "salePriceStart");
            return (Criteria) this;
        }

        public Criteria andSalePriceStartNotBetween(Date value1, Date value2) {
            addCriterion("SalePriceStart not between", value1, value2, "salePriceStart");
            return (Criteria) this;
        }

        public Criteria andSalePriceEndIsNull() {
            addCriterion("SalePriceEnd is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEndIsNotNull() {
            addCriterion("SalePriceEnd is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEndEqualTo(Date value) {
            addCriterion("SalePriceEnd =", value, "salePriceEnd");
            return (Criteria) this;
        }

        public Criteria andSalePriceEndNotEqualTo(Date value) {
            addCriterion("SalePriceEnd <>", value, "salePriceEnd");
            return (Criteria) this;
        }

        public Criteria andSalePriceEndGreaterThan(Date value) {
            addCriterion("SalePriceEnd >", value, "salePriceEnd");
            return (Criteria) this;
        }

        public Criteria andSalePriceEndGreaterThanOrEqualTo(Date value) {
            addCriterion("SalePriceEnd >=", value, "salePriceEnd");
            return (Criteria) this;
        }

        public Criteria andSalePriceEndLessThan(Date value) {
            addCriterion("SalePriceEnd <", value, "salePriceEnd");
            return (Criteria) this;
        }

        public Criteria andSalePriceEndLessThanOrEqualTo(Date value) {
            addCriterion("SalePriceEnd <=", value, "salePriceEnd");
            return (Criteria) this;
        }

        public Criteria andSalePriceEndIn(List<Date> values) {
            addCriterion("SalePriceEnd in", values, "salePriceEnd");
            return (Criteria) this;
        }

        public Criteria andSalePriceEndNotIn(List<Date> values) {
            addCriterion("SalePriceEnd not in", values, "salePriceEnd");
            return (Criteria) this;
        }

        public Criteria andSalePriceEndBetween(Date value1, Date value2) {
            addCriterion("SalePriceEnd between", value1, value2, "salePriceEnd");
            return (Criteria) this;
        }

        public Criteria andSalePriceEndNotBetween(Date value1, Date value2) {
            addCriterion("SalePriceEnd not between", value1, value2, "salePriceEnd");
            return (Criteria) this;
        }

        public Criteria andSizeGuideURLIsNull() {
            addCriterion("SizeGuideURL is null");
            return (Criteria) this;
        }

        public Criteria andSizeGuideURLIsNotNull() {
            addCriterion("SizeGuideURL is not null");
            return (Criteria) this;
        }

        public Criteria andSizeGuideURLEqualTo(String value) {
            addCriterion("SizeGuideURL =", value, "sizeGuideURL");
            return (Criteria) this;
        }

        public Criteria andSizeGuideURLNotEqualTo(String value) {
            addCriterion("SizeGuideURL <>", value, "sizeGuideURL");
            return (Criteria) this;
        }

        public Criteria andSizeGuideURLGreaterThan(String value) {
            addCriterion("SizeGuideURL >", value, "sizeGuideURL");
            return (Criteria) this;
        }

        public Criteria andSizeGuideURLGreaterThanOrEqualTo(String value) {
            addCriterion("SizeGuideURL >=", value, "sizeGuideURL");
            return (Criteria) this;
        }

        public Criteria andSizeGuideURLLessThan(String value) {
            addCriterion("SizeGuideURL <", value, "sizeGuideURL");
            return (Criteria) this;
        }

        public Criteria andSizeGuideURLLessThanOrEqualTo(String value) {
            addCriterion("SizeGuideURL <=", value, "sizeGuideURL");
            return (Criteria) this;
        }

        public Criteria andSizeGuideURLLike(String value) {
            addCriterion("SizeGuideURL like", value, "sizeGuideURL");
            return (Criteria) this;
        }

        public Criteria andSizeGuideURLNotLike(String value) {
            addCriterion("SizeGuideURL not like", value, "sizeGuideURL");
            return (Criteria) this;
        }

        public Criteria andSizeGuideURLIn(List<String> values) {
            addCriterion("SizeGuideURL in", values, "sizeGuideURL");
            return (Criteria) this;
        }

        public Criteria andSizeGuideURLNotIn(List<String> values) {
            addCriterion("SizeGuideURL not in", values, "sizeGuideURL");
            return (Criteria) this;
        }

        public Criteria andSizeGuideURLBetween(String value1, String value2) {
            addCriterion("SizeGuideURL between", value1, value2, "sizeGuideURL");
            return (Criteria) this;
        }

        public Criteria andSizeGuideURLNotBetween(String value1, String value2) {
            addCriterion("SizeGuideURL not between", value1, value2, "sizeGuideURL");
            return (Criteria) this;
        }

        public Criteria andSearchImageURLIsNull() {
            addCriterion("SearchImageURL is null");
            return (Criteria) this;
        }

        public Criteria andSearchImageURLIsNotNull() {
            addCriterion("SearchImageURL is not null");
            return (Criteria) this;
        }

        public Criteria andSearchImageURLEqualTo(String value) {
            addCriterion("SearchImageURL =", value, "searchImageURL");
            return (Criteria) this;
        }

        public Criteria andSearchImageURLNotEqualTo(String value) {
            addCriterion("SearchImageURL <>", value, "searchImageURL");
            return (Criteria) this;
        }

        public Criteria andSearchImageURLGreaterThan(String value) {
            addCriterion("SearchImageURL >", value, "searchImageURL");
            return (Criteria) this;
        }

        public Criteria andSearchImageURLGreaterThanOrEqualTo(String value) {
            addCriterion("SearchImageURL >=", value, "searchImageURL");
            return (Criteria) this;
        }

        public Criteria andSearchImageURLLessThan(String value) {
            addCriterion("SearchImageURL <", value, "searchImageURL");
            return (Criteria) this;
        }

        public Criteria andSearchImageURLLessThanOrEqualTo(String value) {
            addCriterion("SearchImageURL <=", value, "searchImageURL");
            return (Criteria) this;
        }

        public Criteria andSearchImageURLLike(String value) {
            addCriterion("SearchImageURL like", value, "searchImageURL");
            return (Criteria) this;
        }

        public Criteria andSearchImageURLNotLike(String value) {
            addCriterion("SearchImageURL not like", value, "searchImageURL");
            return (Criteria) this;
        }

        public Criteria andSearchImageURLIn(List<String> values) {
            addCriterion("SearchImageURL in", values, "searchImageURL");
            return (Criteria) this;
        }

        public Criteria andSearchImageURLNotIn(List<String> values) {
            addCriterion("SearchImageURL not in", values, "searchImageURL");
            return (Criteria) this;
        }

        public Criteria andSearchImageURLBetween(String value1, String value2) {
            addCriterion("SearchImageURL between", value1, value2, "searchImageURL");
            return (Criteria) this;
        }

        public Criteria andSearchImageURLNotBetween(String value1, String value2) {
            addCriterion("SearchImageURL not between", value1, value2, "searchImageURL");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}