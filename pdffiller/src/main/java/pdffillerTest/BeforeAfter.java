package pdffillerTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import sun.rmi.rmic.Constants;

import java.util.concurrent.TimeUnit;

/**
 * Created by ANS on 7/28/15.
 */
public class BeforeAfter {


    public static WebDriver driver;

    @BeforeTest                                      // указываем какой из браузеров будет открываться
    @Parameters({"Browser"})
    public void setUpBrowser (@Optional("CH") String browser) {

        if(browser.equalsIgnoreCase("FF")) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            System.out.println("Open FireFox Browser");
        }

        else if (browser.equalsIgnoreCase("CH")){
            System.setProperty("webdriver.chrome.driver", pdffillerTest.Constants.ROOT_DIR_CHROME_APP);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            System.out.println("Open Chrome Browser");
        }

        else if (browser.equalsIgnoreCase("IE")){
           // System.setProperty("webdriver.chrome.driver", pdffillerTest.Constants.ROOT_DIR_CHROME_APP);  // IE
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            System.out.println("Open IE Browser");
        }




        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  // ожидание элемента
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS); //ожидание загрузки стр
        driver.manage().timeouts().setScriptTimeout(60,TimeUnit.SECONDS);  //ожидание загрузки всех скриптов на стр
    }


    @AfterTest
    public void tearDown () {
        driver.close();
        driver.quit();
    }

}