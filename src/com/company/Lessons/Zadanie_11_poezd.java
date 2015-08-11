package com.company.Lessons;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Никита on 18/05/15.
 */

@RunWith(JUnit4.class)
public class Zadanie_11_poezd {

    @Before
    public void Start1(){
        System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        Zadanie_11_PO.open1(dr);
    }

   /* @After
    public void END(){
        Zadanie_11_PO.close();
    }*/

    @Test

    public void  Test1 () throws InterruptedException {
        Thread.sleep(2000);
        Zadanie_11_PO.SendKeysOTKYDA();
        Thread.sleep(1000);
        Zadanie_11_PO.ViborOtkyda();
        Zadanie_11_PO.SendKeysKYDA();
        Thread.sleep(1000);
        Zadanie_11_PO.ViborKyda();
        Zadanie_11_PO.DataADD();
        Thread.sleep(2000);
        Zadanie_11_PO.SearchClick();





        String k = "043 К";
        String k1 = "143 К";
        Assert.assertEquals(k,Zadanie_11_PO.GetResult1());
        Assert.assertEquals(k1,Zadanie_11_PO.GetResult2());
        Thread.sleep(2000);
        Zadanie_11_PO.ClickResult1();
        Thread.sleep(2000);
        Zadanie_11_PO.WindDisplayed();
    }

}


