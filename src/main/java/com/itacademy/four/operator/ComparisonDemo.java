package com.itacademy.four.operator;


import java.util.Scanner;

/**
 * idealni operatori za kontrolu toka
 *
 * == equal to
 * != not equal
 * > greater than
 * < less than
 * >=
 * <=
 *
 * nece se izvrsiti svaka linija koda, ako su jednaki nisu razliciti itd ....
 */
public class ComparisonDemo {
    public static void main(String[] args) {

        System.out.println("unesite broj");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("unesite broj");
        int number2 = new Scanner(System.in).nextInt();

        if (number1 == number2){
            System.out.println("brojevi su jednaki");
        }
        if (number1 != number2){
             System.out.println("nisu jedaki ");
        }
    }
}
