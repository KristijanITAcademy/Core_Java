package com.itacademy.six.zadaca;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.out.println("unesi neko od slova D, H, C, P i dobit ces naziv zivotinje");
        char c = new Scanner(System.in).next().charAt(0);
        char slovo = Character.toUpperCase(c);
        String nameAnimal = switch (slovo){
            case 'D' -> "Dog";
            case 'P' -> "Parrot";
            case 'H' -> "Horse";
            case 'C' -> "Cat";
            default -> "unknown animal";
        };
        String message = " Za izabrano slovo %s zivotinja je %s".formatted(slovo,nameAnimal);
        System.out.println(message);
    }
}
