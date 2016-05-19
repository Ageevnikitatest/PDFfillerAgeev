package courseJava;

import org.testng.annotations.Test;

/**
 * Created by ANS on 22/03/16.
 */
public class TestKonstructor {

    @Test

    public void tryUserInit(){
        Employee jonDepp = new Employee("Name","Surname","Company");
        Person persona1 = new Person("Petr","Surname1");


        jonDepp.displayInfo();
        persona1.displayInfo();

    }
}
