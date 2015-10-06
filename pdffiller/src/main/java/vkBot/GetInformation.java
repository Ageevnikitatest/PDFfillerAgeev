package vkBot;

import imap.BeforeAfter;
import imap.PageObject;
import org.testng.annotations.Test;
import sun.jvm.hotspot.debugger.Page;

/**
 * Created by ANS on 26/09/15.
 */
public class GetInformation extends BeforeAfter {


@Test   //for girl

    public static void getInfoVk () {
    PageObject.openUrl("vk.com");
    PageObject.sendKeys("","+79667516687 "); // Name
    PageObject.sendKeys("", "Anna26");
    PageObject.clickButtonXpath(""); // Enter button
    PageObject.isDisplayedXpath(""); // Check My account fo displayed
    PageObject.clickButtonXpath(""); // People search
    PageObject.sendKeys("","Tanya"); // Search girl with name Tanya
    PageObject.clickButtonXpath("");  // Select some girl
    PageObject.getText("")       ; // take text and save in List 


    }
}
