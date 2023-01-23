package com.Methods_in_Java;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
//        String personalised = myGreet("Rishabh shukla");
//        System.out.println(personalised);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name sir");
        String name = in.nextLine();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
}
