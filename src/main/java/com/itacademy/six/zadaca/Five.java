package com.itacademy.six.zadaca;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        System.out.println("Unesi ime dana i dobis da li je vikend ili radni dan");
        String nameDay = new Scanner(System.in).nextLine();
        String currentDay = switch (nameDay){
          case "Ponedjeljak", "Utorak", "Srijeda", "Cetvrtak", "Petak" -> "Radni dan";
          case "Subota", "Nedjelja" -> "Vikend";
            default -> "Taj dan ne postoji";
        };
        System.out.println(currentDay);
    }
}
