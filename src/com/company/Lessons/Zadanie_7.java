package com.company.Lessons;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Created by Никита on 14/04/15.
 */

@RunWith(JUnit4.class)

public class Zadanie_7 {

    WebDriver dr;

    @After
    public void clean () {
        dr.quit();}

    @Before
    public  void  pered(){
        System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
        dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.get(" http://angel.net/~nic/passwd.current.html");

}

//      /usr/local/bin/chromedriver     C:/Nikita/Work/Avtomatization/chromedriver.exe
@Test
        public  void Test1 () {

            dr.findElement(By.name("master")).sendKeys("12345678");
            dr.findElement(By.name("site")).sendKeys("gmail.com", Keys.ENTER);
            String password = dr.findElement(By.name("password")).getAttribute("value");
            System.out.println("Пароль: " + password);
  }
}
