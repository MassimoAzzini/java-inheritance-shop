package org.learning.javashop;

import java.math.BigDecimal;

public class Television extends Product {

    private String dimensions;
    private boolean smart;

    public Television(String name, String brand, BigDecimal price, BigDecimal vat, String dimensions, boolean smart) {
        super(name, brand, price, vat);

        this.dimensions = dimensions;
        this.smart = smart;
    }

    public String getDimensions() {
        return dimensions;
    }

    public boolean getSmart() {
        return smart;
    }

    public String setDimensions(String dimensions){
        return this.dimensions = dimensions;
    }

    public boolean setSmart(boolean smart){
        return this.smart = smart;
    }
}
