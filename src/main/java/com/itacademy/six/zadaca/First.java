package com.itacademy.six.zadaca;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.println("Unesi broj mjeseca da dobijes ime mjeseca");
        int uneseniBroj = new Scanner(System.in).nextInt();
        String monthName = switch (uneseniBroj){
            case 1 -> "Sijecanj";
            case 2 -> "Veljaca";
            case 3 -> "Ozujak";
            case 4 -> "Travanj";
            case 5 -> "Svibanj";
            case 6 -> "Lipanj";
            default -> null;
        };
        String message = "Za uneseni redni broj %s naziv mjeseca je %s".formatted(uneseniBroj, monthName);
        System.out.println(message);
    }
}
