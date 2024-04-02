package org.learning.javashop;

import java.math.BigDecimal;

public class Headphones extends Product {

    private String color;
    private boolean isWireless;

    public Headphones(String name, String brand, BigDecimal price, BigDecimal vat, boolean loyaltyCard, String color, boolean isWireless) {
        super(name, brand, price, vat, loyaltyCard);
        this.color = color;
        this.isWireless = isWireless;

        if (!this.isWireless && loyaltyCard) {
            this.setDiscount(new BigDecimal("0.07"));
        }
    }

}
