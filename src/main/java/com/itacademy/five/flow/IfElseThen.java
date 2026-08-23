package com.itacademy.five.flow;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Postavka zadatka:
 * Potrebno je napraviti program koji ce olaksati ocjenjivanje
 * Profa ce se fokusirti za evaluaciju vaseg rada i zbir poena
 * profa ce deinirati score
 * Dakle dat ce input po broju ostvarenih poena
 * Ono sto program mora izracunati jest grade
 */
public class IfElseThen {
    public static void main(String[] args) {

        //vrlo vazan je ovdje je redoslijed

        System.out.println("Unesite broj ostvarenih poena: ");
        int score = new Scanner(System.in).nextInt();
        char grade; // varijbla koja ce definirati ocjenu na osnovu score
        if (score >= 90){
            grade = 'A';
        }else if (score >=80){
            grade = 'B';
        } else if (score >= 65) {
            grade = 'C';
        }else {
            grade = 'F';
        }
        System.out.println("ocjena na ispitu je: " + grade);
    }
}
