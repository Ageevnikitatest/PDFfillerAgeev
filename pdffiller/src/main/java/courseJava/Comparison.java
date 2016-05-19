package courseJava;

import imap.BeforeAfter;

import java.util.Scanner;

/**
 * Created by ANS on 20/03/16.
 */
public class Comparison {
    public static void main(String[] args) {

        // Задание № 1,2

        Scanner userInput = new Scanner( System.in );

        System.out.println("Введите первое значение: ");
        int a = userInput.nextInt();

        System.out.println("Введите второе значение: ");
        int b = userInput.nextInt();

        System.out.println("Введите третье значение: ");
        int c = userInput.nextInt();

        System.out.println("Введите четвертое значение: ");
        int d = userInput.nextInt();

        int one = Math.min(a,b);
        int two = Math.min(c,d);

        int one1 = Math.max(a,b);
        int two1 = Math.max(c,d);


        if (one>two){
            System.out.println("Минимальное число: " + two);
        }
        if (one<two){
            System.out.println("Минимальное число: " + one);
        }
       /* else {
            System.out.println("Числа одинаковые");
        }*/
        if (one1>two1){
            System.out.println("Максимальное  число: " + one1);
        }
        if (one1<two1){
            System.out.println("Максимальное число: " + two1);
        }
        else {
            System.out.println("Числа одинаковые");
        }




}}
