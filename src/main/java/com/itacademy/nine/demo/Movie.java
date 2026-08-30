package com.itacademy.nine.demo;

/**
 * Klasa se koristi kao tip podatka po cijem sablonu mozemo kreirati varijable slozenog
 * tipa Movie. Znaci ovdje kreiramo negdje drugdje koristimo tj u main
 *
 * tek kad postoji objekat onda mozemo postaviti..
 *
 */
public class Movie {

    private  static int counter = 0;
    public String nam;
    public String director;
    private int evaluation; // ako je private vidljivosti, vidljivo je samo u tijelu klase


    //parametar funkcije je vidljiv samo unutar funkcije

    //kad je funkcija void ona samo izvrsava blok koda, nema povratnu vrijednost
    //void znaci praznina, sustina joj je samo  izvrsavati kod
    // kada zelimo dobit konkretnu vrijednost funkcije, onda moramo reci kog tipa mora biti
    // jer zelimo ubrizgati vrijednost u polje evaluation, gore - polje klase
    public void setEvaluation(int evaluation) {
        if (evaluation<=0){
        this.evaluation = 1;
        }else if (evaluation>=10){
            this.evaluation = 10;
        }else {
            this.evaluation = evaluation; // ovo znaci uzmi vrijednost parametra i spremi ju
            // varijablu evaluation objekta
            //this.evaluation je objekat a iza znaka dodjele jest vrijednost parametra
        }
        // ovaj kod je tocniji jer daje 3 mogucnosti..1, 10, ili vrijednost koja je, stvarna vrijednost
    }

    public int getEvaluation() {
        return evaluation;
    }

    public static int getCounter() {
        return counter;
    }
}
