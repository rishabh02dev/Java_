package com.BInarySearchAlgorithm;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[] = {99,80,75,22,11,10,5,2,-3};
        int target = 22;
        int ans = orderAgnosticsBS(arr, target);
        System.out.println(ans);



    }


    static int orderAgnosticsBS(int [] arr ,int target){
        int start = 0;
        int end = arr.length-1;

        //find whether the given array is in the ascending or the
        //descending order
        boolean isAsc;
        if(start>end){
            isAsc = true;
        }else{
            isAsc = false;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else if(target>arr[mid]){
                    start = mid +1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid-1;
                }else if(target<arr[mid]){
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
