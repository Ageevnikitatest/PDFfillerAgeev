package courseJava;

import java.util.Scanner;

/**
 * Created by ANS on 13/01/16.
 */

public class HomeWorkCalc {

    public static void main(String[] args) {


        Scanner userInput = new Scanner( System.in );

        System.out.println(" Ввести значение : а ");
        int a = userInput.nextInt();

        System.out.println(" Ввести значение : b ");
        int b = userInput.nextInt();

        if (a > b) {

            System.out.println("a = max");

        }
         if (a < b) {
             System.out.println("b = max");
         }

        else {
             System.out.println("a = b");
         }

    }
}