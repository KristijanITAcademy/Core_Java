package com.itacademy.six.swiitch;

import java.time.LocalDate;
import java.time.Period;

public class TimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1996,11,22);
        Period period = birthday.until(today);
        System.out.println(period.getYears());
    }
}
