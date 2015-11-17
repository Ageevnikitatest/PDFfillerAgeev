package differentTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ANS on 11/11/15.
 */
public class Sudoku {

    public static void main(String[] args) {

        Random rn = new Random();
        List<Integer> List1 = new ArrayList();
        List<Integer> List2 = new ArrayList();
        List<Integer> List3 = new ArrayList();


        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List1.add(5);
        List1.add(6);
        List1.add(7);
        List1.add(8);
        List1.add(9);

        int i = 1 ;


        while (i < 10) {

            int randIndex = rn.nextInt(List1.size());
            List2.add(List1.get(randIndex) );
            List1.remove(randIndex);
            i ++;
        }

        int max = 8 ;
        int min = 3 ;
        int range = max - min + 1;
        int randomNum =  rn.nextInt(range) + min;

        for(int j = 0; j<3; j++){

            while(List3.contains(List2.get(randomNum))){
                randomNum =  rn.nextInt(range) + min;
            }

            List3.add(List2.get(randomNum));



        }

        randomNum =  rn.nextInt(8);

        for(int j = 0; j<3; j++){

            while(List3.contains(List2.get(randomNum)) || (randomNum == 3 || randomNum == 4 || randomNum == 5)){
                randomNum =  rn.nextInt(8);
            }

            List3.add(List2.get(randomNum));
        }



        System.out.println(List2.toString());
        System.out.println(List3.toString());

       /*do{
            List3.add(List2.get(randomNum));
            randomNum =  rn.nextInt(range) + min;
            System.out.println(randomNum);
        } while (List3.contains(List2.get(randomNum)));

        System.out.println(List3.get(randomNum));
*/


    }
}
