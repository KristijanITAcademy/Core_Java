package com.itacademy.six.zadaca;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        System.out.println("Korisnice unesi dva broja i operator da dobijes rezultat");
        System.out.println();
        System.out.println("unesi prvi broj: ");
        int firstNum = new Scanner(System.in).nextInt();
        System.out.println("Unesi operator");
        char operator = new Scanner(System.in).next().charAt(0);
        System.out.println("unesi drugi broj");
        int secondNum = new Scanner(System.in).nextInt();
        int result = switch (operator){
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '/' -> firstNum/secondNum;
            case '*' -> firstNum * secondNum;
            default -> 0;
        };
        System.out.println("Za unesenu operaciju %s rzultat je %s".formatted(operator,result));
    }
}
