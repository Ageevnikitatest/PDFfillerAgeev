package pdffillerTest;

import imap.BeforeAfter;
import imap.Buttons;
import imap.Listener;
import imap.PageObject;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

/**
 * Created by ANS on 23/09/15.
 */

@Listeners({Listener.class})   // слушатель



public class RegistrationWithGoogle  extends BeforeAfter {
    private static final String EMAILFORREG ="test007@pdffiller.com";
    private static final String PASSWORDFORREG = "kifoR1996";
    String urlStatic = "/img/header/header-user-icon-default";


    @Test
    public void registrationWithGoogle () throws InterruptedException  {

        driver.manage().deleteAllCookies();
        PageObject.openUrl("https://www.pdffiller.com/en/login.htm");
        PageObject.clickButtonXpath(Buttons.registerButton); //Register button
        PageObject.clickButtonXpath(Buttons.googleButtonOnLogin); //Reg with Google
        PageObject.sendKeys("//div[@class='form-panel first valid']//input[@id='Email']", EMAILFORREG); //send Email
        PageObject.clickButtonId("next");  // Click Next
        PageObject.sendKeys("//div[@class='form-panel second']//input[@id='Passwd']", PASSWORDFORREG); // send Password
        PageObject.clickButtonXpath("//div[@class='form-panel second']//input[@id='signIn']"); // click next
        PageObject.visiblElement("//div[@id='third_party_info_container']//button[@id='submit_approve_access']");
        Thread.sleep(2000);
        PageObject.clickButtonXpath("//div[@id='third_party_info_container']//button[@id='submit_approve_access']"); // click Принять
        Thread.sleep(4000);
        String styleIm =  driver.findElement(By.id("user_logo_thumb_header")).getAttribute("style");
        String urlImage = styleIm.substring(22,styleIm.indexOf("?"));// обрезали строку
        Thread.sleep(4000);

        try {
            assertFalse(urlImage.contains(urlStatic)); // сравниваем аккаунт с картинкой и без
            PageObject.deleteAccount();
        }

        catch (AssertionError e) {
            PageObject.deleteAccount();
            System.out.println("try. Delete account");
            throw e;  // возвращает ошибку , после каких либо действий
        }
    }


}
