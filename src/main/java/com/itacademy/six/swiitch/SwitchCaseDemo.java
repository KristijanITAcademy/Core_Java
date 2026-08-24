package com.itacademy.six.swiitch;

import java.util.Scanner;

/**
 * Postavka:
 *  - pravimo program koji ce omoguciti korisniku da unese redni broj dana u sedmici
 *  a program ispise ponedjeljak, utorak, srijeda, cetvrtak
 *
 *  Korisnik unese redn broj dana u sedmici a program ispise preostale dane u sedmici
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {

        // ovo radi zato sto nema break

        System.out.println("unesi redni brooj dana u sedmici");
        int dayWeekNumber = new Scanner(System.in).nextInt();
        String preostaliDani = "";
        switch (dayWeekNumber){
            case 1:
                preostaliDani = preostaliDani + "Ponediljak"; // stara vrijednost plus
            case 2:
                preostaliDani = preostaliDani + "Utorak";
            case 3:
                preostaliDani = preostaliDani + "Srijeda";
            case 4:
                preostaliDani = preostaliDani + "Cetvrtak";
            case 5:
                preostaliDani = preostaliDani + "Petak";
            case 6:
                preostaliDani = preostaliDani + "Subota";
            case 7:
                preostaliDani = preostaliDani + "Nedilja";
                break;
            default:
                System.out.println("sedmica ima 7 dana");
        };
        System.out.println(preostaliDani);
    }
}
