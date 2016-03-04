package courseJava;

import imap.BeforeAfter;
import imap.PageObject;
import org.testng.annotations.Test;

public class DataType extends BeforeAfter{



    @Test
    public void  vkCom () throws InterruptedException {

        driver.get("http://vk.com");
        PageObject.sendKeys("//div[@class='labeled']/input [@name='email']","+79667516687 "); // Name
        PageObject.sendKeys("//div[@class='labeled']/input [@name='pass']", "Anna26");
        PageObject.clickButtonXpath("//button[@class='flat_button button_wide button_big'][1]");
        Thread.sleep(3000);


    }
    }

