package courseJava;

import java.util.Random;


/**
 * Created by ANS on 23/02/16.
 */
public class Massive {

    public static void main(String[] args) {

        Random random = new Random();
        int matrix[][] = new int[4][4];
        int k = 0;


        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                matrix[i][j] = k;
              //  k = random.nextInt();
                k++;

                System.out.print(matrix[i][j]+ "\t" );
            }

            System.out.println();

        }


        System.out.println();


        k=0;
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {


                matrix[i][j] = k;
                k++;

                System.out.print(Math.pow(matrix[i][j], 2 ) + "\t" );
            }

            System.out.println();
        }

    }
}

