package courseJava;

import imap.BeforeAfter;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by ANS on 29/03/16.
 */
public class Kismia extends BeforeAfter {

    @Test

    public static void registration(){

        driver.get("htttp://kismia.com");
        driver.findElement(By.xpath("//div[@class='radio-wrap']/label[@for='iam-boy']")).click();
        driver.findElement(By.xpath("//div[@class='form-input']/input[@id='user-reg-myname']")).clear();
        driver.findElement(By.xpath("//div[@class='form-input']/input[@id='user-reg-myname']")).sendKeys("Nikita");

    }
}
