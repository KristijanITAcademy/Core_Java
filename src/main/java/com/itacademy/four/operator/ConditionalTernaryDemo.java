package com.itacademy.four.operator;

import java.util.Scanner;

public class ConditionalTernaryDemo {
    public static void main(String[] args) {
        System.out.println("koliko je dva + dva");

        int result = new Scanner(System.in).nextInt();
        boolean uslovTocnosti =  result == 4;
        String message = uslovTocnosti ? "Tocno" : "Netacno"; // ternarni operator
//        if (uslovTocnosti){
//            message = " tocno";
//        }else {
//            message = " netocno";
//        }
        System.out.println(message);
    }
}
