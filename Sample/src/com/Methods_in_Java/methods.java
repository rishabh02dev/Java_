package com.Methods_in_Java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        //Find the sum of two numbers without the use of method
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = in.nextInt();
        System.out.println("Enter Number 2");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of two numbers is " + sum);

    }
}
