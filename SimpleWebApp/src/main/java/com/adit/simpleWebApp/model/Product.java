package com.adit.simpleWebApp.model;

public class Product {

    private int prodId;
    private String prodName;
    private int price;

    

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }
    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    @Override
    public String toString() {
        return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + "]";
    }
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
