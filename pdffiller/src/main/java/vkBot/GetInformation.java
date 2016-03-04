package vkBot;

import imap.BeforeAfter;
import imap.PageObject;
import org.testng.annotations.Test;


/**
 * Created by ANS on 26/09/15.
 */
public class GetInformation extends BeforeAfter {


@Test   //for girl

    public static void getInfoVk () throws InterruptedException {
    PageObject.openUrl("https://www.vk.com");
    PageObject.sendKeys("//div[@class='labeled']/input [@name='email']","+79667516687 "); // Name
    PageObject.sendKeys("//div[@class='labeled']/input [@name='pass']", "Anna26");
    PageObject.clickButtonXpath("//button[@class='flat_button button_wide button_big'][1]"); // Enter button
    Thread.sleep(3000);
   /* PageObject.isDisplayedXpath(""); // Check My account fo displayed
    PageObject.clickButtonXpath(""); // People search
    PageObject.sendKeys("","Tanya"); // Search girl with name Tanya
    PageObject.clickButtonXpath("");  // Select some girl
    PageObject.getText("")       ; // take text and save in List */


    }
}
