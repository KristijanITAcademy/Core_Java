package com.itacademy.six.loop.zadacaloop;

import java.util.Scanner;

public class FourZad {
    public static void main(String[] args) {
        System.out.println("Korisnik unesi broj");
        int suma = 0;
        for (;;){
            int unosi = new Scanner(System.in).nextInt();
            if (unosi >= 0){
                suma+= unosi;
            }else {
                System.out.println("unio si negativan broj evo ti suma");
                System.out.println();
                System.out.println("Suma svih unesenih brojeva jest: " + suma);
                break;
            }
        }
    }

}
