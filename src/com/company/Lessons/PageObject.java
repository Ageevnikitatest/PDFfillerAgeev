package com.company.Lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Никита on 22/04/15.
 */

public class PageObject {

    public  static  WebDriver dr ;

    static List<WebElement> td = dr.findElements(By.tagName("td"));

    public  static  void  open (WebDriver dr) {

        PageObject.dr = dr;
        dr.manage().window().maximize();
        dr.get("http://oxogamestudio.com/passwd.current9.htm");
    }



    public static void findMaster(String s) {
        dr.findElement(By.xpath("//input[@type = 'password']")).sendKeys(s);  // master field
    }


    public static void findSite(String s1) {
        dr.findElement(By.xpath("(//tr/td/input)[2]")).sendKeys(s1);   //site
    }

    public static void pressEnter() {
        dr.findElement(By.xpath("(//tr/td/input)[2]")).sendKeys(Keys.ENTER);
    }

    public static String contentMaster() {
        String pole1 = dr.findElement(By.xpath("//input[@type = 'password']")).getAttribute("value"); // master field
        return pole1;
    }

    public static String contentSite() {
        String pole2 = dr.findElement(By.xpath("(//tr/td/input)[2]")).getAttribute("value"); //password
        return pole2;
    }


    public static String contentParol() {
        String pass = dr.findElement(By.xpath("(//tr/td/input)[4]")).getAttribute("value");//password
        return pass;
    }

    public static boolean isEnableMaster() {
        boolean k = dr.findElement(By.xpath("//input[@type = 'password']")).isEnabled(); // master field
        return k;

    }

    public static boolean isEnableSite() {
        boolean b = dr.findElement(By.xpath("(//tr/td/input)[4]")).isEnabled();
        return b;

    }

    public static boolean isEnablePass() {
        boolean t = dr.findElement(By.xpath("//input[@type = 'password']")).isEnabled();// master field
        return t;
    }

    public static String poiskGenerate() {
        String k = dr.findElement(By.xpath("//input[@type= 'submit']")).getAttribute("value");
        return k;                                          // Generate
    }

    public static String getMasterLabel() {

        String s = td.get(0).getText();
        return s;

    }

    public static String getSiteLabel() {

        String s = td.get(2).getText();
        return s;
    }

    public static String getPasswordLabel() {

        String s = td.get(5).getText();
        return s;
    }

    public static  void checkAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(dr, 2);
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = dr.switchTo().alert();
            alert.accept();
        } catch (Exception e) {

        }


}}
