package com.itacademy.four.operator;

import java.util.Scanner;

/**
 * && AND
 * || OR
 */
public class ConditionalComparisonDemo {
    public static void main(String[] args) {

        System.out.println("uneste broj");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("unesite broj");
        int number2 = new Scanner(System.in).nextInt();

        if ((number1 == 23) && (number2++ < 10)){
            System.out.println("ispunio si sve uvjete");
        }
        System.out.println("Number2" + " " + number2);

        if ((number1 == 23) || (number2 < 10)) {
            System.out.println(" Ili je Jordan ili je neko drugi");
        }
    }
}
