package com.company.Lessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Никита on 07/04/15.
 */
public class Zadanie_5 {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        String s = "Hello";


        String m = multiply(s, 5);
        String k = multiply(s,b);


        System.out.println(m);
        System.out.println (k);
        System.out.println(multiplyNewLine("NewLine", a));
        System.out.println(multiplyNewLine("Hey, this one on new line", 3));
        System.out.println(multiply1(3, "switch"));
        System.out.println(multiply1(1, "switchAgain"));

    }

    public static String multiply(String j, int j1){

        String result = "";
        for (int i=0; i < j1; i++ ){
            result += j;

        }
    return result;

    }
 public  static  String multiplyNewLine (String p, int p1) {

     String result1 = "";
     for (int t = 0; t < p1; t++) {
         result1 += p + "\n";
     }
     return result1;
 }

    public static String multiply1( int j2, String j3){

        String result3 = "";
        for (int i=0; i < j2; i++ ){
            result3 += j3;

        }
        return result3;



}}
