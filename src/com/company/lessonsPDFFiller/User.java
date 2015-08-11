package com.company.lessonsPDFFiller;

/**
 * Created by Никита on 07/14/15.
 */


public class User {

    public static int age = 22;
    public String  name;
    public static boolean isGay = false;
    public String sex;



    @Override
    public String toString(){
        return "Age: " + age  + "\nName: " + name + "\nSex: " + sex +"\nisGay: "+ isGay ;
    }

}
