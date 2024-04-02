package org.learning.javashop;

import java.math.BigDecimal;

public class Smartphone extends Product{

    private String codeIMEI;
    private int memory;


    public Smartphone(String name, String brand, BigDecimal price, BigDecimal vat, String codeIMEI, int memory) {
        super(name, brand, price, vat);

        this.codeIMEI = codeIMEI;
        this.memory = memory;
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
}
