package com.itacademy.nine.oop;

public class Dog extends Animal{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("I am dog vau vau ");

    }
}
