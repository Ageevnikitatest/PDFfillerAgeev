package courseJava;

import java.util.Scanner;

/**
 * Created by ANS on 24/02/16.
 */
public class Triangle extends LessonMath {

    public static void main(String[] args)  throws InterruptedException {

        Scanner userInput = new Scanner( System.in );

        System.out.println("У треуголька три вершины : A,B,C . "+"\n"+"" +
                           "Необходимо задать расстояние между ними.");
        System.out.println("\n");
        Thread.sleep(3000);

        System.out.println(" Введите расстояние между т. А-В  ");
        int AB = userInput.nextInt();


        System.out.println(" Введите расстояние между т. B-C  ");
        int BC = userInput.nextInt();


        System.out.println(" Введите расстояние между т. А-C  ");
        int AC = userInput.nextInt();


            if (AB==BC & AC==AB) {
                Thread.sleep(1000);
                System.out.println("Вывод :     равнобедренный");
            }

        int one = (AB*AB) + (BC*BC);
        int two = AC*AC;

            if (one == two ){
                Thread.sleep(1000);
                System.out.println("Вывод :     прямоугольный");
            }

    }

}
