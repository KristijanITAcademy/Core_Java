package com.itacademy.six.loop.zadacaloop;

import java.util.Random;
import java.util.Scanner;

public class SixZad {
    public static void main(String[] args) {
        System.out.println("Korisnice unosi broj dok ne pogodis");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int uneseniBroj;
        int randomBroj;

        do {
            uneseniBroj = scanner.nextInt();
            randomBroj = random.nextInt(20);
            if (uneseniBroj == randomBroj) {
                System.out.println("pogodili ste");
            } else {
                System.out.println("ponovi pokusaj");
            }
        }while (uneseniBroj != randomBroj);
    }
}
