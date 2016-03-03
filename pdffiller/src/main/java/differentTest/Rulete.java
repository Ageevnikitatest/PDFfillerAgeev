package differentTest;

import java.util.Random;
import java.util.Scanner;


/**
 * Created by ANS on 18/10/15.
 */




public class Rulete {

    public static void main  (String[] args) {



        Scanner userInput = new Scanner( System.in );
        Random foo = new Random();
        String inputTextUser;

        int max = 6;
        int min = 1;
        int g = 6 ;
        int randomNumber = foo.nextInt((max + 1) - min) + min;


        while ( randomNumber <= g ){

            System.out.println("  ****  Играть - 1 **** Отказаться - 2 **** ");
            inputTextUser = userInput.next();

             if (inputTextUser.equals("1") ) {
          //  System.out.println("У тебя есть еще один шанс ! ");
            randomNumber = foo.nextInt((max + 1) - min) + min;}

              if (inputTextUser.equals("2") ) {
                System.out.println("Game over !  loser !");
                break;
            }

              if (randomNumber == g )
            {
                System.out.println("Выстрел. Убит !");
                break;
            }
        }
       // return  randomNumber;
    }
}












