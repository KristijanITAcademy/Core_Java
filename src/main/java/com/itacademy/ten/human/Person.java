package com.itacademy.ten.human;

import com.itacademy.ten.animal.Animal;
import com.itacademy.ten.animal.Dog;

import java.time.LocalDate;
import java.time.Period;

/**
 * zbog kontrolisanog ubacivanja vrijednosti u polja, enkapsulacija , treba da budu privatne vidljivosti
 * - kontrolirano ubacivanje vrijednosti
 *  - treba nam nekakva funkcija tj set funkcija, javno vidljiva da bi se mogla pozvati
 *
 *
 * relacija KOMPOZICIJE - sadrzi
 * to je veza izmedu Persom i LocalDate
 *
 * java.time
 */
public  class Person {
    private String name;
    private String surname;
    private LocalDate birthday;
    private Animal animal;

    public Person(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public int getAge(){
        LocalDate now = LocalDate.now();
        Period period = birthday.until(now);
        int years = birthday.getYear();
        return 0;
    }
}
