package com.Linear_Search_Algorithm;

import java.util.Arrays;

public class SearchinStrings {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
        System.out.println(search(name,  target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }
    //Now doing the same using foreach

    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }


    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for (int i =0; i<str.length(); i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
