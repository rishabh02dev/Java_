package com.Strings.StringIntro;

public class Comparision {
    public static void main(String[] args) {
        String a = "kunal";
        String b = "kunal";

        String c = a;
        System.out.println(c ==a);

        //==
//        System.out.println(a==b);

        String name1 = new String("kunal");
        String name2 = new String("kunal");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
    }


}
