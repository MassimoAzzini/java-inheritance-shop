package org.learning.javashop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    int code;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal vat;

    // COSTRUTTORI

    public Product(String name, String brand,BigDecimal price, BigDecimal vat) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.vat = vat;

        this.code = generateCode();
    }

    // GETTER E SETTER


    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public BigDecimal getPrice() {
        return price.setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal getFullPrice() {
        return price.add(price.multiply(vat)).setScale(2, RoundingMode.HALF_EVEN);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public void setPrice(BigDecimal price) {
        if (price == null) {
            price = BigDecimal.ZERO;
        }
        this.price = price;
    }

    public void getInfo(){
        System.out.println("Product name: " + name + ", brand: " + brand + ", price: " + getPrice() + ", price+vat: " + getFullPrice());
    }


    // METODI
    private int generateCode() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(100000000);
    }

}



