package pdffillerLessons;

import org.testng.annotations.Test;


/**
 * Created by ANS on 18/08/15.
 */


public class ConstructorBuild {

    public String name;
    public int value ;

   public ConstructorBuild (String name){

       this.name = name ;


   }

    public ConstructorBuild () {
    }

    public ConstructorBuild(int age){

        this.value = age;

    }


}
