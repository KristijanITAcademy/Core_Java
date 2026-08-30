package com.itacademy.ten.animal;

public class Sheep extends Animal{
    public Sheep(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("bee bee");
    }
}
