package com.Linear_Search_Algorithm;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
//        int ans = linearSearch(nums, target);
//        System.out.println(ans);

        int ans2 = linearSearch2(nums, target);
        System.out.println(ans2);
    }

//    static int linearSearch(int[] arr , int target){
//        if(arr.length==0){
//            return -1;
//        }
//        for (int index = 0; index<arr.length; index++){
//            int element = arr[index];
//            if( element ==  target){
//                return index;
//            }
//        }
//        return -1;
        //Now we are returning the element itself instead of its index value
        static int linearSearch2(int[] arr , int target){
            if(arr.length==0){
                return -1;
            }
            for (int element:arr){
                if( element ==  target){
                    return element;
                }
            }
            return Integer.MAX_VALUE;
    }

    //NOW ARE RETURNING THE TRUE OR FALSE LIKE WHETHER IT CONTAINS IT OR NOT IN THE FORM OF TRUE AND FALSE;

    static boolean linearSearch3(int[] arr , int target){
        if(arr.length==0){
            return false;
        }
        for (int element:arr){
            if( element ==  target){
                return true;
            }
        }
        return false;
    }

    public static class SearchInRange {
        public static void main(String[] args) {
            int[] arr = {18,12,-7,3,14,28};
            int target = 3000;
            System.out.println(linearSearch(arr, target,1,4));

        }

        static int linearSearch(int[] arr , int target, int start, int end){
            if (arr.length==0){
                return -1;
            }
            //run a for loop
            for (int index = start; index<=end; index++){
                //check for element at every index if it is == target
                int element = arr[index];
                if(element== target){
                    return index;
                }
            }
            return -1;
        }
    }
}
