package org.learning.javashop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        BigDecimal totalCart = BigDecimal.ZERO;

        Scanner scan = new Scanner(System.in);

        // CHIEDO ALL'UTENTE SE HA LA CARTA FEDELTA'
        System.out.println("Do you have a loyalty card?(Y/N) ");
        String selectCard = scan.nextLine();

        boolean haveCard;

        if (selectCard.toLowerCase().equals("y")) {
            haveCard = true;
        } else {
            haveCard = false;
        }

        // CHIEDO ALL'UTENTE QUANTI PRODOTTI VUOLE E GENERO L'ARRAY CART
        System.out.println("How many products do you want to include? ");
        int items = Integer.parseInt(scan.nextLine());
        Product [] cart = new Product[items];

        // CHIEDO ALL'UTENTE CHE COSA VUOLE E LO INSEERISCO NELL'ARRAY CART
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
                    System.out.print("Code IMEI: ");
                    String codeIMEI = scan.nextLine();
                    System.out.print("Memory: ");
                    int memory = Integer.parseInt(scan.nextLine());

                    Smartphone phone = new Smartphone(name, brand, price, vat, haveCard, codeIMEI, memory);
                    cart[i] = phone;

                    break;

                case 2:
                    System.out.print("Dimensions: ");
                    String dimension = scan.nextLine();
                    System.out.print("Is a Smart-Tv?(Y/N): ");
                    String selectSmart = scan.nextLine();

                    boolean isSmart;

                    if (selectSmart.toLowerCase().equals("y")) {
                        isSmart = true;
                    } else {
                        isSmart = false;
                    }

                    Television tv = new Television(name, brand, price, vat, haveCard, dimension, isSmart);
                    cart[i] = tv;

                    break;

                case 3:
                    System.out.print("Color: ");
                    String color = scan.nextLine();
                    System.out.print("Is Wireless?(Y/N): ");
                    String selectWireless = scan.nextLine();

                    boolean isWireless;

                    if (selectWireless.toLowerCase().equals("y")) {
                        isWireless = true;
                    } else {
                        isWireless = false;
                    }

                    Headphones headphones = new Headphones(name, brand, price, vat, haveCard, color, isWireless);
                    cart[i] = headphones;

                    break;

                default:
                    break;
            }

        }

        // STAMPO L'ELENCO DEI PRODOTTI DEL CARRELLO CICLANDO OGNI ELEMENTO DI ESSO

        for (Product p : cart){
            System.out.println(p.getInfo());
            totalCart = totalCart.add(p.getFinalPrice());
        }

        System.out.println("Total: " + totalCart.setScale(2, RoundingMode.HALF_EVEN) + "€");

        scan.close();

    }
}
