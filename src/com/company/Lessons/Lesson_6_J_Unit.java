package com.company.Lessons;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by Никита on 08/04/15.
 *
 */

@RunWith(JUnit4.class)

public class Lesson_6_J_Unit {



    @Before
    public void pered_testom() {
        System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        PageObject.open(dr);
    }



    @Test

    public  void  Test1(){

        PageObject.findMaster("123456");
        PageObject.findSite("gmail.com");
        PageObject.pressEnter();
        PageObject.checkAlert();
        String expectedresult2 = "DhpO4o+PKM3qA@1a";
        Assert.assertEquals("Тест 1 упал " ,expectedresult2,PageObject.contentParol() );

    }



    @Test

    public  void Test2 (){

        PageObject.findMaster("");
        PageObject.findSite("");
        PageObject.pressEnter();
        PageObject.checkAlert();
        String expectedresult2 = "BaefBs8/Z/cm2@1a";
        Assert.assertEquals("Тест 2 упал " ,expectedresult2,PageObject.contentParol() );
    }

    @Test

    public  void Test3 () {

        int i = 0;
        for (i=0; i<200; i++ ) {
            PageObject.findMaster("1");
            PageObject.findSite("1");
        }
        PageObject.pressEnter();
        PageObject.checkAlert();
        String expectedresult2 = "aR8ztwNBbSqe5@1a";
        Assert.assertEquals("Тест 3 упал ", expectedresult2, PageObject.contentParol());
    }


    @Test
    public  void Test4 (){

        PageObject.findMaster("!@#$%^&*((((()");
        PageObject.findSite("!@#$%^&*())))))))");
        PageObject.pressEnter();
        PageObject.checkAlert();
        String expectedresult2 = "fwfy9LM437BKx@1a";
        Assert.assertEquals("Тест 4 упал " , expectedresult2,PageObject.contentParol());
    }

    @Test
    public  void Test5 (){

        String G = PageObject.dr.findElements(By.tagName("input")).get(2).getAttribute("value");
        String G1    = "Generate";
        Assert.assertEquals("Тест 5 упал " , G,G1 );
    }


    @Test
    public void  Test6 () {
        String g = "123456";
        String g1 = "gmail.com";
        PageObject.findMaster(g);
        PageObject.findSite(g1);
        PageObject.pressEnter();
        PageObject.checkAlert();
        Assert.assertEquals(g,PageObject.contentMaster());
        Assert.assertEquals(g1,PageObject.contentSite());
    }

    @Test
    public void  Test7() {
        PageObject.findMaster("12345");
        PageObject.findSite("gmail.com");
        PageObject.pressEnter();
        PageObject.checkAlert();
        boolean k = true ;
        Assert.assertEquals(k,PageObject.isEnableMaster());
    }

    @Test
    public void  Test8() {
        PageObject.findMaster("12345");
        PageObject.findSite("gmail.com");
        PageObject.pressEnter();
        PageObject.checkAlert();
        boolean k = true ;
        Assert.assertEquals(k,PageObject.isEnableSite());
    }

    @Test
    public void  Test9() {
        PageObject.findMaster("12345");
        PageObject.findSite("gmail.com");
        PageObject.pressEnter();
        PageObject.checkAlert();
        boolean k = true ;
        Assert.assertEquals(k,PageObject.isEnablePass());
    }

    @Test
    public  void  Test10() {
        String a = "Your master password";
        String b = "Site name";
        String c = "Generated password";
        Assert.assertEquals(PageObject.getMasterLabel(), a);
        Assert.assertEquals(PageObject.getSiteLabel(),b);
        Assert.assertEquals(PageObject.getPasswordLabel(),c);
    }


    @Test
    public  void  Test11() throws InterruptedException {
        PageObject.findMaster("11111");
        PageObject.findSite("11111");
        PageObject.pressEnter();
        PageObject.checkAlert();
        while (PageObject.contentParol() != "") {
             Thread.sleep(1000);
            return;
         }
        String expectedresult2 = "fbGEc7Ssq/i7a@1a";
        Assert.assertEquals( expectedresult2,PageObject.contentParol());

    }

    @Test
    public  void  Test12 () throws InterruptedException {
        PageObject.findMaster("22222");
        PageObject.findSite("22222");
        while (PageObject.poiskGenerate()!= null ) {
            Thread.sleep (1000);
            return;
        }
        PageObject.pressEnter();
        PageObject.checkAlert();
        String expectedresult2 = "zx62ytG380jLU@1a";
        Assert.assertEquals( expectedresult2,PageObject.contentParol());
    }



    @Test
    public  void  Test13() {
        PageObject.findMaster("22222");
        PageObject.findSite("22222");
        PageObject.pressEnter();
        PageObject.checkAlert();
        String expectedresult2 = "zx62ytG380jLU@1a";
        Assert.assertEquals( expectedresult2,PageObject.contentParol());

}
}
