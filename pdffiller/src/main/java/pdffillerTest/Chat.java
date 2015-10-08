package pdffillerTest;

import imap.BeforeAfter;
import imap.Listener;
import imap.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

/**
 * Created by ANS on 05/10/15.
 */


@Listeners({Listener.class})   // слушатель


public class Chat    extends BeforeAfter{








@Test

    public static void checkChat () throws InterruptedException {

        PageObject.openUrl("https://www.pdffiller.com/en/login.htm");  // login page
        PageObject.login("ageevnikitatest+payment7@gmail.com","1111");  // email and passwo
        PageObject.isDisplayedXpath("//div[@id='call_uploader']");
        PageObject.openUrl("https://www.pdffiller.com/en/support.htm");
        PageObject.isDisplayedXpath("//div[@class='webview-hide']//img[@src='/img/c.gif']");
        PageObject.clickButtonXpath("//div[@class='webview-hide']//img[@src='/img/c.gif']");
        Thread.sleep(3000);
        driver.switchTo().frame("liveChatIFrame"); //переключение на чат


        System.err.println(driver.findElement(By.cssSelector(".textWrap")).isDisplayed());

        PageObject.openUrl("https://www.pdffiller.com/en/forms.htm");
        Thread.sleep(10000);
        driver.switchTo().frame("liveChatIFrame");
        driver.findElement(By.xpath("(//div[@class='textWrap'])[1]"));
        PageObject.openUrl("https://www.pdffiller.com/en/account.htm?op=payment_options");
        Thread.sleep(10000);
        driver.switchTo().frame("liveChatIFrame");
        driver.findElement(By.xpath("(//div[@class='textWrap'])[1]"));


    System.out.println("Goo JOB ");




        }
    }

