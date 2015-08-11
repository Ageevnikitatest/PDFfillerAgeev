package com.company.Lessons;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.charset.Charset;

/**
 * Created by Никита on 11/05/15.
 */

public class Zadanie_10_P_O {

    public  static  WebDriver dr ;

    public  static  void  open (WebDriver dr) {

        Zadanie_10_P_O.dr = dr;
        dr.manage().window().maximize();
        dr.get("https://translate.google.com/");
    }

    public  static  void  open1 (WebDriver dr) {

        Zadanie_10_P_O.dr = dr;
        dr.manage().window().maximize();
        dr.get("http://booking.uz.gov.ua/ru/");
    }



    //взять текст из поля перевода
    public static String GetResult(){
        String k = GetText(dr.findElement(By.xpath("//span [@id='result_box']")));
        return k;
    }

    public  static   String GetText (WebElement e ) {
    String tmp = e.getText();
     return new String(tmp.getBytes(Charset.forName("utf-8")));
    }

    // нельзя ввести символы в правую колонку
    public static boolean isEnableRight() {
        boolean t =  dr.findElement(By.xpath("//span [@id='result_box']")).isEnabled();
        return t;
    }

    public  static boolean DisplayedLeftPart (){
        WebElement k = dr.findElement(By.id("source"));
        return  k.isDisplayed();
    }

    public  static boolean DisplayedRightPart() {
        WebElement k = dr.findElement(By.xpath("//span [@id='result_box']"));
        return  k.isDisplayed();
    }

    public  static  boolean DisplayedButton(){
        WebElement k = dr.findElement(By.id("gt-submit"));
        return  k.isDisplayed();
    }

    public  static  boolean DisplayedVolumeButton () {
        WebElement k = dr.findElement(By.xpath("//div[@class='trans-listen-button goog-toolbar-button']"));
        return k.isDisplayed();
    }

    public   static String SendKeysLeft(String t){
        dr.findElement(By.id("source")).sendKeys(t);
        return t;
    }

    public static void  ClickTranslate(){
        dr.findElement(By.id("gt-submit")).click();
    }

    public static void  SelectLangLeft(){
        dr.findElement(By.id("gt-sl-gms")).click();
    }

    public static void  SelectLangRight(){
        dr.findElement(By.id("gt-tl-gms")).click();
    }

    public static void OpenLink(){
        dr.get("https://translate.google.com/#auto/en/Hello");
    }

    public  static String GetLeftField (){
        String k = GetText(dr.findElement(By.id("source")));
        return k;
    }

    public static void ChangeLang(){
        dr.findElement(By.id("gt-swap")).click();
    }

    public static void ClickCross(){
        dr.findElement(By.id ("gt-clear")).click();
    }

        public static String getTitle() {
            return dr.getTitle();
        }

    public static String GetLang1() {
    String a1 = GetText(dr.findElement(By.xpath(".//*[@id=':i']")));
    return a1; } // взять название языка

    public static String GetLang2() {
        String a1 = GetText(dr.findElement(By.xpath(".//*[@id=':1b']")));
        return a1; } // взять название языка

    public static String GetLang3() {
        String a1 = GetText(dr.findElement(By.xpath(".//*[@id=':1t']")));
        return a1; } // взять название языка

    public static void ByXPath1 (){
        dr.findElement(By.xpath(".//*[@id=':u']")).click();}

    public static void ByXPath2 (){
        dr.findElement(By.xpath(".//*[@id=':2r']")).click();}

    public static void ByXPath3 (){
        dr.findElement(By.xpath("//div[@id=':29']")).click();}

    public static void ByXPath4 (){
        dr.findElement(By.xpath("//div[@id=':4u']")).click();}

    @After
    public static void Closeee() {
        dr.quit();
    }
    }




