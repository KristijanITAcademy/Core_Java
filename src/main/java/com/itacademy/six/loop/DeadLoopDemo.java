package com.itacademy.six.loop;

import java.util.Scanner;

/**
 * guess number ?
 * Program treba da pusti korisnika da unosi broj sve dok ne unese 23
 *
 */
public class DeadLoopDemo {
    public static void main(String[] args) {

        int tajniBroj = 23;
        while (true) {
            System.out.println("Unesi broj");
            int uneseni = new Scanner(System.in).nextInt();
            if (uneseni == tajniBroj) {
                System.out.println("pogodio si");
                break;
            }else {
                System.out.println();
                System.out.println("kucaj opet");
            }
        }
    }
}
