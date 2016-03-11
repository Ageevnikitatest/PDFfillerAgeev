package courseJava;

import imap.BeforeAfter;
import imap.PageObject;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.util.concurrent.TimeUnit;

/**
 * Created by ANS on 11/03/16.
 */
public class FacebookLang extends BeforeAfter{



    @Test

    public void Lang (){

        String ukrain = "//div[@data-referrer='page_footer']//a[@title='Ukrainian']";
        String headerUkra = "Зареєструватися";


        PageObject.openUrl("http://www.facebook.com");


        PageObject.clickButtonXpath(ukrain);
        String lang =  PageObject.getText("//div[@class='clearfix']//div[@class='pvl _52lp _59d-']/*[1]");
        Assert.assertEquals(lang,headerUkra);







    }
}
