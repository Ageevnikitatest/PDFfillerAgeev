package imap;

import imap.BeforeAfter;
import imap.Buttons;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Created by ANS on 7/28/15.
 */


public class PageObject extends BeforeAfter {




    public static void openUrl(String url) {

        driver.get(url);}

    public static void screenshot(String name) throws IOException {

        String scrFolder = "/Users/ANS/Documents/JAVA/Screenshots/" + new SimpleDateFormat("MM_dd_yyyy").format(
                Calendar.getInstance().getTime()).toString();

        new File(scrFolder).mkdir();

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(scrFile, new File(scrFolder + "/" + name + new SimpleDateFormat("HH_mm_ss").format(
                Calendar.getInstance().getTime()).toString() + ".png"));
    }


    public static void screenshot() throws IOException {
        screenshot("sc");
    }


    public static void registration(String openUrl) throws InterruptedException {

        checkLink("login", openUrl);
        if (isDisplayedXpath(Buttons.forgotPass)){
            clickButtonXpath(Buttons.registerButton);
            sendEmailPass();
        }

        else {
            sendEmailPass();
             }
    }



    public static void clickButtonId(String id) { // нажатие
        driver.findElement(By.id(id)).click();
    }

    public static void clickButtonXpath(String xpath) { // нажатие
        driver.findElement(By.xpath(xpath)).click();
    }

    public static void sendKeys(String xpath, String text) {
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }

    public static boolean isDisplayedXpath(String xpath) { // отображение элемента на стр

        if(driver.findElements(By.xpath(xpath)).size() != 0) {
            return true;
        }
        else
            System.out.println("* * * * * * * * * ERROR ! Elementet ' " + xpath + " ' not dispayed * * * * * * * * * ");
        return false;

         }



    public static void visiblElement(String xpath){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

    }


    public static String emailReg = null;


    public  static  void  sendEmailPass() { // передача мыла и пароля

        emailReg =  "test007+AutoTestAgeev" + getCurrentTimestamp() + "@pdffiller.com";
        sendKeys(Buttons.emailFieldOnRegister,emailReg);
        sendKeys(Buttons.passwordFieldOnRegister, "1111");
        clickButtonXpath(Buttons.registerButtonOrange);

    }



    public static long getCurrentTimestamp(){
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        return ts.getTime();
    }




    public static boolean getLinkAndCheck(String link) {

            String url = driver.getCurrentUrl();
            return url.contains(link);
    }


    public static void checkLink(String link,String linkOpen){

        try {String url = driver.getCurrentUrl();
            boolean url2 = url.contains(link);
            if (url2){}

            else openUrl(linkOpen);
        }

        catch (Exception e) {
            openUrl(linkOpen);

        }
    }


    public static void waitLink(String url) throws InterruptedException {

        while (!driver.getCurrentUrl().contains(url)){
            Thread.sleep(1000);
        }
    }

    public static void getParametr (String parametr) {
        String url = driver.getCurrentUrl();
        //String parametr = "?force_done=true";
        String url_parametr = url + parametr;
        driver.get(url_parametr);

    }


    public static String getText(String xpath) {
        String k = driver.findElement(By.xpath(xpath)).getText();
        return k;
    }



    public static void checkText(String actual, String xpath) {

        Assert.assertEquals(actual, getText(xpath));
    }



    public static void deleteAccount () throws InterruptedException {
        openUrl("https://www.pdffiller.com/en/account/?op=account_info");
        clickButtonXpath(Buttons.deleteAccount);
        Thread.sleep(2000);
        clickButtonXpath(Buttons.yesDeletesLife);
        Thread.sleep(1000);
        checkAlert();

    }



    public static void deleteAccoutnDev (String devNumber) throws InterruptedException {

        openUrl("https://" + devNumber + ".pdffiller.com/en/account/?op=account_info");

        if (isDisplayedXpath("//a [@href='/en/account/?op=payment_options']")){
            clickButtonXpath("//a [@href='/en/account/?op=payment_options']"); // закрыть (подписку ссылка)
            clickButtonXpath(Buttons.cancelSubscription);
            clickButtonXpath(Buttons.noThanksDev);
            clickButtonXpath(Buttons.myAccount);
            openUrl("https://" + devNumber + ".pdffiller.com/en/account/?op=account_info");
            clickButtonXpath(Buttons.deleteAccount);
            checkAlert();
        }
    }


    public static void checkAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {

        }
    }

    public static void paymen_for_Dev () {

        sendKeys("//td/input [@ id ='first_name']", "Ageev Nikita");
        sendKeys("//td/input [@ id ='card_number']", "4111111111111111");
        sendKeys("//td/input [@ id ='card_security']", "123");
        sendKeys("//td/input [@ id ='card_address1']", "Biling Address 123");
        sendKeys("//td/input [@ id ='card_city']", "Doneck");
        sendKeys("//td/input [@ id ='card_zip']", "456789");
        clickButtonXpath("//td/select [@ id ='card_countries']/option [@value= 'US' ]");
        clickButtonXpath("//td/button [@id = 'payment_button_new']");

        if (driver.getCurrentUrl().contains("payment.htm")) {

            System.out.println("Payment not successful");
        }
        if
                (driver.getCurrentUrl().contains("en/payment/success/cc/")){
            System.out.println("Payment successful");
        }
    }




    public static void setElementAttribute(By by, String attr, String value){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(by);
        js.executeScript("arguments[0].setAttribute('" + attr + "', '" + value + "');", element);
    }



    public  static void robotPic() throws InterruptedException, AWTException {

        String arr[] = {"/Users/ANS/Documents/JAVA/TEST.jpg"};

        StringSelection photo = new StringSelection(arr[0]);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(photo, null);



        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        Thread.sleep(5000);

    }

}


