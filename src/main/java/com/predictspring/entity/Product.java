package com.predictspring.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Product class from mybatis auto generator
 */
public class Product implements Serializable{

    private static final long serialVersionUID = 1L;

    private String productID;

    private String name;

    private String googleCategory;

    private String productURL;

    private String imageURL;

    private String additionalImageURL;

    private String productCondition;

    private BigDecimal price;

    private BigDecimal salesPrice;

    private String brand;

    private String manufacturer;

    private String manufacturerLocation;

    private String GTIN;

    private String MPN;

    private String gender;

    private Integer ageRangeLow;

    private Integer ageRangeHigh;

    private String variantGroupID;

    private String color;

    private String size;

    private String material;

    private String pattern;

    private String shipping;

    private String shippingWeight;

    private String bundle;

    private String merchantSKU;

    private Integer topSellerRank;

    private String tax;

    private String channelApplicability;

    private String internalProductID;

    private String promotionID;

    private Boolean isDefaultVariant;

    private String processingTime;

    private String customization;

    private Date lastUpdate;

    private boolean active;

    private String ageGroup;

    private String availability;

    private Boolean isOnSale;

    private String currencyCode;

    private Date promotionEnd;

    private Date promotionStart;

    private String promotionTitle;

    private String colorSwatchUrl;

    private String productLocation;

    private Date salePriceStart;

    private Date salePriceEnd;

    private String sizeGuideURL;

    private String searchImageURL;

    private String description;

    private String merchantCategory;

    private String manufacturerDetails;

    private String promotionsMetadata;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID == null ? null : productID.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGoogleCategory() {
        return googleCategory;
    }

    public void setGoogleCategory(String googleCategory) {
        this.googleCategory = googleCategory == null ? null : googleCategory.trim();
    }

    public String getProductURL() {
        return productURL;
    }

    public void setProductURL(String productURL) {
        this.productURL = productURL == null ? null : productURL.trim();
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL == null ? null : imageURL.trim();
    }

    public String getAdditionalImageURL() {
        return additionalImageURL;
    }

    public void setAdditionalImageURL(String additionalImageURL) {
        this.additionalImageURL = additionalImageURL == null ? null : additionalImageURL.trim();
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition == null ? null : productCondition.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getManufacturerLocation() {
        return manufacturerLocation;
    }

    public void setManufacturerLocation(String manufacturerLocation) {
        this.manufacturerLocation = manufacturerLocation == null ? null : manufacturerLocation.trim();
    }

    public String getGTIN() {
        return GTIN;
    }

    public void setGTIN(String GTIN) {
        this.GTIN = GTIN == null ? null : GTIN.trim();
    }

    public String getMPN() {
        return MPN;
    }

    public void setMPN(String MPN) {
        this.MPN = MPN == null ? null : MPN.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getAgeRangeLow() {
        return ageRangeLow;
    }

    public void setAgeRangeLow(Integer ageRangeLow) {
        this.ageRangeLow = ageRangeLow;
    }

    public Integer getAgeRangeHigh() {
        return ageRangeHigh;
    }

    public void setAgeRangeHigh(Integer ageRangeHigh) {
        this.ageRangeHigh = ageRangeHigh;
    }

    public String getVariantGroupID() {
        return variantGroupID;
    }

    public void setVariantGroupID(String variantGroupID) {
        this.variantGroupID = variantGroupID == null ? null : variantGroupID.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern == null ? null : pattern.trim();
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping == null ? null : shipping.trim();
    }

    public String getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(String shippingWeight) {
        this.shippingWeight = shippingWeight == null ? null : shippingWeight.trim();
    }

    public String getBundle() {
        return bundle;
    }

    public void setBundle(String bundle) {
        this.bundle = bundle == null ? null : bundle.trim();
    }

    public String getMerchantSKU() {
        return merchantSKU;
    }

    public void setMerchantSKU(String merchantSKU) {
        this.merchantSKU = merchantSKU == null ? null : merchantSKU.trim();
    }

    public Integer getTopSellerRank() {
        return topSellerRank;
    }

    public void setTopSellerRank(Integer topSellerRank) {
        this.topSellerRank = topSellerRank;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax == null ? null : tax.trim();
    }

    public String getChannelApplicability() {
        return channelApplicability;
    }

    public void setChannelApplicability(String channelApplicability) {
        this.channelApplicability = channelApplicability == null ? null : channelApplicability.trim();
    }

    public String getInternalProductID() {
        return internalProductID;
    }

    public void setInternalProductID(String internalProductID) {
        this.internalProductID = internalProductID == null ? null : internalProductID.trim();
    }

    public String getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(String promotionID) {
        this.promotionID = promotionID == null ? null : promotionID.trim();
    }

    public Boolean getIsDefaultVariant() {
        return isDefaultVariant;
    }

    public void setIsDefaultVariant(Boolean isDefaultVariant) {
        this.isDefaultVariant = isDefaultVariant;
    }

    public String getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(String processingTime) {
        this.processingTime = processingTime == null ? null : processingTime.trim();
    }

    public String getCustomization() {
        return customization;
    }

    public void setCustomization(String customization) {
        this.customization = customization == null ? null : customization.trim();
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public boolean  getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup == null ? null : ageGroup.trim();
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability == null ? null : availability.trim();
    }

    public Boolean getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(Boolean isOnSale) {
        this.isOnSale = isOnSale;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    public Date getPromotionEnd() {
        return promotionEnd;
    }

    public void setPromotionEnd(Date promotionEnd) {
        this.promotionEnd = promotionEnd;
    }

    public Date getPromotionStart() {
        return promotionStart;
    }

    public void setPromotionStart(Date promotionStart) {
        this.promotionStart = promotionStart;
    }

    public String getPromotionTitle() {
        return promotionTitle;
    }

    public void setPromotionTitle(String promotionTitle) {
        this.promotionTitle = promotionTitle == null ? null : promotionTitle.trim();
    }

    public String getColorSwatchUrl() {
        return colorSwatchUrl;
    }

    public void setColorSwatchUrl(String colorSwatchUrl) {
        this.colorSwatchUrl = colorSwatchUrl == null ? null : colorSwatchUrl.trim();
    }

    public String getProductLocation() {
        return productLocation;
    }

    public void setProductLocation(String productLocation) {
        this.productLocation = productLocation == null ? null : productLocation.trim();
    }

    public Date getSalePriceStart() {
        return salePriceStart;
    }

    public void setSalePriceStart(Date salePriceStart) {
        this.salePriceStart = salePriceStart;
    }

    public Date getSalePriceEnd() {
        return salePriceEnd;
    }

    public void setSalePriceEnd(Date salePriceEnd) {
        this.salePriceEnd = salePriceEnd;
    }

    public String getSizeGuideURL() {
        return sizeGuideURL;
    }

    public void setSizeGuideURL(String sizeGuideURL) {
        this.sizeGuideURL = sizeGuideURL == null ? null : sizeGuideURL.trim();
    }

    public String getSearchImageURL() {
        return searchImageURL;
    }

    public void setSearchImageURL(String searchImageURL) {
        this.searchImageURL = searchImageURL == null ? null : searchImageURL.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getMerchantCategory() {
        return merchantCategory;
    }

    public void setMerchantCategory(String merchantCategory) {
        this.merchantCategory = merchantCategory == null ? null : merchantCategory.trim();
    }

    public String getManufacturerDetails() {
        return manufacturerDetails;
    }

    public void setManufacturerDetails(String manufacturerDetails) {
        this.manufacturerDetails = manufacturerDetails == null ? null : manufacturerDetails.trim();
    }

    public String getPromotionsMetadata() {
        return promotionsMetadata;
    }

    public void setPromotionsMetadata(String promotionsMetadata) {
        this.promotionsMetadata = promotionsMetadata == null ? null : promotionsMetadata.trim();
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", name='" + name + '\'' +
                ", googleCategory='" + googleCategory + '\'' +
                ", productURL='" + productURL + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", additionalImageURL='" + additionalImageURL + '\'' +
                ", productCondition='" + productCondition + '\'' +
                ", price=" + price +
                ", salesPrice=" + salesPrice +
                ", brand='" + brand + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", manufacturerLocation='" + manufacturerLocation + '\'' +
                ", GTIN='" + GTIN + '\'' +
                ", MPN='" + MPN + '\'' +
                ", gender='" + gender + '\'' +
                ", ageRangeLow=" + ageRangeLow +
                ", ageRangeHigh=" + ageRangeHigh +
                ", variantGroupID='" + variantGroupID + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", material='" + material + '\'' +
                ", pattern='" + pattern + '\'' +
                ", shipping='" + shipping + '\'' +
                ", shippingWeight='" + shippingWeight + '\'' +
                ", bundle='" + bundle + '\'' +
                ", merchantSKU='" + merchantSKU + '\'' +
                ", topSellerRank=" + topSellerRank +
                ", tax='" + tax + '\'' +
                ", channelApplicability='" + channelApplicability + '\'' +
                ", internalProductID='" + internalProductID + '\'' +
                ", promotionID='" + promotionID + '\'' +
                ", isDefaultVariant=" + isDefaultVariant +
                ", processingTime='" + processingTime + '\'' +
                ", customization='" + customization + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", active=" + active +
                ", ageGroup='" + ageGroup + '\'' +
                ", availability='" + availability + '\'' +
                ", isOnSale=" + isOnSale +
                ", currencyCode='" + currencyCode + '\'' +
                ", promotionEnd=" + promotionEnd +
                ", promotionStart=" + promotionStart +
                ", promotionTitle='" + promotionTitle + '\'' +
                ", colorSwatchUrl='" + colorSwatchUrl + '\'' +
                ", productLocation='" + productLocation + '\'' +
                ", salePriceStart=" + salePriceStart +
                ", salePriceEnd=" + salePriceEnd +
                ", sizeGuideURL='" + sizeGuideURL + '\'' +
                ", searchImageURL='" + searchImageURL + '\'' +
                ", description='" + description + '\'' +
                ", merchantCategory='" + merchantCategory + '\'' +
                ", manufacturerDetails='" + manufacturerDetails + '\'' +
                ", promotionsMetadata='" + promotionsMetadata + '\'' +
                '}';
    }
}