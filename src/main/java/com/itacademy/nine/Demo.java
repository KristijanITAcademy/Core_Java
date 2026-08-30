package com.itacademy.nine;

import java.util.stream.Stream;

/**
 * TIP PODATKA VARIJABLA = VRIJEDNOST
 * prvi slozeni tip podatka je niz, moze sacuvati vise vrijednosti u jednpj varijabli
 */
public class Demo {
    public static void main(String[] args) {
            int [] numbers = new int[2];
            numbers[0] = 22;
            numbers[1] = 23;

            //Enhanced for loop
//            for (int broj : numbers){
//                System.out.print(broj+"");
//            }

        Stream.of(numbers).forEach(System.out::println);
        System.out.println();

        /**
         * Dva ohranicenja unutar niza :
         *  -fiksna duzina, svi moraju biti istog tipa
         */
    }
}
