package com.Strings;

import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));
        //this is same as after a few steps: "a+"1"
        // integer will be converted to Integer to Integer that will
        //toString()

        System.out.println("kunal" + new ArrayList<>());
        System.out.println("kunal" + new Integer(56));
    }
}
