package com.Linear_Search_Algorithm;

import com.sun.source.tree.BinaryTree;

public class EvenDigitsLeetcode {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    //function to check whether a numbers contains even digits or not
    static int findNumbers(int[] nums){
        int count =0;
        for(int num:nums){
        if(even(num)){
            count++;
        }
    }
        return count;
    }

    static boolean even(int nums) {
        int numberOfDigits = digits(nums);
        return numberOfDigits % 2 == 0;
    }
    //count the number of digits in a number
    static int digits(int num){
        int count =0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }






}

