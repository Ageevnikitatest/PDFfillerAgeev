package courseJava;

import java.util.Scanner;

/**
 * Created by ANS on 13/01/16.
 */

public class Calculate {

    public static void main(String[] args) {

        Scanner userInput = new Scanner( System.in );
        Scanner userInputSt = new Scanner( System.in );

        System.out.println("Введите первое значение: ");
        int a = userInput.nextInt();

        System.out.println("Введите первое значение: ");
        int b = userInput.nextInt();

        System.out.println("Введите действие:  ");
        String c = userInputSt.nextLine();

        if ( c.equals("/") ) {

            double delenie = a/b;
            System.out.println(delenie);
        }
        if (c.equals("*")) {
            double ymnojenie = a*b;
            System.out.println(ymnojenie);
        }
        if (c.equals("+")){
            double slojenie =a+b;
            System.out.println(slojenie);
        }
        if (c.equals("-")){
            double vi4itanie = a-b ;
            System.out.println(vi4itanie);
        }
        else {

        }

    }
}


