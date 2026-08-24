package com.itacademy.six.loop;

import java.util.Scanner;

/**
 * petlja je blok koda kojise ponavlja sve dok je zadovoljen uslov petlje
 */

public class WhileDemo {
    public static void main(String[] args) {

            System.out.println("unesite omiljeni broj");
            int number = 11;
            while (number > 0) {
                System.out.println(number);
                number--;
            }
        System.out.println(number);
    }
}
