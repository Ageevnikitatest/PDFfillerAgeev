package pdffillerTest;

import org.testng.annotations.Test;
import pdffillerTest.ConstructorBuild;

/**
 * Created by ANS on 18/08/15.
 */
public class ConstructorTest {

    ConstructorBuild constructor = new ConstructorBuild("Nik");
    ConstructorBuild constructor2 = new ConstructorBuild();
    ConstructorBuild constructor3 = new ConstructorBuild(24);

    @Test

    public void jopa (){

        System.out.println(constructor.name);
        System.out.println(constructor3.value);

    }




}
