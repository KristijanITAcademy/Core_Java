package com.itacademy.seven.demo;

import java.util.Scanner;

public class BreakDemo2 {
    public static void main(String[] args) {
        int [] array = {37, 86, 67, 33, 23, 3000, 8, 127};
        System.out.println("unesi cijeli broj broj i okusaj srecu");
        int enteredNumber = new Scanner(System.in).nextInt();
        String message =" nesretan pokusaj";
        for (int i = 0; i < array.length; i++) {
            int numberInArray = array[i];
            if (enteredNumber == numberInArray){
                message ="sretan pokusaj broj se nalazi na poziciji ["+i+"]";
                break;
            }
        }
        System.out.println(message);
    }
}
