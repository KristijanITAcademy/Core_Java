package com.itacademy.nine.oop;

/**
 * oop - abstraction
 */
public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("I am cat mjau mjau");
    }
}
