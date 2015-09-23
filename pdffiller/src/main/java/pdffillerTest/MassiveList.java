package pdffillerTest;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ANS on 04/08/15.
 */


public class MassiveList {

    @Test
    public static void list (){

        List <String> testersList = new ArrayList<String>(); // создали лист со стрингом

        testersList.add("Nikita");
        testersList.add("Dima");
        testersList.add("Tolstyi");
        testersList.add("Sanya");
        testersList.add(4, "Petya");                   //  шестого пропустили , записали седьмого сразу
        System.out.println(testersList.get(1));       // вывести вторую строку . счет с нуля
        testersList.add(1, "Karl");                   // заменили строку Dima

         for (String tester: testersList)    {        // присваиваем новую стрингу и указываем откуда будет ее вытягивать
             System.out.println(tester);              // перебираем попорядку

         if (testersList.isEmpty()){                  // возврат либо true or false, если нет не одной add  нет будет true
         }

             System.out.println(testersList.isEmpty());  //  после каждого элемента будет проверка на true or false
         }

        System.out.println(testersList.contains("Nikita")); // проверка на наличие , есть ли в листе "Nikita"




    }

}
