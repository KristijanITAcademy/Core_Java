package com.itacademy.nine.demo;

public class Person {

    public String name;
    public String surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int godine) {
        if(godine >18){
            System.out.println("punoljetan");
        }else if (godine < 18){
            System.out.println("maloljetan");
        }else {
            this.age = godine;
        }
    }
}
