package com.itacademy.ten.human;


/**
 * nemoze se pozvati prije konstruktora
 */

import com.itacademy.ten.animal.Dog;

import java.time.LocalDate;

public class Student extends Person {
    public String indexNumber;

    public Student(String name, String surname, LocalDate birthday, String indexNumber) {
        super(name, surname, birthday);
        this.indexNumber= indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

}
