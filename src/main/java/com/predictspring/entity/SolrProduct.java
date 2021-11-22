package com.predictspring.entity;

import org.apache.solr.client.solrj.beans.Field;

import java.util.Date;

public class SolrProduct{
    @Field
    private String ProductID;

    @Field
    private String Name;

    @Field
    private String GoogleCategory;

    @Field
    private String ProductURL;

    @Field
    private String ImageURL;

    @Field
    private String AdditionalImageURL;

    @Field
    private String ProductCondition;

    @Field
    private double Price;

    @Field
    private double SalesPrice;

    @Field
    private String Brand;

    @Field
    private String Manufacturer;

    @Field
    private String ManufacturerLocation;

    @Field
    private String GTIN;

    @Field
    private String MPN;

    @Field
    private String Gender;

    @Field
    private Integer AgeRangeLow;

    @Field
    private Integer AgeRangeHigh;

    @Field
    private String VariantGroupID;

    @Field
    private String Color;

    @Field
    private String Size;

    @Field
    private String Material;

    @Field
    private String Pattern;

    @Field
    private String Shipping;

    @Field
    private String ShippingWeight;

    @Field
    private String Bundle;

    @Field
    private String MerchantSKU;

    @Field
    private Integer TopSellerRank;

    @Field
    private String Tax;

    @Field
    private String ChannelApplicability;

    @Field
    private String InternalProductID;

    @Field
    private String PromotionID;

    @Field
    private Boolean IsDefaultVariant;

    @Field
    private String ProcessingTime;

    @Field
    private String Customization;

    @Field
    private Date LastUpdate;

    @Field
    private Boolean Active;

    @Field
    private String AgeGroup;

    @Field
    private String Availability;

    @Field
    private Boolean IsOnSale;

    @Field
    private String CurrencyCode;

    @Field
    private Date PromotionEnd;

    @Field
    private Date PromotionStart;

    @Field
    private String PromotionTitle;

    @Field
    private String ColorSwatchUrl;

    @Field
    private String ProductLocation;

    @Field
    private Date SalePriceStart;

    @Field
    private Date SalePriceEnd;

    @Field
    private String SizeGuideURL;

    @Field
    private String SearchImageURL;

    @Field
    private String Description;

    @Field
    private String MerchantCategory;

    @Field
    private String ManufacturerDetails;

    @Field
    private String PromotionsMetadata;

    public void setProductID(String productID) {
        ProductID = productID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGoogleCategory(String googleCategory) {
        GoogleCategory = googleCategory;
    }

    public void setProductURL(String productURL) {
        ProductURL = productURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }

    public void setAdditionalImageURL(String additionalImageURL) {
        AdditionalImageURL = additionalImageURL;
    }

    public void setProductCondition(String productCondition) {
        ProductCondition = productCondition;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setSalesPrice(double salesPrice) {
        SalesPrice = salesPrice;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public void setManufacturerLocation(String manufacturerLocation) {
        ManufacturerLocation = manufacturerLocation;
    }

    public void setGTIN(String GTIN) {
        this.GTIN = GTIN;
    }

    public void setMPN(String MPN) {
        this.MPN = MPN;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setAgeRangeLow(Integer ageRangeLow) {
        AgeRangeLow = ageRangeLow;
    }

    public void setAgeRangeHigh(Integer ageRangeHigh) {
        AgeRangeHigh = ageRangeHigh;
    }

    public void setVariantGroupID(String variantGroupID) {
        VariantGroupID = variantGroupID;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setSize(String size) {
        Size = size;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public void setPattern(String pattern) {
        Pattern = pattern;
    }

    public void setShipping(String shipping) {
        Shipping = shipping;
    }

    public void setShippingWeight(String shippingWeight) {
        ShippingWeight = shippingWeight;
    }

    public void setBundle(String bundle) {
        Bundle = bundle;
    }

    public void setMerchantSKU(String merchantSKU) {
        MerchantSKU = merchantSKU;
    }

    public void setTopSellerRank(Integer topSellerRank) {
        TopSellerRank = topSellerRank;
    }

    public void setTax(String tax) {
        Tax = tax;
    }

    public void setChannelApplicability(String channelApplicability) {
        ChannelApplicability = channelApplicability;
    }

    public void setInternalProductID(String internalProductID) {
        InternalProductID = internalProductID;
    }

    public void setPromotionID(String promotionID) {
        PromotionID = promotionID;
    }

    public void setDefaultVariant(Boolean defaultVariant) {
        IsDefaultVariant = defaultVariant;
    }

    public void setProcessingTime(String processingTime) {
        ProcessingTime = processingTime;
    }

    public void setCustomization(String customization) {
        Customization = customization;
    }

    public void setLastUpdate(Date lastUpdate) {
        LastUpdate = lastUpdate;
    }

    public void setActive(Boolean active) {
        Active = active;
    }

    public void setAgeGroup(String ageGroup) {
        AgeGroup = ageGroup;
    }

    public void setAvailability(String availability) {
        Availability = availability;
    }

    public void setOnSale(Boolean onSale) {
        IsOnSale = onSale;
    }

    public void setCurrencyCode(String currencyCode) {
        CurrencyCode = currencyCode;
    }

    public void setPromotionEnd(Date promotionEnd) {
        PromotionEnd = promotionEnd;
    }

    public void setPromotionStart(Date promotionStart) {
        PromotionStart = promotionStart;
    }

    public void setPromotionTitle(String promotionTitle) {
        PromotionTitle = promotionTitle;
    }

    public void setColorSwatchUrl(String colorSwatchUrl) {
        ColorSwatchUrl = colorSwatchUrl;
    }

    public void setProductLocation(String productLocation) {
        ProductLocation = productLocation;
    }

    public void setSalePriceStart(Date salePriceStart) {
        SalePriceStart = salePriceStart;
    }

    public void setSalePriceEnd(Date salePriceEnd) {
        SalePriceEnd = salePriceEnd;
    }

    public void setSizeGuideURL(String sizeGuideURL) {
        SizeGuideURL = sizeGuideURL;
    }

    public void setSearchImageURL(String searchImageURL) {
        SearchImageURL = searchImageURL;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setMerchantCategory(String merchantCategory) {
        MerchantCategory = merchantCategory;
    }

    public void setManufacturerDetails(String manufacturerDetails) {
        ManufacturerDetails = manufacturerDetails;
    }

    public void setPromotionsMetadata(String promotionsMetadata) {
        PromotionsMetadata = promotionsMetadata;
    }

    public String getProductID() {
        return ProductID;
    }

    public String getName() {
        return Name;
    }

    public String getGoogleCategory() {
        return GoogleCategory;
    }

    public String getProductURL() {
        return ProductURL;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public String getAdditionalImageURL() {
        return AdditionalImageURL;
    }

    public String getProductCondition() {
        return ProductCondition;
    }

    public double getPrice() {
        return Price;
    }

    public double getSalesPrice() {
        return SalesPrice;
    }

    public String getBrand() {
        return Brand;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public String getManufacturerLocation() {
        return ManufacturerLocation;
    }

    public String getGTIN() {
        return GTIN;
    }

    public String getMPN() {
        return MPN;
    }

    public String getGender() {
        return Gender;
    }

    public Integer getAgeRangeLow() {
        return AgeRangeLow;
    }

    public Integer getAgeRangeHigh() {
        return AgeRangeHigh;
    }

    public String getVariantGroupID() {
        return VariantGroupID;
    }

    public String getColor() {
        return Color;
    }

    public String getSize() {
        return Size;
    }

    public String getMaterial() {
        return Material;
    }

    public String getPattern() {
        return Pattern;
    }

    public String getShipping() {
        return Shipping;
    }

    public String getShippingWeight() {
        return ShippingWeight;
    }

    public String getBundle() {
        return Bundle;
    }

    public String getMerchantSKU() {
        return MerchantSKU;
    }

    public Integer getTopSellerRank() {
        return TopSellerRank;
    }

    public String getTax() {
        return Tax;
    }

    public String getChannelApplicability() {
        return ChannelApplicability;
    }

    public String getInternalProductID() {
        return InternalProductID;
    }

    public String getPromotionID() {
        return PromotionID;
    }

    public Boolean getDefaultVariant() {
        return IsDefaultVariant;
    }

    public String getProcessingTime() {
        return ProcessingTime;
    }

    public String getCustomization() {
        return Customization;
    }

    public Date getLastUpdate() {
        return LastUpdate;
    }

    public Boolean getActive() {
        return Active;
    }

    public String getAgeGroup() {
        return AgeGroup;
    }

    public String getAvailability() {
        return Availability;
    }

    public Boolean getOnSale() {
        return IsOnSale;
    }

    public String getCurrencyCode() {
        return CurrencyCode;
    }

    public Date getPromotionEnd() {
        return PromotionEnd;
    }

    public Date getPromotionStart() {
        return PromotionStart;
    }

    public String getPromotionTitle() {
        return PromotionTitle;
    }

    public String getColorSwatchUrl() {
        return ColorSwatchUrl;
    }

    public String getProductLocation() {
        return ProductLocation;
    }

    public Date getSalePriceStart() {
        return SalePriceStart;
    }

    public Date getSalePriceEnd() {
        return SalePriceEnd;
    }

    public String getSizeGuideURL() {
        return SizeGuideURL;
    }

    public String getSearchImageURL() {
        return SearchImageURL;
    }

    public String getDescription() {
        return Description;
    }

    public String getMerchantCategory() {
        return MerchantCategory;
    }

    public String getManufacturerDetails() {
        return ManufacturerDetails;
    }

    public String getPromotionsMetadata() {
        return PromotionsMetadata;
    }

    @Override
    public String toString() {
        return "SolrProduct{" +
                "ProductID='" + ProductID + '\'' +
                ", Name='" + Name + '\'' +
                ", GoogleCategory='" + GoogleCategory + '\'' +
                ", ProductURL='" + ProductURL + '\'' +
                ", ImageURL='" + ImageURL + '\'' +
                ", AdditionalImageURL='" + AdditionalImageURL + '\'' +
                ", ProductCondition='" + ProductCondition + '\'' +
                ", Price=" + Price +
                ", SalesPrice=" + SalesPrice +
                ", Brand='" + Brand + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", ManufacturerLocation='" + ManufacturerLocation + '\'' +
                ", GTIN='" + GTIN + '\'' +
                ", MPN='" + MPN + '\'' +
                ", Gender='" + Gender + '\'' +
                ", AgeRangeLow=" + AgeRangeLow +
                ", AgeRangeHigh=" + AgeRangeHigh +
                ", VariantGroupID='" + VariantGroupID + '\'' +
                ", Color='" + Color + '\'' +
                ", Size='" + Size + '\'' +
                ", Material='" + Material + '\'' +
                ", Pattern='" + Pattern + '\'' +
                ", Shipping='" + Shipping + '\'' +
                ", ShippingWeight='" + ShippingWeight + '\'' +
                ", Bundle='" + Bundle + '\'' +
                ", MerchantSKU='" + MerchantSKU + '\'' +
                ", TopSellerRank=" + TopSellerRank +
                ", Tax='" + Tax + '\'' +
                ", ChannelApplicability='" + ChannelApplicability + '\'' +
                ", InternalProductID='" + InternalProductID + '\'' +
                ", PromotionID='" + PromotionID + '\'' +
                ", IsDefaultVariant=" + IsDefaultVariant +
                ", ProcessingTime='" + ProcessingTime + '\'' +
                ", Customization='" + Customization + '\'' +
                ", LastUpdate=" + LastUpdate +
                ", Active=" + Active +
                ", AgeGroup='" + AgeGroup + '\'' +
                ", Availability='" + Availability + '\'' +
                ", IsOnSale=" + IsOnSale +
                ", CurrencyCode='" + CurrencyCode + '\'' +
                ", PromotionEnd=" + PromotionEnd +
                ", PromotionStart=" + PromotionStart +
                ", PromotionTitle='" + PromotionTitle + '\'' +
                ", ColorSwatchUrl='" + ColorSwatchUrl + '\'' +
                ", ProductLocation='" + ProductLocation + '\'' +
                ", SalePriceStart=" + SalePriceStart +
                ", SalePriceEnd=" + SalePriceEnd +
                ", SizeGuideURL='" + SizeGuideURL + '\'' +
                ", SearchImageURL='" + SearchImageURL + '\'' +
                ", Description='" + Description + '\'' +
                ", MerchantCategory='" + MerchantCategory + '\'' +
                ", ManufacturerDetails='" + ManufacturerDetails + '\'' +
                ", PromotionsMetadata='" + PromotionsMetadata + '\'' +
                '}';
    }
}
