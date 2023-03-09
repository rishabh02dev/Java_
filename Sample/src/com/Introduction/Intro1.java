package com.Introduction;

public class Intro1 {
    public static void main(String[] args) {
        //store 5 roll nos

        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];


        //data of 5 students:
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        //just declaring:
//        Student kunal;
//        kunal = new Student();

        Student kunal = new Student(13,"Kunal" ,89.34f);
        Student Rahul = new Student();

//        kunal.rno = 13;
//        kunal.name = "kunal kushwaha";
//        kunal.marks = 88.5f;

//          kunal.greeting();

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        System.out.println(Rahul.rno);
        System.out.println(Rahul.name);
        System.out.println(Rahul.marks);


    }
}
//create a class
//data for a every single student
class Student {
    int rno;
    String name;
    float marks = 90;


    //we need a way to add the values of the abobe properties object by object

    //we need a word to access every object

    void greeting(){
        System.out.println("hello my name is " + this.name);
    }
    Student(){
        this.rno = 13;
        this.name = "ronit";
        this.marks = 23.45f;
    }
    Student(int rno , String name, Float marks){
        this.rno = rno;
         this.name = name;
         this.marks = marks;
    }
}