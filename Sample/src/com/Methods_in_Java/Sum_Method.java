package com.Methods_in_Java;

import java.util.Scanner;

public class Sum_Method {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);

    }

    //return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = in.nextInt();
        System.out.println("Enter Second Number");
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = in.nextInt();
        System.out.println("Enter Second Number");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of two numbers is " + sum);


    }
}
