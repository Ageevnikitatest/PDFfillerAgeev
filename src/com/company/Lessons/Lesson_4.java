package com.company.Lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Никита on 30/03/15.
 */
public class Lesson_4 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
        WebDriver p = new ChromeDriver();
        p.manage().window().maximize();
        p.get("http://google.com");
        System.out.println(p.getTitle());
        WebElement s = p.findElement(By.name("q"));
        s.sendKeys("qa factory");
        s.sendKeys(Keys.ENTER);

        Thread.sleep(3000);
        WebElement rso = p.findElement(By.id("rso"));
        WebElement a = rso.findElement(By.tagName("a"));
        System.out.println(a.getText());
        List<WebElement> as =rso.findElements(By.tagName("a"));

        int j = 0;
        int els = as.size();
        while (j <els){
            System.out.println(as.get(j).getText());
            System.out.println(as.get(j).getAttribute("href"));
            j= j +1;

        }

        s.clear();
        s.sendKeys("kinopoisk");
        p.findElement(By.name("btnG")).click();




      //  p.quit();


}}


