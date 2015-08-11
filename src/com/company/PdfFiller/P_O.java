package com.company.PdfFiller;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

/**
 * Created by Никита on 25/05/15.
 */
public class P_O {

    public  static WebDriver dr ;

    public  static  void  OpenFirst (WebDriver dr, String url) {

        P_O.dr = dr;
        dr.manage().window().maximize();
        dr.get(url);}

    public  static  void  OpenUrl ( String url) {

        dr.get(url);}


    //https://root:letmein@dev28.pdffiller.com/en/login.htm    "https://pdffiller.com"



public  static void Screenshot () throws IOException {

    File screenshot = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
    String path = "C:\\Nikita\\Work\\Avtomatization\\Screens\\snap"+ screenshot.getName() ; //
    FileUtils.copyFile(screenshot, new File(path),true);




}


    public static void  Registration_Recipient () throws InterruptedException {
        if (Displayed_any_ByXpath("//div [@class = 'login-offset2']/a")){
            ClickButton_xpath("//div//a[@class= 'btn-gray btns1']"); // register button
            SendEmailPass_Recipient();
            Thread.sleep(1000);
            ErrorEmail_Recipient();
            WaitButton("//div[@class = 'add_new_forms_text']", "Add New Form"); // Ожидание Add New Form button
        }
        else {
            SendEmailPass();
            Thread.sleep(1000);
            ErrorEmail();
            WaitButton("//div[@class = 'add_new_forms_text']", "Add New Form");
        }
    }

    public static  void  SendEmailPass_Recipient () throws InterruptedException {  // передача мыла и пароля

        int k = 1;
        SendKeys("//div//td/input[@class = 'placeholders input old_vers2 grad-input']","ageevnikitatest+AvtTestRecipient" + k + "@gmail.com" );
        SendKeys("//div//td/input[@class = 'placeholders old_vers2 input grad-input']", "1111");
        ClickButton_id("register_btn_site");

    }

    public  static void  ErrorEmail_Recipient() throws InterruptedException { // подбор имейла , если не подошел . цикл

        int  k= 2;
        while (Displayed_any_ByXpath( "//div [@class = 'login-offset2']/a")) {
            ClickButton_xpath("//div[@class= 'log_reg']");
            SendKeys("//div//td/input[@class = 'placeholders input old_vers2 grad-input']","ageevnikitatest+AvtTestRecipient" + k + "@gmail.com" );
            SendKeys("//div//td/input[@class = 'placeholders old_vers2 input grad-input']","1111" );
            ClickButton_id("register_btn_site");
            k = k+1;
            Thread.sleep(2000);}

    }






    public  static  void  close () {
        dr.close();
    }  // закрыть браузер


    public static void  Registration () throws InterruptedException {
        if (Displayed_any_ByXpath("//div [@class = 'login-offset2']/a")){
        ClickButton_xpath("//div//a[@class= 'btn-gray btns1']"); // register button
        SendEmailPass();
        Thread.sleep(1000);
        ErrorEmail();
        WaitButton("//div[@class = 'add_new_forms_text']", "Add New Form"); // Ожидание Add New Form button
    }
    else {
            SendEmailPass();
            Thread.sleep(1000);
            ErrorEmail();
            WaitButton("//div[@class = 'add_new_forms_text']", "Add New Form");
        }
    }

    public static void ClickButton_id (String id) { // нажатие Register
        dr.findElement(By.id(id)).click();
    }


    public static void ClickButton_xpath (String xpath) { // нажатие Register
        dr.findElement(By.xpath(xpath)).click();
    }

    public static void SendKeys (String xpath, String text) { // нажатие Register
        dr.findElement(By.xpath(xpath)).sendKeys(text);
    }


    public static boolean Displayed_any_ByXpath (String xpath){  // отображение элемента на стр

        try {
            WebElement k = dr.findElement(By.xpath(xpath));
            return k.isDisplayed();}
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;}
    }

    public static void VisiblElement (String xpath){
        WebDriverWait wait = new WebDriverWait(dr, 10);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }


    public static  void  SendEmailPass () throws InterruptedException {  // передача мыла и пароля

        int k = 98;
        SendKeys("//div//td/input[@class = 'placeholders input old_vers2 grad-input']","ageevnikitatest+AvtTest" + k + "@gmail.com" );
        SendKeys("//div//td/input[@class = 'placeholders old_vers2 input grad-input']", "1111");
        ClickButton_id("register_btn_site");

    }

    public  static void  ErrorEmail() throws InterruptedException { // подбор имейла , если не подошел . цикл

        int  k= 99;
        while (Displayed_any_ByXpath( "//div [@class = 'login-offset2']/a")) {
            ClickButton_xpath("//div[@class= 'log_reg']");
            SendKeys("//div//td/input[@class = 'placeholders input old_vers2 grad-input']","ageevnikitatest+AvtTest" + k + "@gmail.com" );
            SendKeys("//div//td/input[@class = 'placeholders old_vers2 input grad-input']","1111" );
            ClickButton_id("register_btn_site");
            k = k+1;
            Thread.sleep(2000);}

    }



    public static boolean CheckButton (String xpath){

        try {
            dr.findElement(By.xpath(xpath));
            return  true;
            }

        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;}
    }


    public static void WaitLink (String url) throws InterruptedException {

        while (!dr.getCurrentUrl().contains(url)){
            Thread.sleep(1000);
        }

    }

    public static void GetParametr () {
        String url = dr.getCurrentUrl();
        String parametr = "?force_done=true";
        String url_parametr =  url + parametr;
        dr.get(url_parametr);

    }



   public static boolean WaitButton (String xpath,String p){ //   для ожидания элемента на странице по xpath

        try{
            new WebDriverWait(dr,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        }catch (TimeoutException e){
            System.out.println("No such element: "+ p );
            return false;
        }
        return true;

    }






    public static String Get_Text (String xpath ) {
       String k =  dr.findElement(By.xpath(xpath)).getText();
        return k;
    }



    public static void CheckText (String expected,String xpath){
        try {

            Assert.assertEquals(expected, Get_Text(xpath));
        }
        catch (org.junit.ComparisonFailure e ) {
            System.out.println( "Incorrect text : " + expected);
        }}






    public  static void If_Get_Text(String url) {

        if (CheckButton(url)){
                System.out.println("Text : " + Get_Text(url));}}



    public static void   DeleteAccoutn () throws InterruptedException {
        if (!dr.getCurrentUrl().contains("#payment_cc")){
        ClickButton_xpath(".//a [text()='My Account']");
        ClickButton_xpath(".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]");
            ClickButton_xpath(".//div [@class='p1'] /a");
            checkAlert();
            System.out.println("Account Delete ");


        if  (CheckButton("//a [@href='/en/account/?op=payment_options']")){
            ClickButton_xpath("//a [@href='/en/account/?op=payment_options']");
            Thread.sleep(2000);
            ClickButton_xpath("//a [@href='/en/account/?op=cancel_bt']");

      if (CheckButton("//div [@class = 'new-btn btn--light-gray cancel-button']")){
            ClickButton_xpath("//div [@class = 'new-btn btn--light-gray cancel-button']");
            ClickButton_xpath(".//a [text()='My Account']");
            ClickButton_xpath(".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]");
          ClickButton_xpath(".//div [@class='p1'] /a");
            checkAlert();
          System.out.println("Account Delete");}



          else if (CheckButton("//a [@href='/en/payment/subscription_cancel.htm?v=interview']")) {
            ClickButton_xpath("//a [@href='/en/payment/subscription_cancel.htm?v=interview']");
            ClickButton_xpath(".//a [text()='My Account']");
            ClickButton_xpath(".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]");
            ClickButton_xpath(".//div [@class='p1'] /a");
            checkAlert();
          System.out.println("Account Delete");}


        else {
            Thread.sleep(2000);
        ClickButton_xpath(".//a [text()='My Account']");
        ClickButton_xpath(".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]");
        ClickButton_xpath(".//div [@class='p1'] /a");
        checkAlert();
            System.out.println("Account Delete ");}}}}



    public static  void checkAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(dr, 2);
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = dr.switchTo().alert();
            alert.accept();
        } catch (Exception e) {

        }
    }





    public  static  void Paymen_for_Dev () {

        SendKeys("//td/input  [@ id ='first_name']","Ageev Nikita" );
        SendKeys("//td/input  [@ id ='card_number']","4111111111111111");
        SendKeys("//td/input  [@ id ='card_security']", "123");
        SendKeys("//td/input  [@ id ='card_address1']","Biling Address 123");
        SendKeys("//td/input  [@ id ='card_city']","Doneck" );
        SendKeys("//td/input  [@ id ='card_zip']","456789");
        ClickButton_xpath("//td/select   [@ id ='card_countries']/option [@value= 'US' ]");
        ClickButton_xpath("//td/button [@id = 'payment_button_new']");

        if (dr.getCurrentUrl().contains("payment.htm")) {

            System.out.println("Payment not successful");
        }
        if (dr.getCurrentUrl().contains("en/payment/success/cc/")){
            System.out.println("Payment successful");
        }

    }


    public  static void  If_Click_Button (String xpath, String xpath1){
        if (CheckButton(xpath)){
        ClickButton_xpath(xpath1);}

        }

    public static void  LoginGoogle () throws InterruptedException {
        OpenUrl("https://mail.google.com/mail/u/0/#inbox");
        ClickButton_xpath("//div [@class='maia-util']/a [@href='https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/&hl=ru']");
        WaitLink("ServiceLogin");
        SendKeys("//div [@class='form-panel first valid']//input[@id='Email']","ageevnikitatest@gmail.com");
        ClickButton_xpath("//div [@class='form-panel first valid']//input[@id='next']");
        Thread.sleep(2000);
        SendKeys("//div [@class='form-panel second']//input[@id='Passwd']","kifoR1996");
        ClickButton_xpath("//div [@class='form-panel second']//input[@id='signIn']");
        WaitLink("/mail/u/0/#inbox");

    }

    public static void ClearField (String xpath) {
        dr.findElement(By.xpath(xpath)).clear();

    }




}


