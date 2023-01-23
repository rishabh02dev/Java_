package com.Methods_in_Java;

import java.util.Arrays;

public class Change_Valueexample {
    public static void main(String[] args) {
        //Create an array
        int[] arr = {1, 3, 2, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99; //If you make a change to the object via refernce variable then it will relfect that change.

    }
}
