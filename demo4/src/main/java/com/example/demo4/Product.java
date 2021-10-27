package com.example.demo4;
public class Product {
    private  String name;
    private double price;
    private int quality;

    public Product(){
        this.name = "";
        this.price = 0;
        this.quality = 0;
    }
    public Product(String name, double price, int quality){
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
