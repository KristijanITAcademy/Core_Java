package com.itacademy.eight.oop;

/**
 * klsa sluzi da definira tip podatka - blueprint
 */
public class Movie {
    public  String title;
    public String director;
   private int evaluation;

   private  static int counter = 0;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    public Movie(String title, String director, int evaluation) {
        this.title = title;
        this.director = director;
        this.evaluation = evaluation;


    }

    public void ocjeni(int ocjena) {
        if (ocjena <= 0) {
            evaluation = 1;
        } else if (ocjena > 10) {
            evaluation = 10;
        } else {
            this.evaluation = ocjena;
        }
    }
    public int dohvatiOcjenu (){
        return this.evaluation;
    };
}
