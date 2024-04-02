package org.learning.javashop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Television LGFigo = new Television("Oled 52x", "LG", new BigDecimal ("1549.99"), new BigDecimal("0.21"), "52", true);



        System.out.println("How many products do you want to include? ");
        int items = Integer.parseInt(scan.nextLine());
        Product [] cart = new Product[items];

        for (int i = 0; i < items; i++) {

            System.out.println("What product do you want to include?");
            System.out.println("1 - Smartphone");
            System.out.println("2 - Television");
            System.out.println("3 - Headphone");
            int select = Integer.parseInt(scan.nextLine());

            System.out.print("Name product: ");
            String name = scan.nextLine();
            System.out.print("Brand: ");
            String brand = scan.nextLine();
            System.out.print("Price: ");
            BigDecimal price = new BigDecimal(scan.nextLine());
            System.out.print("Vat: ");
            BigDecimal vat = new BigDecimal(scan.nextLine());

            switch (select) {
                case 1:
                    System.out.println("Code IMEI: ");
                    String codeIMEI = scan.nextLine();
                    System.out.println("Memory: ");
                    int memory = Integer.parseInt(scan.nextLine());

                    Smartphone phone = new Smartphone(name, brand, price, vat, codeIMEI, memory);
                    cart[i] = phone;

                    break;

                case 2:
                    System.out.println("Dimensions: ");
                    String dimension = scan.nextLine();
                    System.out.println("Is a Smart-Tv?(Y/N): ");
                    String selectSmart = scan.nextLine();

                    boolean isSmart;

                    if (selectSmart.toLowerCase().equals("y")) {
                        isSmart = true;
                    } else {
                        isSmart = false;
                    }

                    Television tv = new Television(name, brand, price, vat, dimension, isSmart);
                    cart[i] = tv;

                    break;

                case 3:
                    System.out.println("Color: ");
                    String color = scan.nextLine();
                    System.out.println("Is Wireless?(Y/N): ");
                    String selectWireless = scan.nextLine();

                    boolean isWireless;

                    if (selectWireless.toLowerCase().equals("y")) {
                        isWireless = true;
                    } else {
                        isWireless = false;
                    }

                    Headphones headphones = new Headphones(name, brand, price, vat, color, isWireless);
                    cart[i] = headphones;

                    break;

                default:
                    break;
            }

        }
        scan.close();

    }
}
