package com.Pattern_Questions;

public class SecondPattern {
    public static void main(String[] args) {
        pattern2(5);
    }

    static void pattern2(int n){
        for (int row = 1; row<=n ; row++){
            //for every row , run the col
            for (int col = 1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
