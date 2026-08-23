package com.itacademy.five.array;

/**
 * kopiranje iz jednog niza u drugi niz
 */
public class ArrayCopyDem {
    public static void main(String[] args) {

        // zauzeo dva slota
        char [] copyFrom = {'d', 'c','d'};
        char [] copyTo = new char[2];
        System.arraycopy(copyFrom, 1, copyTo,0,2);
        System.out.println(copyTo);
    }
}
