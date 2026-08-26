package com.itacademy.six.loop.zadacaloop;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.println("Korisnice unesi broj");
        for (;;) {
            int number = new Scanner(System.in).nextInt();
            if (number<0){
                System.out.println("unesi opet");
            }else {
                System.out.println("vani si");
                break;
            }
        }
    }
}



