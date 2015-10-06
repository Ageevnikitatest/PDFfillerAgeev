package pdffillerTest;

import imap.BeforeAfter;
import imap.Listener;
import imap.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
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

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String textExpected = "Welcome to PDFfiller Support. How may I help you today?";
        String textActual ="Welcome to PDFfiller Support. How may I help you today?";
        String textArea = "//div[@class='enter-msg']/textarea[@id='LiveHelpMessageTextarea']";

        PageObject.openUrl("https://www.pdffiller.com/en/login.htm");
        PageObject.login("ageevnikitatest+payment7@gmail.com","1111");
        PageObject.isDisplayedXpath("//div[@id='call_uploader']");
        PageObject.openUrl("https://www.pdffiller.com/en/support.htm");
        PageObject.isDisplayedXpath("//div[@class='webview-hide']//img[@src='/img/c.gif']");
        PageObject.clickButtonXpath("//div[@class='webview-hide']//img[@src='/img/c.gif']");
        Thread.sleep(3000);
        driver.switchTo().frame("liveChatIFrame");

        //PageObject.swichToFrame("modal-chat-iframe");

        driver.findElement(By.xpath("//p[text()='Welcome to PDFfiller Support. How may I help you today?']"));
        Assert.assertEquals(textActual,textExpected);
        driver.findElement(By.xpath(textArea)).clear();
        PageObject.sendKeys(textArea,"Hi. This is a test. Write me plz : Have a nice day test ");
        driver.findElement(By.xpath(textArea)).sendKeys(Keys.RETURN);
        driver.findElement(By.xpath("//p[text()='Have a nice day test ']"));

        System.out.println("good");



    //PageObject.clickButtonXpath("//div[@id='disconnect_chat']");




        }
    }

