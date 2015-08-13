package pdffillerTest;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

/**
 * Created by ANS on 13/08/15.
 */
public class Reviews extends BeforeAfter{

    @Test
    public void check () throws InterruptedException {

        Cookie cookieDisableCaptcha = new AutotestCookie().getCookie();
        driver.get("http://www.pdffiller.com/");
        driver.manage().addCookie(cookieDisableCaptcha);

        PageObject.openUrl("https://www.pdffiller.com/en/indpages/review?page=1");
        Thread.sleep(4000);

        for (int i = 1 ; i<=1500; i++){

            if (!PageObject.getLinkAndCheck("page=" + i)) {
                Thread.sleep(1000);
                PageObject.openUrl("https://www.pdffiller.com/en/indpages/review?page="+i);
                if (!PageObject.getLinkAndCheck("page=" + i)) {
                    System.out.println(i);
                }
            }

            PageObject.clickButtonXpath("//div[@class='btn-wrapper']//i[@class='fa fa-angle-double-right']");


        }


    }
}
