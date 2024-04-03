package org.learning.javashop;

import java.math.BigDecimal;

public class Television extends Product {

    private String dimensions;
    private boolean isSmart;

    public Television(String name, String brand, BigDecimal price, BigDecimal vat, boolean loyaltyCard, String dimensions, boolean smart) {
        super(name, brand, price, vat, loyaltyCard);

        this.dimensions = dimensions;
        this.isSmart = smart;

        if (!this.isSmart && loyaltyCard) {
            this.setDiscount(new BigDecimal("0.10"));
        }
    }

    public String getDimensions() {
        return dimensions;
    }

    public boolean getSmart() {
        return isSmart;
    }

    public String setDimensions(String dimensions){
        return this.dimensions = dimensions;
    }

    public boolean setSmart(boolean smart){
        return this.isSmart = smart;
    }

    @Override
    public String getInfo(){
        return "Product name: " + getName() + ", brand: " + getBrand() + ", dimensions: " + dimensions + "  .......  " + "price(vat incl): " + getFinalPrice() + "€";
    }

  }
