package com.voltrex.spring_boot.model;
import org.springframework.stereotype.Component;

@Component
public class Product {

    public Product(){

    }

    private int prodId;
    private String prodName;
    private int price;

    public int getProdId() {
        return prodId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public Product(int id, String name, int price){
        this.prodId = id;
        this.prodName = name;
        this.price = price;
    }

}
