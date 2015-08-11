package com.company.lessonsPDFFiller;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.jws.soap.SOAPBinding;

/**
 * Created by Никита on 07/14/15.
 */


public class StaticLesson {


    public static void main (String arg[]){
        User masha = new User();
        User Petya = new User();
        User Jenya = new User();
        User Andrey = new User();


        masha.name= "Sergey";
        masha.isGay = false;
        masha.sex = "man";
        gavno(masha);
        masha.age = 30;
        gavno(Petya);
        masha.age = 32;
        gavno(masha);

    }


    public static void gavno (User u) {
        System.out.println(u);


    }

}
