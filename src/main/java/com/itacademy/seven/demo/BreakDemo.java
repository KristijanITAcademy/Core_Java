package com.itacademy.seven.demo;

import java.util.Random;
import java.util.Scanner;

/**
 * Program:
 *  imas niz brojevaa 37, 86, 67, 33, 23, 3000, 8, 127
 *  pusti korisnika da unosi neki broj
 *
 *  program izbaci sretan pokusaj ako je broj iz niza ili nesretan pokusaj ako nije
 */
public class BreakDemo {
    public static void main(String[] args) {
            int [] array = {37, 86, 67, 33, 23, 3000, 8, 127};
        System.out.println("unesi cijeli broj broj i okusaj srecu");
        int enteredNumber = new Scanner(System.in).nextInt();
       String message;
       switch (enteredNumber){
           case 37, 86, 67, 33, 23, 3000, 8, 127:
               message = "Sretan pokusaj";
               break;
           default: message = " nesretan pokusaj";
       }
        System.out.println(message);
    }
}
