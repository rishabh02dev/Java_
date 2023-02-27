package com.Recursion;

public class FirstRecursionP1 {
    public static void main(String[] args) {
        print(1);
    }


    static void print(int n){

        //base condition
        if(n==5){
            System.out.println(5);
            return;
        }

        System.out.println(n);

        //recurvise call
        //if you are calling a function again and again , you can treat is as a recurvsive function

        print(n+1);
    }
}


