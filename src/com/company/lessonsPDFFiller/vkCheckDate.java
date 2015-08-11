package com.company.lessonsPDFFiller;

import com.company.pdfFiller.Constants;
import com.company.pdfFiller.P_O;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.awt.*;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Никита on 07/11/15.
 */

@RunWith(JUnit4.class)
public class vkCheckDate {

    public  static WebDriver dr ;

    @Before
    public  void Start1() throws AWTException, InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", Constants.ROOT_DIR_CHROME_APP);
        WebDriver dr = new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        P_O.OpenFirst(dr, "https://vk.com");
    }



    @After
    public void END(){
        P_O.close();}

    public static String Phone = "380501863551";
    public static String Password = "kifor1996";
    public static String ExpectedDate = "21 января" ;
    public static String ExpectedYear = "1991";



      @Test

    public void  Test1 () throws InterruptedException {
          P_O.SendKeys("//div[@class='labeled']/input[@name='email']",Phone);
          P_O.SendKeys("//div[@class='labeled']/input[@name='pass']",Password);
          P_O.ClickButton_id("quick_login_button");

          if (P_O.Displayed_any_ByXpath("//div[@class='clear_fix ']/div[text()='День рождения:']")) {

               if (!ExpectedDate.equals(P_O.Get_Text("(//*[@class='labeled fl_l']/a)[1]"))) {

                   P_O.OpenUrl("https://vk.com/edit");
                   Thread.sleep(2000);
                   P_O.ClickButton_xpath("(//input[@class='selector_input selected'])[4]");
                   P_O.ClickButton_xpath("//li[text()='21']");
                   P_O.ClickButton_xpath("(//input[@class='selector_input selected'])[5]");
                   P_O.ClickButton_xpath("//li[text()='Января']");
                   P_O.ClickButton_xpath("(//input[@class='selector_input selected'])[6]");
                   P_O.ClickButton_xpath("//li[text()='1991']");
                   P_O.ClickButton_xpath("//div[@class='pedit_controls clear_fix']/button[text()='Сохранить']");
                   P_O.checkAlert();
                   P_O.OpenUrl("https://vk.com");
               }


              if (!ExpectedYear.equals(P_O.Get_Text("(//*[@class='labeled fl_l']/a)[2]"))){


                  P_O.OpenUrl("https://vk.com/edit");
                  Thread.sleep(2000);
                  P_O.ClickButton_xpath("(//input[@class='selector_input selected'])[4]");
                  P_O.ClickButton_xpath("//li[text()='21']");
                  P_O.ClickButton_xpath("(//input[@class='selector_input selected'])[5]");
                  P_O.ClickButton_xpath("//li[text()='Января']");
                  P_O.ClickButton_xpath("(//input[@class='selector_input selected'])[6]");
                  P_O.ClickButton_xpath("//li[text()='1991']");
                  Thread.sleep(1000);
                  P_O.ClickButton_xpath("//div[@class='pedit_controls clear_fix']/button[text()='Сохранить']");
                  P_O.checkAlert();
                  P_O.OpenUrl("https://vk.com");
                  Thread.sleep(1000);

              }
              }


              else {P_O.OpenUrl("https://vk.com/edit");
                   Thread.sleep(2000);
                   P_O.ClickButton_xpath("(//input[@class='selector_input selected'])[4]");
                   P_O.ClickButton_xpath("//li[text()='21']");
                   P_O.ClickButton_xpath("(//input[@class='selector_input selected'])[5]");
                   P_O.ClickButton_xpath("//li[text()='Января']");
                   P_O.ClickButton_xpath("(//input[@class='selector_input selected'])[6]");
                   P_O.ClickButton_xpath("//li[text()='1991']");
                   Thread.sleep(1000);
                   P_O.ClickButton_xpath("//div[@class='pedit_controls clear_fix']/button[text()='Сохранить']");
                   P_O.checkAlert();
                   P_O.OpenUrl("https://vk.com");
                   Thread.sleep(1000);
               }


          }}
