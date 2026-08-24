package com.itacademy.six.zadaca;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        System.out.println("Unesi ime drzave i dobis glavni grad");
        String countryName = new Scanner(System.in).nextLine();
        String cityCapital = switch (countryName.toLowerCase()){
            case "croatia" -> "Zagreb";
            default -> "Drzava ne postoji";
        };
        System.out.println(cityCapital);
    }
}
