package arredamenty;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import imap.BeforeAfter;
import imap.Listener;
import imap.PageObject;


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
