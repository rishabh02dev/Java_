package com.Linear_Search_Algorithm;

public class MaxWealthLeetCode {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts){
        //person = rol
        //account = col
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person<accounts.length; person++){
            //when you start a new column, take a new sum for that row

            for (int[] ints :accounts){
                int sum =0;
                for(int anInt :ints){
                    sum = sum+anInt;
                }
                if (sum >ans){
                    ans = sum;
                }

            }

            //now we have sum of accounts of person

            //check with overall answer


        }
        return ans;
    }
}
