package pdffillerTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

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


public class LoginWithGoogle extends BeforeAfter {
    private static final String EMAILFORREG ="test007@pdffiller.com";
    private static final String PASSWORDFORREG = "kifoR1996";
    private static final String EMAILFORLogin ="ageevfortest@gmail.com";
    private static final String PASSWORDFORLogin = "Letmein5";
    String urlStatic = "/img/header/header-user-icon-default";

    @Test

    public void registrationWithGoogle () throws InterruptedException {
        driver.manage().deleteAllCookies();
        PageObject.openUrl("https://www.pdffiller.com/en/login.htm");
        PageObject.clickButtonXpath("//div[@class='log_reg']//a[text()='Register']"); //Register button
        PageObject.clickButtonXpath("//div[text()='Register with Google']"); //Reg with Google
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


     @Test

    public void loginWithGoogle () throws InterruptedException {
         driver.manage().deleteAllCookies();
        PageObject.openUrl("https://www.pdffiller.com/en/login.htm");
        PageObject.clickButtonXpath("//div[text()='Login with Google']");
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
         PageObject.clickButtonXpath("//div[@class='h-ac__dropdown']/a[text()='Log out']");
         Thread.sleep(2000);
    }




}
