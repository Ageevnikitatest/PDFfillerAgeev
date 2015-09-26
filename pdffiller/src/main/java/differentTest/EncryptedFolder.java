package differentTest;


import imap.BeforeAfter;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import imap.PageObject;

import java.io.IOException;

/**
 * Created by ANS on 17/08/15.
 */
public class EncryptedFolder extends BeforeAfter {

    @Test
    public void folder () throws InterruptedException, IOException {
        PageObject.registration("https://www.pdffiller.com/en/login.htm");
        Thread.sleep(2000);
        PageObject.clickButtonXpath("(//span[@class='folder_name'])[2]");
        PageObject.sendKeys("//div[@class='encrypted__form-group']/input[@id='phone']", "+38" + PageObject.getCurrentTimestamp());
        PageObject.clickButtonXpath("//button[@id='bntSendCode']");
        Thread.sleep(2000);

    for (int i= 1000 ; i <= 55000; i ++) {

            driver.findElement(By.id("code")).clear();
            driver.findElement(By.id("code")).sendKeys(i+ "");
            PageObject.clickButtonXpath("//button [@id='btnCheckCode']");
        }

        Thread.sleep(4000);
        PageObject.screenshot();

    }

}
