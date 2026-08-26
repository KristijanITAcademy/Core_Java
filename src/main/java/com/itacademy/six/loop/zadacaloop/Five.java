package com.itacademy.six.loop.zadacaloop;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unos;
        do {
        System.out.println("Korisnice imas menu na izbor: ");
        System.out.println("1.Start, 2.Help, 3.Exit, odaberi jedan");
         unos = scanner.nextInt();

            if (unos == 1) {
                System.out.println("Start");
            } else if (unos == 2) {
                System.out.println("Help");
            } else if (unos == 3) {
                System.out.println("exit");
            } else {
                System.out.println("ta opcija menia ne postoji");
                    }
            }while (unos != 3);
        }
}
