package com.Linear_Search_Algorithm;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,89,34,56},
                {18,12}
        };
        //format of return value (Row,col)
        System.out.println(max(arr));
    }


    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row<arr.length; row++){
            for (int col = 0 ; col<arr[row].length; col++){
                if(arr[row][col] >max){
                   max = arr[row][col];
                }
            }
        }
        return max;
    }
}




