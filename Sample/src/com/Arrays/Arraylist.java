package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        //syntax
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(45);
        list.add(67);
        list.add(45);
        list.add(67);
        list.add(45);
        list.add(67);
        list.add(45);

        System.out.println(list.contains(4555));
        System.out.println(list.set(0 , 122));
        System.out.println(list);

        //input

        for (int i = 0; i<5; i++){
            list.add(in.nextInt());
        }

//        output
         for (int i =0; i<5; i++){
             System.out.println(list.get(i)); //pass index here, list[index] syntax doesn't work here.
         }



    }
}
