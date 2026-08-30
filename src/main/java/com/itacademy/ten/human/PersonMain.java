package com.itacademy.ten.human;

import com.itacademy.ten.animal.Animal;
import com.itacademy.ten.animal.Cat;
import com.itacademy.ten.animal.Dog;

/**
 *
 * OOP principles
 *  - enkapsulacija
 *  - abstraction
 *  - inheritance
 *  - polimorfizam - direktna posljedica nasljedivanja, visetipna varijabla
 *      ->
 */
public class PersonMain {
    public static void main(String[] args) {

        Animal animal = new Dog("Lesi");
        animal.playSound(); // aw aw\
        System.out.println();
        // visetipna varijabla
        System.out.println("u onom momentu kad varijabla promijeni oblik, polimorfizam, istoimena metoda razlicit blok koda ");
        System.out.println();
        animal = new Cat("Ciciko");
        animal.playSound();// mjau mjau

    }
}
