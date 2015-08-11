package com.company.Lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Никита on 06/04/15.
 */
public class Lesson_5 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Nikita/Work/Avtomatization/chromedriver.exe");
        WebDriver p = new ChromeDriver();
        p.manage().window().maximize();


        p.get(" http://angel.net/~nic/passwd.current.html");

        GetPass(p, "123456", "fsdfd@fre.fer");
        GetPass(p, "sdgdfgdf", "fsdfd@gfyfguvhu.fer");
        GetPass(p, "r76tr7t7", "fsdfdr6r56r56@fre.fer");

    }

    public  static String GetPass (WebDriver j, String j1, String j2){    //metod
        j.findElement(By.name("master")).sendKeys(j1);
        j.findElement(By.name("site")).sendKeys(j2,Keys.ENTER);
        String G = j.findElement(By.name("password")).getAttribute("value");
        System.out.println(G);

        return G ;}



}










