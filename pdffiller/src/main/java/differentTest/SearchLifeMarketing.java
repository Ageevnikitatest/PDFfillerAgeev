package differentTest;

import imap.BeforeAfter;
import imap.Listener;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import imap.PageObject;

/**
 * Created by ANS on 03/09/15.
 */


@Listeners({Listener.class})
public class SearchLifeMarketing extends BeforeAfter {


    @Test

    public static void searchEngine () throws InterruptedException {

        String expectedResult = "Fillable 2014 Form 1040" ;
        PageObject.openUrl("http://www.pdffiller.com/en/fillable-pdf-forms-search-engine.htm");
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        PageObject.sendKeys("//div[@class='body_search']//input[@type='text']", expectedResult);
        PageObject.clickButtonXpath("//div[@class='body_search']//a[text()='Search']");
        driver.findElement(By.xpath("(//div[@class='search_main hidden']//div[text()='Fill online'])[1]")).isDisplayed();

        String actualResult = PageObject.getText("(//div[@class='search_results']//a[@href])[1]");

        Assert.assertTrue(expectedResult.contains(""), actualResult);




    }
}
