package com.Shadow_Effect;

public class Shadow {
    static int x = 90; //this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x ; //the class variable at line 4 is shadowed by this
//        System.out.println(x); //scope will begin when value is instialised.
        x = 40;

        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
