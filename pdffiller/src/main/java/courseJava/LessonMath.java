package courseJava;

import java.util.Scanner;

/**
 * Created by ANS on 26/02/16.
 */
public class LessonMath {



    public static int plus () {

        Scanner userInput = new Scanner(System.in);

        System.out.println(" Введите значение  - а ");
        int a = userInput.nextInt();

        System.out.println(" Введите значение  - b ");
        int b = userInput.nextInt();

        int x = a + b;

        System.out.println( "\n" +"Сумма равна : " + x);

        return x;
    }

    public static int minus () {

        Scanner userInput = new Scanner(System.in);

        System.out.println(" Введите значение  - а ");
        int a = userInput.nextInt();

        System.out.println(" Введите значение  - b ");
        int b = userInput.nextInt();

        int x = a - b;

        System.out.println( "\n" + "Разница  равна : " + x);

        return x;
    }


    public static int multiplication () {

        Scanner userInput = new Scanner(System.in);

        System.out.println(" Введите значение  - а ");
        int a = userInput.nextInt();

        System.out.println(" Введите значение  - b ");
        int b = userInput.nextInt();

        int x = a / b;


             try {

                 System.out.println( "\n" + "Разница  равна : " + x);
             }

             catch (Exception ArithmeticException ) {   // узнать на счет exeption

                 System.out.println("  Делить на ноль нельзя");
             }

        return x;
    }


    public static int division () {

        Scanner userInput = new Scanner(System.in);

        System.out.println(" Введите значение  - а ");
        int a = userInput.nextInt();

        System.out.println(" Введите значение  - b ");
        int b = userInput.nextInt();

        int x = a * b;

        System.out.println( "\n" + "Умножение  равно : " + x);

        return x;
    }
}
// жопа 

