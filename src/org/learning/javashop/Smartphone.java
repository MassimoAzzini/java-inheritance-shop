package org.learning.javashop;

import java.math.BigDecimal;

public class Smartphone extends Product{

    private String codeIMEI;
    private int memory;


    public Smartphone(String name, String brand, BigDecimal price, BigDecimal vat, boolean loyaltyCard, String codeIMEI, int memory) {
        super(name, brand, price, vat, loyaltyCard);

        this.codeIMEI = codeIMEI;
        this.memory = memory;
        if (this.memory < 32 && loyaltyCard) {
            this.setDiscount(new BigDecimal("0.05"));
        }
    }

    // GETTER AND SETTER

    public String getCodeIMEI() {
        return codeIMEI;
    }

    public int getMemory() {
        return memory;
    }

    public void setCodeIMEI(String codeIMEI) {
        this.codeIMEI = codeIMEI;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String getInfo(){
        return "Product name: " + getName() + ", brand: " + getBrand() + ", memory: " + memory + "  .......  " + "price(vat incl): " + getFinalPrice() + "€";
    }

}
