package com.itacademy.eight.oop;

/**
 * funkcija je blok koda koji s izvrsi kada je neko pozove
 *
 */
public class MovieDemo {
    public static void main(String[] args) {
        Movie movie = new Movie("Croation", "Ante", 10);
        movie.dohvatiOcjenu();
        System.out.println(movie);
    }
}
