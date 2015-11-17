package differentTest;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by ANS on 12/11/15.
 */
public class GuessNumber {

    public static void main(String[] args) {

        Random rn = new Random();
        Scanner userInput = new Scanner( System.in );
        int inputTextUser;
        int max =10 ;
        int min = 1 ;

        int range = max - min + 1;
        int randomNum =  rn.nextInt(range) + min;

        System.out.println(" Введите число от 1 до 10  ");
        inputTextUser = userInput.nextInt();
        System.out.println("\n");

       if (inputTextUser == randomNum) {

       }




    }


}
