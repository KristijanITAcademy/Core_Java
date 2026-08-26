package com.itacademy.seven.demo;

public class StringDemo {
    public static void main(String[] args) {
        String name1 = " Kristijan";
        String name2 = new String();
        String name3 = "kristijan";

        System.out.println(name2.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
    }
}
