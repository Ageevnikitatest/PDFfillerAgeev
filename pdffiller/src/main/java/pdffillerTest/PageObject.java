package pdffillerTest;

import com.sun.tools.javac.util.List;
import org.apache.commons.io.FileUtils;
import org.junit.ComparisonFailure;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.concurrent.TimeUnit;


/**
 * Created by ANS on 7/28/15.
 */
public class PageObject extends BeforeAfter{




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
        if (displayed_any_ByXpath(Buttons.forgotPass)){
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

    public static void sendKeys(String xpath, String text) { // нажатие
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }

    public static boolean displayed_any_ByXpath(String xpath){ // отображение элемента на стр

        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement k = driver.findElement(By.xpath(xpath));
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            return k.isDisplayed();
            } catch (org.openqa.selenium.NoSuchElementException e) {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            return false;}
    }

    public static void visiblElement(String xpath){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

    }


    public static String emailReg = null;


    public  static  void  sendEmailPass() { // передача мыла и пароля

        emailReg =  "test007+AutoTestAgeev" + getCurrentTimestamp() + "@pdffiller.com";
        sendKeys("//div//td/input[@class = 'placeholders input old_vers2 grad-input']",emailReg);
        sendKeys("//div//td/input[@class = 'placeholders old_vers2 input grad-input']", "1111");
        clickButtonId("register_btn_site");

    }



    public static long getCurrentTimestamp(){
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        return ts.getTime();
    }

    public static boolean checkButton(String xpath){

        try {
            driver.findElement(By.xpath(xpath));
            return true;
        }

        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;}
    }

    public static boolean getLinkAndCheck(String link) {



            String url = driver.getCurrentUrl();
            return url.contains(link);


    }

    public static void checkLink(String link,String linkOpen){

        try {String url = driver.getCurrentUrl();
            boolean url2 = url.contains(link);
            if (url2){

            }
            else openUrl(linkOpen);

        }
        catch (Exception e) {
            openUrl(linkOpen);

        }}

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

    public static boolean waitButton(String xpath, String p){ // для ожидания элемента на странице по xpath

        try{
            new WebDriverWait(driver,2).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        }catch (TimeoutException e){
            System.out.println("No such element: "+ p );
            return false;
        }
        return true;

    }

    public static String getText(String xpath) {
        String k = driver.findElement(By.xpath(xpath)).getText();
        return k;
    }






    public static void checkText(String actual, String xpath){   // переписать !!!!
        try {

            Assert.assertEquals(actual, getText(xpath));
        }
        catch (ComparisonFailure e ) {
            System.out.println( "Incorrect text : " + actual);
        }}





    public static void ifGetText(String url) {

        if (checkButton(url)) {
        }
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

        if (displayed_any_ByXpath("//a [@href='/en/account/?op=payment_options']")){
            clickButtonXpath("//a [@href='/en/account/?op=payment_options']"); // закрыть (подписку ссылка)
            clickButtonXpath(Buttons.cancelSubscription);
            clickButtonXpath(Buttons.noThanksDev);
            clickButtonXpath(Buttons.myAccount);
            openUrl("https://" + devNumber + ".pdffiller.com/en/account/?op=account_info");
            clickButtonXpath(Buttons.deleteAccount);
            checkAlert(); }}

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

    public static void ifClickButton (String xpath, String xpath1){
        if (checkButton(xpath)){
            clickButtonXpath(xpath1);}

    }

    public static void loginGoogle () throws InterruptedException {
        openUrl("https://mail.google.com/mail/u/0/#inbox");
        clickButtonXpath("//div [@class='maia-util']/a [@href='https://accounts.google.com/ServiceLogin?service=mail..']");
        waitLink("ServiceLogin");
        sendKeys("//div [@class='form-panel first valid']//input[@id='Email']", "ageevnikitatest@gmail.com");
        clickButtonXpath("//div [@class='form-panel first valid']//input[@id='next']");
        Thread.sleep(2000);
        sendKeys("//div [@class='form-panel second']//input[@id='Passwd']", "kifoR1996");
        clickButtonXpath("//div [@class='form-panel second']//input[@id='signIn']");
        waitLink("/mail/u/0/#inbox");

    }

    public static void clearField (String xpath) {
        driver.findElement(By.xpath(xpath)).clear();

    }

    public static void setElementAttribute(By by, String attr, String value){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(by);
        js.executeScript("arguments[0].setAttribute('" + attr + "', '" + value + "');", element);
    }
}





