package com.itacademy.seven.demo;

import java.util.Scanner;

public class BreakDemo3 {


    public static void main(String[] args) {
        int [][] arraysNumbers = {
                {22,33,55,44,66},
                {34,567,80,43,5},
                {87,9,89,67,56}
        };
        System.out.println("unesi cijeli broj i okusaj se");
        int enteredNumber = new Scanner(System.in).nextInt();
        String message = "Nesretan pokusaj";

        KRISTIJAN:
        for (int i = 0; i <arraysNumbers.length ; i++) {

            for (int j = 0; j< arraysNumbers[i].length; j++) {
                int numberArray = arraysNumbers[i][j];
                if (numberArray == enteredNumber) {
                    message = " sretan pokusaj nalazi se na poziciji [ " +i+ " ] [" +j+"]";
                    break KRISTIJAN;
                }
            }

        }
        System.out.println(message);
    }
}
