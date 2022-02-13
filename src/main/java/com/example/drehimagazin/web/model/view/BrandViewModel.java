package com.example.drehimagazin.web.model.view;

public class BrandViewModel {

    private String brand;
    private String imageURL;


    public String getImageURL() {
        return imageURL;
    }

    public BrandViewModel setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public BrandViewModel setName(String brand) {
        this.brand = brand;
        return this;
    }

    public String getName() {
        return brand;
    }
}
