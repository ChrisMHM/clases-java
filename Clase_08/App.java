package Clase_08;

import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());

        int value1 = 5000;
        int value2 = 25000;
        int value3 = 55000;
        int value4 = 200000;
        int value5 = 1000000;
        int tax1 = 100;
        int tax2 = 1700;
        int tax3 = 4700;
        int tax4 = 22100;
        int tax5 = 142100;
        // Cambiar el valor del tax
        double taxRate1 = 0.08;
        double taxRate2 = 0.10;
        double taxRate3 = 0.12;
        double taxRate4 = 0.15;
        double taxRate5 = 0.17;
        // Siempre inicializar las variables
        double giftTax = 0;

        if ((gift >= value1 && gift < value2)) {
            giftTax = tax1 + ((gift - value1) * taxRate1);
        } else if (gift >= value2 && gift < value3) {
            giftTax = tax2 + ((gift - value2) * taxRate2);
        } else if (gift >= value3 && gift < value4) {
            giftTax = tax3 + ((gift - value3) * taxRate3);
        } else if (gift >= value3 && gift < value4) {
            giftTax = tax4 + ((gift - value4) * taxRate4);
        } else if (gift >= value4) {
            giftTax = tax5 + ((gift - value5) * taxRate5);
        } else {
            System.out.println("No tax!");
        }

        System.out.println("Tax: " + giftTax);
    }
}