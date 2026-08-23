package com.itacademy.four.operator;

/**
 * operator + u Stringovima spaja a u matematici zbraja
 */
public class ConcatDemo {
    public static void main(String[] args) {

        char slovo = 'M';
        String name = "Kristijan";

        //operator
        int number1 = 23;
        int number2 = 33;
        int result =  number1 + number2;
        System.out.println("Result is: " + result);

        String poruka = name + " " + result;
        System.out.println(poruka);
    }
}
