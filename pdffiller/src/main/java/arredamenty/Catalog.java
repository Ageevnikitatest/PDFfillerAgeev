package arredamenty;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pdffillerTest.BeforeAfter;
import pdffillerTest.Listener;
import pdffillerTest.PageObject;


/**
 * Created by ANS on 21/09/15.
 */
@Listeners({Listener.class})
public class Catalog  extends BeforeAfter{


    @Test
    public static  void proverkaFoto (){

        PageObject.openUrl("https://arredamenti.com.ua/catalog");





    }

}
