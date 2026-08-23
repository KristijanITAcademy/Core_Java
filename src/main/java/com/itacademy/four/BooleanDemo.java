package com.itacademy.four;

import java.util.Scanner;

/**
 * ubaciti samo true ili false vrijednost izraz kako god
 */
public class BooleanDemo {
    public static void main(String[] args) {
        System.out.println("Hej kako se zoves, ispisi svoje ime u konzolu");
        int broj = new Scanner(System.in).nextInt();
        boolean condition = broj== 23; // mora biti uvjet
        if (condition){
            System.out.println("zadovoljio si");
        }else {
            System.out.println("nisi zadovoljio");
        }
    }
}
