package com.company.PdfFiller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Никита on 06/09/15.
 */




@RunWith(JUnit4.class)
public class Email_SMS {
    public static WebDriver dr;


    @Before
    public  void Start1() throws AWTException, InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", Constants.ROOT_DIR_CHROME_APP);
        WebDriver dr = new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        P_O.OpenFirst(dr, "https://dev5.pdffiller.com/en/login.htm?v=4");

        //https://root:letmein@dev2.pdffiller.com

    }



    @After
    public void END(){
        P_O.close();}


    // ALL BUTTONS

    public static String SearchDocument = "//td[@class='search_document']";
    public static String Field4Search = "//div [@class='body_search']//input[@class = 'input_uploader search_uploader ui-autocomplete-input']"; // Поле для ввода запроса поиска
    public static String Search = "//div [@class='body_search']//a[text()='Search']";
  //public static String FillOnline = "//a[text()='Fillable Form W-9 (Rev. December 2014)'] ";   FOR LIFE
    public  static  String FillOnline = "/html[@class=' googleChrome googleChrome']/body/div[@id='body-content-wrapper']/div[@class='wrap-inner']/div[@class='wrap']/div[@class='content-pad']/div[@id='search_web_1']/div[@id='uploader']/div[@id='body_uploader']/div[@class='body_search']/div[@id='search_main_1']/div[@id='search_results']/div[@class='item'][1]/div[@class='descr']/table/tbody/tr/td[@class='btn-wrapper']/a[@class='btn-red btn-fill']/div[@class='icon-bedit']";
    public static String FillOnline2= "//a[text()='Fillable Form W-9'] ";
    public static String LinkEditorWait = "/project/";
    public static String LinkEditorTest = "https://www.pdffiller.com/en/export/choice.htm";
    public static String LinkChoiceWait = "choice";
    public static String EmailSmsButton = "//a/span[text()='Email / SMS'] ";
    public static String  LoginPage = "https://denise.pdffiller.com/en/login.htm";
    public static String  MyAccount = ".//a [text()='My Account']";
    public static String AccountInformation = ".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]";
    public static String SendWithEmailSMS = "//div [@class='send-preferences radio-list']/label[text()='Send with Email/SMS']";
    public static String SaveMyAccoun = "//tr/td //a [@id = 'btn_saveSendPreferences']";
    public static String MyForms = "//div [@id = 'body-content-wrapper']//a[text()= 'My Forms']";
    public  static String  EmailSms_MyForms = "//div [@class='sngl-btn icon_mail']/div";
    public static String  FieldEmailTo = "//div [@class='export__form-control__container']/input[@name='email_to']";
    public static String SendTo = "//div [@class='export-header__btn-container'] //span [text()='Send Email']";
    public static String dev28 = "https://root:letmein@dev28.pdffiller.com/en/login.htm";
    public static String GoToMyForms_popup = "//div//a [@href='/en/forms.htm?target=outbox_email']";
    public static String checkMark = "//td[@class='brd select contein_label']/div /input[@formid='100109021'] ";




    @Test
    public   void  Test1 () throws InterruptedException, IOException {



        P_O.ClickButton_xpath(SearchDocument); // Нажать поиск на аплоадере
        Thread.sleep(2000);
        P_O.SendKeys(Field4Search, "W 9 "); // Вводим в поле "W 9"
        P_O.ClickButton_xpath(Search);  // Нажать Search
        P_O.WaitButton(FillOnline, "Fill Online"); //Ждем Fill Online
        if (P_O.CheckButton(FillOnline))    // Поиск ссыллок на форму и нажатие на них
        {
        P_O.ClickButton_xpath(FillOnline);
        }
        else
        {
            P_O.ClickButton_xpath(FillOnline2);
        }
        P_O.WaitLink(LinkEditorWait); // Ждать ссылку
        Thread.sleep(5000);
        P_O.Screenshot();
        P_O.GetParametr(); // Добавить параметр и передать
        P_O.WaitLink(LinkChoiceWait); //Ждать ссылку Choise
        Thread.sleep(3000);
        P_O.Screenshot(); // Скриншот в  папке | C:\Nikita\Work\Avtomatization\Screens
        P_O.ClickButton_xpath(EmailSmsButton); //ажать на Choise
        P_O.checkAlert();  // переключение на окно регистрации
        P_O.Registration();  // регистрация
        P_O.Paymen_for_Dev();//оплата
        P_O.ClickButton_xpath(MyAccount); //Нажатие на Мой аккаунт
        P_O.WaitButton(AccountInformation, "AccountInformation"); // Ждать
        P_O.ClickButton_xpath(AccountInformation);
        Thread.sleep(3000);
        P_O.ClickButton_xpath(SendWithEmailSMS); // переключение с pMail на Email
        P_O.ClickButton_xpath(SaveMyAccoun); // press Save
        P_O.ClickButton_xpath(MyForms);  // press My Forms
        Thread.sleep(5000);
       //  P_O_TieredP.ClickButton_xpath(checkMark); // выбираем форму
        P_O.ClickButton_xpath(EmailSms_MyForms);    // press Email/SMS
        Thread.sleep(10000);
        P_O.SendKeys(FieldEmailTo, "ageevnikitatest@gmail.com");  // Заполнение поля имейл получателя
        P_O.Screenshot();  // скриншот
        P_O.ClickButton_xpath(SendTo); // нажать на отправку
        Thread.sleep(15000);
        P_O.checkAlert();
        P_O.ClickButton_xpath(GoToMyForms_popup);
        P_O.DeleteAccoutn();
    }}

