package differentTest;

import org.testng.annotations.Test;

/**
 * Created by ANS on 29/10/15.
 */
public class TestLessonString {


    LessonString test = new LessonString();
    LessonString test1 = new LessonString();
    LessonString test2 = new LessonString();

    @Test
    public  void  stringTest (){


        System.out.println(test1.name);
        System.out.println(test2.name);
        test1.name = "DIMA";
        System.out.println(test1.name);
        System.out.println(test2.name);


        test1.nonStaticName = "Nikita";
        System.out.println(test1.nonStaticName);
        System.out.println(test2.nonStaticName);

        test.nonStaticName = "dsdsd";

        System.out.println(  new LessonString().nonStaticName);

// если статическая - раз изменил , изменилось везде . если не статическая , то для каждого объекта своя .
// изменил в одном , во втором не поменяется . Если константа , не изменяется вообще

    }
}
