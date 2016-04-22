package pdffillerTest;

import imap.*;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

import java.awt.*;
import java.io.IOException;



/**
 * Created by ANS on 7/28/15.
 */

@Listeners({Listener.class})

@Features({"Custom Branding"})  // для  построения отчета с помощью фреймворка  Allure

public class CustomBranding extends BeforeAfter {

   static By formInput = By.cssSelector("div form");



    @Stories({"Custom Branding"}) // для  построения отчета с помощью фреймворка  Allure

    @Test

    public static void open() throws InterruptedException, AWTException, IOException {


        PageObject.registration("https://www.pdffiller.com/en/login.htm");
        PageObject.waitLink("forms");
        Thread.sleep(3000);
        PageObject.clickButtonXpath(Buttons.myAccount);
        Thread.sleep(3000);
        PageObject.clickButtonXpath(Buttons.customBranding);
        Thread.sleep(3000);
        PageObject.setElementAttribute(formInput, "style", "position: fixed; top: 1000px;");
        driver.findElement(By.xpath(Buttons.uploadCustomBranding)).sendKeys("/Users/ANS/Documents/JAVA/TEST.jpg");
        Thread.sleep(5000);
        PageObject.sendKeys(Buttons.cusBrandFirstName, "Test1 First Name");
        PageObject.sendKeys(Buttons.cusBrandLastName, "Test1 Last Name");
        PageObject.sendKeys(Buttons.cusBrandTitle, "Test1 Title");
        PageObject.sendKeys(Buttons.custBrandCompany, "Test1 Company");
        PageObject.sendKeys(Buttons.custBrandPhone, "+38 (099) 123-12-12");
        PageObject.sendKeys(Buttons.custBrandFax, "1 (111) 111-1111");
        //PageObject.screenshot();
            EmailWorker eW = new EmailWorker();
            eW.deleteAllMessages("nikita@pdffiller.com","kifoR1996");
        PageObject.clickButtonXpath(Buttons.custBrandSendTestEmail);
        Thread.sleep(2000);
        PageObject.clickButtonXpath(Buttons.custBrandDone);
        PageObject.swichToAlert();
        PageObject.deleteAccount();
        Thread.sleep(3000);
        String mailUrl = GmailClient.CheckTextInEmail("Test1 send personal email");
        PageObject.openUrl(mailUrl);
        Thread.sleep(5000);

        // дописать проверку Имени и Фамилии . на данный момент после отправки не отображается в письме

        PageObject.checkText("Email:" + PageObject.emailReg, "//li[contains(text(),'Email')]"); // проверка имейла
        PageObject.checkText("Thank you", "(//div[@style='margin: 0; padding: 0; text-align: left;']//li[@style])[1]");
        PageObject.checkText("Test1 Title Test1 Company","(//div[@style='margin: 0; padding: 0; text-align: left;']//li[@style])[4]");
        PageObject.checkText("+38 (099) 123-12-12","(//div[@style='margin: 0; padding: 0; text-align: left;']//li[@style])[6]");
        PageObject.checkText("1 (111) 111-1111","(//div[@style='margin: 0; padding: 0; text-align: left;']//li[@style])[7]");
        PageObject.isDisplayedXpath("//img");

    }
}
