package com.company.PdfFiller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

/**
 * Created by Никита on 25/05/15.
 */

@RunWith(JUnit4.class)
public class Tiered_pricing {
public static  WebDriver dr;

    //usr/bin/google-chrome
    //C:/Nikita/Work/Avtomatization/chromedriver.exe

    @Before
    public  void Start1() throws AWTException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", Constants.ROOT_DIR_CHROME_APP);
        WebDriver dr = new ChromeDriver();
        P_O.OpenFirst(dr, "https://root:letmein@dev28.pdffiller.com/en/login.htm");
        Thread.sleep(2000);
    }
   @After
    public void END(){
        P_O.close();
    }

public String Service = "//div /a[@class = 'h-nav__link '] [@href='/en/services.htm']";

    public String SubscribeOnServices ="/html[@class=' googleChrome']" +
            "/body/div[@id='body-content-wrapper']/div[@class='wrap-inner']/div[@id='tiered-header']" +
            "/div[@id='tiered-top']/div[@id='block-plan-center']/div[7]/" +
            "a[@class='laundry-table-item__button button-h redirect-button']" ;

    public String PaymentButton = "//li [@id ='professional']//div [@class='list-plan-item__button list-plan-item__button_bottom annual active']//a[text()]";

    public static String url1 = "//li [@id ='professional']//div [@class='list-plan-item__button list-plan-item__button_bottom annual active']//a[text()]";
    public static  String url2 = "//div //li  [@id= 'personal']//a [text()= 'Select Plan!'] ";
    public static  String url3 = "//li [@id ='professional']//div [@class='list-plan-item__button list-plan-item__button_bottom annual active']//a[text()]";
    public static String ChoiseButton = "//div [@id ='payment_button']/a[@class= 'button-h']";
    public static String ChoiseButton1 ="//div [@id ='payment_button']/a[@class= 'button-h']";
    public static String B =  "//div [@id ='payment_button']/a[@class= 'button-h']";
    public static String V = "//div /span[@class = 'text text-to-hide']";







    @Test  // Reg,Pay,Delete

    public   void  Test1 () throws InterruptedException, AWTException {
        Thread.sleep(1000);
        P_O.Registration();
        P_O.ClickButton_xpath(Service);
        P_O.CheckText("Save 66% off regular price!", V);
        P_O.ClickButton_xpath(SubscribeOnServices);
        P_O.WaitButton(PaymentButton, "Button on payment page");
        P_O.Paymen_for_Dev();
        P_O.WaitButton(B, "Continue go to ...");
        P_O.If_Click_Button(ChoiseButton1, ChoiseButton);
        P_O.DeleteAccoutn();
   }





}



