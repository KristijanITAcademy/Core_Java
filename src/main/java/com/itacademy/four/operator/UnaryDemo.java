package com.itacademy.four.operator;

/**
 * Unarni plus operator
 * Unarni minus operator
 * ++ increment operator
 *  - pre increment
 *  - post increment
 * -- decrement operator
 *  - pre i post
 *  inventor
 */
public class UnaryDemo {
    public static void main(String[] args) {

        int number = 23;
        number ++; // number = number + 1
        System.out.println(number); //poslaji u konzolu pa povecaj
        ++ number;
        System.out.println(number); // uvecaj za 1 i ispisi


        boolean success = true;
        System.out.println(!success); // invertor

    }
}
