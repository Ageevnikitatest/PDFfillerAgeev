package com.company.lessonsPDFFiller;

import org.openqa.selenium.WebDriver;

import java.util.Scanner;

/**
 * Created by Никита on 07/08/15.
 */
public class PoLesson {
    public  static WebDriver dr ;



    public static void metodOne () {
        System.out.println("Выбран метод: int -> char");
        Scanner sr = new Scanner(System.in);
        System.out.print("Введите число int : ");
        int count1 = sr.nextInt();
        char count2 = (char) (count1);
        System.out.print("Char = " + count2);

    }
    public static void metodTwo () {
        System.out.println("Выбран метод: float -> char");
        Scanner sr = new Scanner(System.in);
        System.out.print("Введите число float : ");
        float count1 = sr.nextFloat();
        char count2 = (char) (count1);
        System.out.println("Char = " + count2);

    }
    public static void metodThree () {
        System.out.println("Выбран метод:  float -> char -> int");
        Scanner sr = new Scanner(System.in);
        System.out.print("Введите число float : ");
        float count1 = sr.nextFloat();
        char count2 = (char) (count1);
        int count3 = (int) count2;
        System.out.println("Integer = " + count3);
}

    public static void checkResult (){
        
    }
}