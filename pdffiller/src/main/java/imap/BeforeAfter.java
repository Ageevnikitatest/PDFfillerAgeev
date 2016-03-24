package imap;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by ANS on 7/28/15.
 */
public class BeforeAfter {


    public static WebDriver driver;

    @BeforeTest
    @Parameters({"Browser"})

    public void setUpBrowser (@Optional("CH") String browser) {

      //  public static final String ROOT_DIR_CHROME_APP = "/Users/ANS/Documents/JAVA/chromedriver";

        if(browser.equalsIgnoreCase("FF")) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            System.out.println( "_____________________________ " + "\n" + "Open FireFox Browser -->>" +"\n" );
        }

        else if (browser.equalsIgnoreCase("CH")){

            System.setProperty("webdriver.chrome.driver", Constants.ROOT_DIR_CHROME_APP);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
           // Dimension targetSize = new Dimension(1440, 900);   FOR MAC
            // driver.manage().window().setSize(targetSize);      FOR MAC
            System.out.println( "_____________________________ " + "\n" +  "Open Chrome Browser -->>"  +"\n");
        }

        else if (browser.equalsIgnoreCase("IE")){
           // System.setProperty("webdriver.chrome.driver", imap.Constants.ROOT_DIR_CHROME_APP);  // IE
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            System.out.println( "_____________________________ " + "\n" +  "Open IE Browser-->>" +"\n" );
        }




        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);   // ожидание элемента
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);   //ожидание загрузки стр
        driver.manage().timeouts().setScriptTimeout(60,TimeUnit.SECONDS);  //ожидание загрузки всех скриптов на стр
    }


    @AfterTest
    public void tearDown () {
        driver.close();
        driver.quit();
    }

}