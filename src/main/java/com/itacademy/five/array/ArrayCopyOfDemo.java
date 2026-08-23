package com.itacademy.five.array;

import java.util.Arrays;

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        char [] copyFrom = {'d', 'c','d'};
        char [] copyTo = Arrays.copyOfRange(copyFrom,1,3);
        System.out.println(copyTo);
    }
}
