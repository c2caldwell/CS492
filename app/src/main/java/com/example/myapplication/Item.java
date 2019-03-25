package com.example.myapplication;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Item {
    protected long id;
    private String productNumber;
    private String description;
    private String websiteUrl;
    private double price;
    private User updateBy;
    private Category category;
    private ArrayList<String> keywords;
    private ZonedDateTime updateDate;


    //private ShopcastDBHelper DBhelper;
    Item (){}
    Item(String _productNumber,
         String _description,
         String _websiteUrl,
         double _price,
         User _user,
         Category _category,
         ArrayList<String> _keywords){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss Z");
            this.id=0;
            this.productNumber=_productNumber;
            this.description = _description;
            this.websiteUrl=_websiteUrl;
            this.price = _price;
            this.updateBy = _user;
            this.category =_category;
            this.keywords=_keywords;
            this.updateDate= ZonedDateTime.now();


    }
    //Setters
    void setProductNumber(String _productNumber) {
        this.productNumber = _productNumber;
    }

    void setDescription(String _description) {
        this.description = _description;
    }

    void setWebsiteUrl(String _websiteUrl) {
        this.websiteUrl = _websiteUrl;
    }

    void setPrice(double _price) {
        this.price = _price;
    }

    void setCategory(Category _category){this.category=_category; }

    void setUpdateUser(User _user){this.updateBy=_user;}

    void addKeyword(String _keyword) {
        keywords.add(_keyword);
    }

    void setKeywords(  ArrayList<String> _keywords){this.keywords=_keywords;}

    //Getters
    long getId() {
        return this.id;
    }

    String getProductNumber() {
        return this.productNumber;
    }

    String getDescription() {
        return this.description;
    }

    String getWebsiteUrl() {
        return this.websiteUrl;
    }

    double getPrice(){
        return this.price;
    }

    String getPriceString(){
        return "$"+String.valueOf(this.price);
    }

    User getUpdateBy(){
        return this.updateBy;
    }

    Category getCategory(){return this.category;}

    LocalDate getUpdateDate(){
        return this.updateDate.toLocalDate();
    }

    ArrayList<String> getKkeywords(){
        return this.keywords;
    }


}
