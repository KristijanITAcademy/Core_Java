package com.itacademy.six.swiitch;

import java.util.Scanner;

/**
 * Korisnik unese teksutalnu vrjednost tipa String Ukoliko je ispravno unio ime dana u sedmici dobit ce redni broj dana.
 *
 */
public class StringSwitchDemo {
    public static void main(String[] args) {

        System.out.println("Unesi ime dana u sedmici i dobit ces redni broj dana");
        String dayName = new Scanner(System.in).nextLine();
        int dayNumber = switch (dayName) {
            case "Ponedjeljak" -> 1;
            case "Utorak" -> 2;
            case "Srijeda" -> 3;
            case "Cetvrtak" -> 4;
            case "Petak" -> 5;
            case "Subota" -> 6;
            case "Nedjelja" -> 7;
            default -> 0;

        };
        String message = "Za uneseni dan u tjednu '%s' redni broj je '%s' " .formatted(dayName,dayNumber);
        System.out.println(message);
    }
}
