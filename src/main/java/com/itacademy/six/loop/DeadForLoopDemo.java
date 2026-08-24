package com.itacademy.six.loop;

import java.util.Scanner;

public class DeadForLoopDemo {
    public static void main(String[] args) {
        System.out.println("unesi broj");
        int tajniBroj = 23;
        for (; ; ) {
            int uneseni = new Scanner(System.in).nextInt();
            if (uneseni == tajniBroj) {
                System.out.println("pogodio si");
                break;
            }else {
                System.out.println("unosi opet");
            }
        }
    }
}
