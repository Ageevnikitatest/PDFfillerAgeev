package courseJava;

import java.util.Random;

/**
 * Created by ANS on 04/03/16.
 */
public class LabOne {

    public static void main(String[] args) {

        int ab[][] = new int[5][5];
        int bc[][] = new int[5][5];
        int g = 0;
        int plus [][] = new int[5][5];
        int multiply [][] = new int [5][5];
        Random random = new Random();


        System.out.println("   -- ab --");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                g = random.nextInt(7) + 1;
                ab[i][j] = g;
                System.out.print(ab[i][j] + " " + "\t");

            }
            System.out.println();
        }

        System.out.println("\n" + "   -- bc --");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                g = random.nextInt(7) + 1;
                bc[i][j] = g;
                System.out.print(bc[i][j] + " " + "\t");

            }
            System.out.println();
        }
        System.out.println("\n" + " -- Сложение --");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
              plus[i][j] =   ab[i][j] + bc[i][j];
                System.out.print(plus[i][j] + " "+"\t");

            }

            System.out.println();
        }
        System.out.println("\n"+ "-- Умножение --");


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                multiply[i][j] =   ab[i][j] * bc[i][j];
                System.out.print(multiply[i][j] + " "+"\t");

            }

            System.out.println();


    }
}
}