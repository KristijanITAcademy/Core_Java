package com.itacademy.six.loop.zadacaloop;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        System.out.println("unesi neki broj");
        int uneseni = new Scanner(System.in).nextInt();
        do {
            System.out.println(uneseni);
            uneseni--;
        }
        while (uneseni >=1);
    }
}
