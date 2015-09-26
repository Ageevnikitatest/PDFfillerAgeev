package pdffillerTest;

import imap.BeforeAfter;
import imap.Buttons;
import imap.Listener;
import imap.PageObject;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by ANS on 26/08/15.
 */

/*  ОПИСАНИЕ ! ! !

Два метода :
1. Регистрируется с помощью Гугла , проверяет наличие аватарки , и удаляет аккаунт
2. Логинится с помощью Гугла , проверяет наличие аватарки и разлогинивается.
*/

@Listeners({Listener.class})   // слушатель


public class LoginWithGoogle extends BeforeAfter {
    private static final String EMAILFORLogin ="ageevfortest@gmail.com";
    private static final String PASSWORDFORLogin = "Letmein5";
    String urlStatic = "/img/header/header-user-icon-default";







    @Test
    public void loginWithGoogle () throws InterruptedException, IOException {

         driver.manage().deleteAllCookies();
        PageObject.openUrl("https://www.pdffiller.com/en/login.htm");
        PageObject.clickButtonXpath(Buttons.googleButtonOnLogin);
         Thread.sleep(2000);
        PageObject.sendKeys("//div[@class='form-panel first valid']//input[@id='Email']", EMAILFORLogin); //send Email
        PageObject.clickButtonId("next");  // Click Next
        PageObject.sendKeys("//div[@class='form-panel second']//input[@id='Passwd']", PASSWORDFORLogin); // send Password
        PageObject.clickButtonXpath("//div[@class='form-panel second']//input[@id='signIn']"); // click next
        PageObject.visiblElement("//div[@id='third_party_info_container']//button[@id='submit_approve_access']");
        Thread.sleep(2000);
        PageObject.clickButtonXpath("//div[@id='third_party_info_container']//button[@id='submit_approve_access']"); // click Принять
        Thread.sleep(4000);
        String styleIm =  driver.findElement(By.id("user_logo_thumb_header")).getAttribute("style");
        String urlImage = styleIm.substring(22,styleIm.indexOf("?"));// обрезали строку
        Thread.sleep(4000);
        assertFalse(urlImage.contains(urlStatic));
         PageObject.clickButtonXpath("//div[@class='h-ac__caret']/img [@id='user_logo_thumb_header']");
         Thread.sleep(1000);
         PageObject.clickButtonXpath("//div[@class='h-ac__dropdown']/a[text()='Log out']");
         Thread.sleep(2000);
    }
}

