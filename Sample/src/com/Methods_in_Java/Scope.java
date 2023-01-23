package com.Methods_in_Java;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
//            int a = 78; //already intialised outside this block can't be intialised again
              a = 67;
              //now the orginal one is going to change so outside this block it will show
//            67 too.
              int c  = 99;
              //values intialised in this block, will remain in the block
        }
        //system.out.print(c); //cannot use outside the block
    }
}
