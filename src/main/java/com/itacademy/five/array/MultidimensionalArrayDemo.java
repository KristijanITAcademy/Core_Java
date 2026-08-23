package com.itacademy.five.array;

public class MultidimensionalArrayDemo {
    public static void main(String[] args) {
        String[] names = {"Marko", "Kiko"};
        char slovo = 'a';
        String[][] array = {
                {"Her", "her"},
                {"Kristijan", "Ivan"}
             };
        System.out.println(array[0][0] + " " + array[1][0]);
        System.out.println(array.length);
        System.out.println(array[0].length); // duzina niza
        System.out.println(array[1].length);
        }
    }