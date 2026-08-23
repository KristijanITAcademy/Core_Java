package com.itacademy.five.flow;

import java.util.Scanner;

/**
 * sastoji se od Switch case break
 *
 * Sedmica ima 7 dana,
 * unesite redni broj dana u sedmici i dobit ce te ime dana
 * yield - proizvedi rezultat,daj rezultat itd
 */
public class SwitchDemo {
    public static void main(String[] args) {


            System.out.println("Unesi redni broj dana i dobis naziv dana u sedmici");
            int uneseniBroj = new Scanner(System.in).nextInt();
            String dayName = switch (uneseniBroj) {
                case 1 -> "Ponediljak";
                case 2 -> "Utorak";
                case 3 -> "Srijeda";
                case 4 -> "Cetvrtak";
                case 5 -> "Petak";
                case 6 -> "Subota";
                case 7 -> "Nedjelja";
                default -> "Sedmica ima 7 dana";
            };
            System.out.println(dayName);
        }
    }

