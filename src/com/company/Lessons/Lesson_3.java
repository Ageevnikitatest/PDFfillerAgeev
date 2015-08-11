package com.company.Lessons;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Никита on 01/04/15.
 */
public class Lesson_3 {
    public static void main(String[] args) {
        String[] s = {"Hello", "Class", "."};
        List<String> f = new ArrayList<String>();
        f.add("Privet");
        f.add("Java");
        f.add("....");
        System.out.println(f.get(0) + " " + f.get(1) + " " + f.get(2));
        System.out.println(f.get(1));
        System.out.println(f.get(2));
        System.out.println(s.length);
        System.out.println(f.size());


    }
}
