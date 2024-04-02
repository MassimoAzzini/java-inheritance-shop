package org.learning.javashop;

import java.math.BigDecimal;

public class Headphones extends Product {

    private String color;
    private boolean isWireless;

    public Headphones(String name, String brand, BigDecimal price, BigDecimal vat, String color, boolean isWireless) {
        super(name, brand, price, vat);
        this.color = color;
        this.isWireless = isWireless;
    }
}
