package com.company.Lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Никита on 18/05/15.
 */
public class Zadanie_11_PO {


    public  static WebDriver dr ;
    static List<WebElement> td = dr.findElements(By.xpath("//tr[@class='vToolsDataTableRow2']/td[@class='num']/a"));

    public  static  void  open1 (WebDriver dr) {

        Zadanie_11_PO.dr = dr;
        dr.manage().window().maximize();
        dr.get("http://booking.uz.gov.ua/ru/");
    }

    public  static  void  close () {

        dr.close();
    }

    public static void SendKeysOTKYDA(){
         dr.findElement(By.xpath("//input[@name='station_from']")).sendKeys("Киев");

    }

    public static void SendKeysKYDA(){
        dr.findElement(By.name("station_till")).sendKeys("Ивано");

    }

    public static void ViborOtkyda(){
        dr.findElement(By.xpath("//div[@title='Киев']")).click();

    }

    public static void ViborKyda(){
        dr.findElement(By.xpath("//div[@title='Ивано-Франковск']")).click();

    }

    public static void DataADD() {
        dr.findElement(By.id("date_dep")).clear();
        dr.findElement(By.id("date_dep")).sendKeys("20.06.2015");
        dr.findElement(By.xpath("//div[@class='krym-no-print']")).click();

    }

    public static  void  SearchClick (){
        dr.findElement(By.name("search")).click();
    }

    public static   String GetResult1(){
       String k =  dr.findElement(By.xpath("//tr[@class='vToolsDataTableRow2']/td[@class='num']/a")).getText();
               return k;
    }

    public static   String GetResult2(){
        String h =  dr.findElement(By.xpath("//tr[@class='vToolsDataTableRow']/td[@class='num']/a")).getText();
        return h;
    }

    public  static  void  ClickResult1(){
        dr.findElement(By.xpath("//tr[@class='vToolsDataTableRow2']/td[@class='num']/a")).click();
    }

    public static boolean WindDisplayed (){
        WebElement k = dr.findElement(By.xpath("//div [@class = 'vToolsPopupHeader']/span"));
        return k.isDisplayed();
    }
/*

public static String  Zaderjka1 () {
    String d = dr.findElements(By.xpath("//tr[@class='vToolsDataTableRow2']/td[@class='num']/a")).getText();
    return d;
}


public  static  void  Zaderjka () throws InterruptedException {

    while ( Zaderjka1() != "") {
            Thread.sleep(1000);
    return ;}
}
*/
}







