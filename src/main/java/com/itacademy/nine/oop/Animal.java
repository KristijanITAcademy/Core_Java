package com.itacademy.nine.oop;

/**
 * Klasa po cijem sablonu ne mozemo kreirati objekat
 * abstract klase sluze da nametnu sablon ponasanja klasama koje ce naslijediti ovu klasu
 *
 * sustina postojanja fielda je da se ubaci vrijednost
 * sustina postojanja funkcije je da se izvrsi njen blok koda kada se pozove
 *
 * pattern ponasanja
 *
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void playSound(){
    }
}
