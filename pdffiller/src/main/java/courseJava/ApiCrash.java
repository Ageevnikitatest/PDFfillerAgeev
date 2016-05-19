package courseJava;

import imap.BeforeAfter;
import imap.PageObject;
import org.testng.annotations.Test;

/**
 * Created by ANS on 27/04/16.
 */
public class ApiCrash extends BeforeAfter{

    @Test

    public  void bb() throws InterruptedException {


        PageObject.openUrl("https://dev23.pdffiller.com/en/login.htm");
        PageObject.login("ageevnikitatest+23333@gmail.com","7fTDshiJ");
        PageObject.openUrl("https://dev23.pdffiller.com/en/developers");
        PageObject.clickButtonXpath("//div[@class='api-tab-cell active']/a[text()='API Settings']");
        int i = 0;
        Thread.sleep(2000);
        while (i!=300000){

            PageObject.clickButtonXpath("//div[@class='api-section-cell api-section-cell--center']//a[@id='regenerate-token-btn']");
            i++;
            System.out.println(i);

        }



    }




}
