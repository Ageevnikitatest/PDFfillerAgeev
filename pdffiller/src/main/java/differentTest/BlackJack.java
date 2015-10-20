package differentTest;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by ANS on 19/10/15.
 */

public class BlackJack {

    public static int main(String[] args) throws InterruptedException {

        int[][] koloda = new int [24][2];
        Random random = new Random();
        Scanner userInput = new Scanner( System.in );
        String inputTextUser;


        koloda [0][0]= 2;
        koloda [0][1]= 2;
        koloda [1][0]= 2;
        koloda [1][1]= 2;

        koloda [2][0]= 3;
        koloda [2][1]= 3;
        koloda [3][0]= 3;
        koloda [3][1]= 3;

        koloda [4][0]= 4;
        koloda [4][1]= 4;
        koloda [5][0]= 4;
        koloda [5][1]= 4;

        koloda [6][0]= 5;
        koloda [6][1]= 5;
        koloda [7][0]= 5;
        koloda [7][1]= 5;

        koloda [8][0]= 6;
        koloda [8][1]= 6;
        koloda [9][0]= 6;
        koloda [9][1]= 6;

        koloda [10][0]= 7;
        koloda [10][1]= 7;
        koloda [11][0]= 7;
        koloda [11][1]= 7;

        koloda [12][0]= 8;
        koloda [12][1]= 8;
        koloda [13][0]= 8;
        koloda [13][1]= 8;

        koloda [14][0]= 9;
        koloda [14][1]= 9;
        koloda [15][0]= 9;
        koloda [15][1]= 9;

        koloda [16][0]= 10;
        koloda [16][1]= 10;
        koloda [17][0]= 10;
        koloda [17][1]= 10;

        koloda [18][0]= 10;
        koloda [18][1]= 10;
        koloda [19][0]= 10;
        koloda [19][1]= 10;

        koloda [20][0]= 10;
        koloda [20][1]= 10;
        koloda [21][0]= 10;
        koloda [21][1]= 10;

        koloda [22][0]= 11;
        koloda [22][1]= 11;
        koloda [23][0]= 11;
        koloda [23][1]= 11;




        int iAm;
        int naRykah = 0;
        System.out.println(" *** Сдать карту ? *** ");
        inputTextUser = userInput.next();


        while (inputTextUser.equals("да")) {

            int i = random.nextInt(24);
            int j = random.nextInt(2);
            iAm = naRykah + koloda[i][j];

            System.out.println("\n" +"На руках: " + iAm + " очков" );


            if (iAm > 21) {
                System.out.println("\n" + " *** Перебор ***");
                break;
            }
            if (iAm == 21) {
                Thread.sleep(2000);
                System.out.println(" !!! Вы выиграли !!!");
                break;
            }

            else
                System.out.println( " Еще карту ?  " + "\n");
                inputTextUser = userInput.next();
                naRykah = iAm;
            if (inputTextUser.equals("да")){

            }
            else  break;
        }
        return naRykah;

    }
    }

