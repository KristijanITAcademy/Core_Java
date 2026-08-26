package com.itacademy.six.loop.zadacaloop;

import java.util.Random;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        System.out.println("Korisnice unosi broj dok ne pogodis");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int uneseniBroj;
        int randomBroj;

        randomBroj = random.nextInt(21);
        for (int i = 0; i < 5; i++) {
            uneseniBroj = scanner.nextInt();

            if (uneseniBroj == randomBroj) {
                System.out.println("pogodili ste");
                break;
            } else {
                System.out.println("ponovi pokusaj");

            }
        }
    }
}
