package com.itacademy.ten.human;

import java.time.LocalDate;

/**
 * treba razumijeti veze da znamo uvesti inheritanceili kompozitna veza
 */
public class Employee extends Person {
    public double salarayAmount;

    public Employee(String name, String surname, LocalDate birthday, double salarayAmount) {
        super(name, surname, birthday);
        this.salarayAmount = salarayAmount;
    }

    public double getSalarayAmount() {
        return salarayAmount;
    }

    public void setSalarayAmount(double salarayAmount) {
        this.salarayAmount = salarayAmount;
    }

}
