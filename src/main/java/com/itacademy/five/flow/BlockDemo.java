package com.itacademy.five.flow;

import java.util.Scanner;

/**
 * Kontrole toka
 * If Else
 * If then else
 * Switch
 *
 * KISS - keep it simple short
 */
public class BlockDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj");
        int number = new Scanner(System.in).nextInt();
        boolean condition = number <= 23; // false ako se ne unese tocna vrijednost
        // if izraz mora biti true/false tj boolean tipa2
        if (condition){
            System.out.println("sretni ste");
        }else {
            System.out.println("niste bas sretni");
        }
    }
}
