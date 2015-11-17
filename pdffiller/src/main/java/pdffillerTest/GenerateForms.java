package pdffillerTest;

import imap.AutotestCookie;
import imap.BeforeAfter;
import imap.Listener;
import imap.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by ANS on 12/11/15.
 */
@Listeners({Listener.class})   // слушатель


public class GenerateForms extends BeforeAfter {



    @Test

    public static void open() throws InterruptedException {

        Cookie cookieDisableCaptcha = new AutotestCookie().getCookie();
        driver.get("http://denise.pdffiller.com/");
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        driver.get("http://denise.pdffiller.com/");
        driver.manage().addCookie(cookieDisableCaptcha);
        Thread.sleep(2000);
        java.lang.String url =
                "http://denise.pdffiller.com/6962253-fw9--2014pdf-Form-W-9-Rev-December-2014-User-Forms";


        PageObject.openUrl("https://denise.pdffiller.com/en/login.htm");
        PageObject.login("ageevnikitatest+qa6@gmail.com","1111");
        Thread.sleep(1000);
        int i = 0;

        while  (  i <= 1000 ){

            PageObject.openUrl(url);
            Thread.sleep(2000);

            driver.findElement(By.xpath("//div[@id='line_second']/div[@class='fill_med_sh pointer']")).click();
            Thread.sleep(4000);

            PageObject.openUrl(url);
            Thread.sleep(4000);


            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
            Thread.sleep(2000);


            i ++;
        }



    }
}



// ageevnikitatest+qwer@gmail.com  1111    263 Forms
//ageevnikitatest+qa1@gmail.com  1111
//ageevnikitatest+qa3@gmail.com   1111  0 form
//ageevnikitatest+qa2@gmail.com     231 Forms


//denise
//ageevnikitatest+qa4@gmail.com