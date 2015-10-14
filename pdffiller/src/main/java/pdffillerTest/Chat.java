package pdffillerTest;

import imap.BeforeAfter;
import imap.Listener;
import imap.PageObject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

import org.testng.annotations.Test;


/**
 * Created by ANS on 05/10/15.
 */


@Listeners({Listener.class})   // слушатель


       public class Chat    extends BeforeAfter{




                             @Test

    public static void checkChat () throws InterruptedException {

        PageObject.openUrl("https://www.pdffiller.com/en/login.htm");  // login page
        PageObject.login("ageevnikitatest+payment7@gmail.com","1111");  // email and password
        PageObject.isDisplayedXpath("//div[@id='call_uploader']");
        PageObject.openUrl("https://www.pdffiller.com/en/support.htm");
        PageObject.isDisplayedXpath("//div[@class='webview-hide']//img[@src='/img/c.gif']"); // проверка отображения кнопки
        PageObject.clickButtonXpath("//div[@class='webview-hide']//img[@src='/img/c.gif']"); // нажатие на данную кнопку
        Thread.sleep(3000);

        driver.switchTo().frame("liveChatIFrame"); //переключение на чат

        String textForChat = driver.findElement(By.xpath("(//div[@class='textWrap']/p[text()])[1]")).getText();
        System.out.println(textForChat);

         //PageObject.waitElement("(//div[@class='textWrap'])[1]", 5);


/*

        PageObject.openUrl("https://www.pdffiller.com/en/forms.htm");
       // driver.switchTo().frame("liveChatIFrame");
        PageObject.waitElement("(//div[@class='textWrap'])[1]", 10);


        PageObject.openUrl("https://www.pdffiller.com/en/account.htm?op=payment_options");
       // driver.switchTo().frame("liveChatIFrame");
             while (driver.findElement(By.xpath("(//div[@class='textWrap'])[1]")).isDisplayed()) {
                 Thread.sleep(1000);
             }


    System.out.println("Goo JOB ");*/




        }
    }

