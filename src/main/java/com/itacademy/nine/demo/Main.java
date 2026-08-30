package com.itacademy.nine.demo;

import com.itacademy.nine.demo.Movie;

/**
 * toString smo naslijedili iz java.lang.Object
 *
 *
 */

public class Main {
    public static void main(String[] args) {

//         java.lang.Object
        Movie movie = new Movie(); // koristimo ga kao tip podatka
        movie.nam = "rambo";
        movie.director = "stallone";
        movie.setEvaluation(-1);
        System.out.println(movie.getEvaluation());

        Movie movie1 = new Movie();
        movie1.nam = "Wick";
        movie1.director = "Ante";
        movie1.setEvaluation(21);
        System.out.println(movie1.getEvaluation());


        Person person = new Person();
        person.setAge(25);
        System.out.println(person.getAge());

        Person person1 = new Person();
        person1.setAge(10);
        System.out.println(person1.getAge());


        int brojac = Movie.getCounter();
        System.out.println(brojac);
    }
}
