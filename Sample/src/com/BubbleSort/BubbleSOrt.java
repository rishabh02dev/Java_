package com.BubbleSort;

import java.util.Arrays;

public class BubbleSOrt {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int [] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i< arr.length; i++){
            swapped = false;
            //for each step , max iteam will come at the last respective position
            for (int j = 1; j<arr.length-i;j++){
                //swap if the item is smaller than previous item

                if(arr[j]<arr[j-1]){
                    //swap

                    int temp = arr[j];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i it means that the given array is already sorted hance stop
//            the swapping
            if(!swapped){
                break;
            }
        }
    }
}
