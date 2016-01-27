package courseJava;

import java.util.Scanner;

/**
 * Created by ANS on 13/01/16.
 */

public class HomeWorkCalc {

    public static void main(String[] args) {

        // PART  1

        Scanner userInput = new Scanner( System.in );

        System.out.println(" Ввести значение : а ");
        int a = userInput.nextInt();

        System.out.println(" Ввести значение : b ");
        int b = userInput.nextInt();

        if (a > b) {

            System.out.println("max = " + a + "\n" + "min = " + b );

        }
        if (a < b) {
            System.out.println("max = " + b + "\n" + "min = " + a);
        }

        else {
            System.out.println("min = max");
        }


        // PART  2




    }
}
