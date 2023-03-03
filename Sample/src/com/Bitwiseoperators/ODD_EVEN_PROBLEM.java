package com.Bitwiseoperators;

public class ODD_EVEN_PROBLEM {

    public static void main(String[] args) {
        int n = 67;
        System.out.println(isOdd(67));
    }

    private static boolean isOdd(int n){
        return (n & 1) ==1;
    }

}
