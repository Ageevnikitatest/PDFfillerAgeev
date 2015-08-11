package com.company.lessonsPDFFiller;

import org.junit.Test;

/**
 * Created by Никита on 07/16/15.
 */
public class ArrLesson {  // МАССИВЫ

    int [] week = new int[7]; //  7 пустых ячееек под массив {1,2,3...}


     /*@Test

    public void cycle(){
    for (int i = 0; i < week.length; i++) {  // цикл , перебираем массив

        week[i]=i;
        System.out.println(week[i]);
    }

        for (int day: week){  // присваивает всему массиву цифру 3
            day = 3;          // либо if(day==3){ sout (day);   }
            System.out.println(day);
        }}*/


    int month [][] =  new int[5][7];

    @Test
    public void  cycle2 (){

        for (int i = 0; i<5; i++){

            for (int g=0; g<7;g++){

                month[i][g] =i+g ;

               /* month[0][0] = 1;
                month[1][1] = 2;
                month[2][2] = 2;*/

                System.out.print(month[i][g]);
            }

            System.out.println();
            }
    }
}
