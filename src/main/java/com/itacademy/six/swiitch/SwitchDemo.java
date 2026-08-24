package com.itacademy.six.swiitch;

import java.util.Scanner;

/**
 *
 *
 *
 * Postavka zadatka:
 * korisnik unosi redni broj mjeseca
 * korisnik unosi i godinu 2000
 *
 * Program iracuna koliko mjesec ima dana
 *
 * Moguci reultati : 31, 30, 28, 29
 *
 *
 * switch sa spojenim caseovima
 */
public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Korisnice unesite redni broj mjeseca");
        int redniBroj = new Scanner(System.in).nextByte();
        System.out.println("unesite i godinu");
        int godina = new Scanner(System.in).nextInt();
        int brojDana = switch (redniBroj){
            case 1, 3, 5, 7, 8, 10, 12 -> brojDana = 31;
            case 4,6,9,11 -> brojDana = 30;
            /**
             * sve prijestupne godine su djeljive sa 4 ako nisu djeljive sa 100,
             * kojima se dodaju one djeljive sa 400
             */
            case 2 -> {
                boolean prestupna = (godina % 4 == 0 && godina% 100 !=0) || (godina % 400 ==0);
                yield prestupna ? 29 : 28;
            }
            default -> brojDana = 0;

        };
        System.out.println("Za uneseni mjesec " + redniBroj + " i godinu " + godina +
                ", broj dana je jednak " + brojDana );


        /**
         * biblioteka Java DateTimeAPI
         */
    }
}
