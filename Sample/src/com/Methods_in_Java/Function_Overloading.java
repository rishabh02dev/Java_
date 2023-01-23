package com.Methods_in_Java;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class Function_Overloading {
    public static void main(String[] args) {
        int ans = sum(3,4);
        System.out.println(ans);

        int sum = sum(4,5,6);
        System.out.println(sum);
//        fun(2);
//        sum("rishuu");
        demo(1,2,3,4,5);
        demo("rishu" , "rishu");

        //But if we only give this demo() then the program will return an error because of the ambiguity caused by the confusion between which method to take whether it is
//        integer or string

    }
    static int sum(int a , int b){
        return a +b;
    }
    static int sum(int a ,int b , int c){
        return a + b +c;
    }

    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }
    static void sum(String name){
        System.out.println("Second One");
        System.out.println(name);
    }
}
