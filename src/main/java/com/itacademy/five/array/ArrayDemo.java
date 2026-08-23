package com.itacademy.five.array;

/**
 * slozeni ili objektni
 */
public class ArrayDemo {
    public static void main(String[] args) {

        int number = 23; // prosti tipovi nose samo jednu vrijednost
        System.out.println(number);
        number = 22; // ja sam prosta varijabla ja ne mogu pamtiti nego jednu vrijednost
        System.out.println(number); //
        //ukoliko zelim varijablu koja pamti dvije vrijednosti pamti i 23 i 22 trebam array kao TIP

        // zauzimam prostor od 2 x 32 bita
        int [] numbers = new int[2];// varijabla koja moze primiti dva cijela broja
        numbers[0] = 22;
        numbers[1] = 23;
        //numers[2] - ArraysindexOutOfBoundsException - exception Error
        System.out.println("Element of index" + numbers [0]); // pristup zapisnim vrijednostima
        System.out.println("Element of index" + numbers [1]); // pristup zapisnim vrijednostima


        /**
         * Drugi nacin samo kada su nam unaprijed poznati svi brojevi
         */
        //1.korak i jedini 7 x 32 bita krece od 0 pozcije itd
        int[]  numbers2= {1,2,3,4,5,6,7};


    }
}
