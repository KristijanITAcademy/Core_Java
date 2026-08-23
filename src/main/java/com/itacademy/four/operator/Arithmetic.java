package com.itacademy.four.operator;

import java.util.Scanner;

/**
 * Aritmeticki operator:
 * 1. + Additive
 * 2. - Substraction
 * 3. * Multiplication
 * 4. / Divison
 * 5. % Remainder - ostatak od dijeljenja
 *
 * Debug mod..izvrsava se do linije gdje smo stavili bug
 */
public class Arithmetic {
    public static void main(ConcatDemo[] args) {

        System.out.println("Dobrodosli u sistem.....");
        System.out.println("Unesite prvi broj");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("unesite drugi broj");
        int number2 = new Scanner(System.in).nextInt();

        int suma = number1 + number2;
        System.out.println("Suma je: " + suma);

        int razlika = number1 - number2;
        System.out.println("razlika:" + razlika);
        int multiplication = number1 * number2;
        System.out.println("proizvod: " + multiplication);
        int division = number1/number2;
        System.out.println("division:" + division);
        int remainder =  number1%number2; // 36/11 je 3 i ostatak je 3
        System.out.println("remainder:" + remainder);
    }
}
