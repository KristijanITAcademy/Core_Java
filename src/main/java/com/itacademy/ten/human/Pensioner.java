package com.itacademy.ten.human;

import java.time.LocalDate;

public class Pensioner extends Person {
    public double pensionAmount;

    public double getPensionAmount() {
        return pensionAmount;
    }

    public void setPensionAmount(double pensionAmount) {
        this.pensionAmount = pensionAmount;
    }

    public Pensioner(LocalDate birthday, double pensionAmount) {
        super(birthday);
        this.pensionAmount = pensionAmount;

    }
}
