package com.company.lessonsPDFFiller;

/**
 * Created by Никита on 07/09/15.
 */
public class IfLesson {

    //константы с большой
    // методы с маленькой


    public boolean les = true;
    int f = 5;

    public void checkTest (){

        if (les){
            System.out.println("Выполнился блок if");

        }
        else {

        }
    }

    public void checkTest2 (){
        if (!les){
            System.out.println("1");

        }
        else if (les && f==3){     // &&  и  ;  & или
            System.out.println("2");
        }
    }

    // изменить возраст в вк и выдать сообщение что поменял такому то юзеру
}
