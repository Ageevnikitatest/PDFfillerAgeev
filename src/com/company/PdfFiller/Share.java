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

/**
 * Created by Никита on 06/15/15.
 */

@RunWith(JUnit4.class)
public class Share {

    @Before
    public  void Start1() throws AWTException, InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", Constants.ROOT_DIR_CHROME_APP);
        WebDriver dr = new ChromeDriver();
        P_O.OpenFirst(dr, "https://root:letmein@dev2.pdffiller.com");}


    @After
    public void END(){
        P_O.close();}



    // Constants
    public static String SearchDocument = "//td[@class='search_document']";
    public static String Field4Search = "//div [@class='body_search']//input[@class = 'input_uploader search_uploader ui-autocomplete-input']"; // Поле для ввода запроса поиска
    public static String Search = "//div [@class='body_search']//a[text()='Search']";
    public static String FillOnline = "/html[@class=' googleChrome googleChrome']/body/div[@id='body-content-wrapper']/div[@class='wrap-inner']/div[@class='wrap']/div[@class='content-pad']/div[@id='search_web_1']/div[@id='uploader']/div[@id='body_uploader']/div[@class='body_search']/div[@id='search_main_1']/div[@id='search_results']/div[@class='item'][1]/div[@class='descr']/table/tbody/tr/td[@class='btn-wrapper']/a[@class='btn-red btn-fill']/div[@class='icon-bedit']";
    public static String FillOnline2= "//a[text()='Fillable Form W-9'] ";
    public static String LinkEditorWait = "/project/";
    public static String LinkChoiceWait = "choice";
    public static String EmailSmsButton = "//a/span[text()='Email / SMS'] ";
    public static String MyForms = "//div [@id = 'body-content-wrapper']//a[text()= 'My Forms']";
    public static String Share_MyForms = "//div [@class='sngl-btn icon_share']/div";
    public static String AddAnotherRecipient = "// section [@class='all-recipients']/button[@class='btn-add-recipient']";
    public static String RecipientEmail = "//div [@class ='all-recipient__item__inner__left'] //input [@class='form-control ng-scope ng-isolate-scope ng-pristine ng-valid ng-touched']";
    public static String Email = "ageevnikitatest@gmail.com";
    public static String ShareButton = "//button [@class='btn-share pull-right']";
    public static String GoToMyForms = "//div[@class='modal-btns ng-scope']/a [@href='/en/forms.htm?target=outbox_share']";
    public static String LogOut = "//div[@class='h-ac__dropdown']/a [@href='/en/logout.htm']";
    public static String urlLogin = "https://root:letmein@dev2.pdffiller.com/en/login.htm";
    public static String urlHomePage = "https://root:letmein@dev2.pdffiller.com";
    public static String FolderSharedWithMe = "//div [@class='folders-list system_folders no_drop flist_active'] //a[@href='/en/forms.htm?target=shared']";
    public static String SharedNumber = "//div [@class='folders-list system_folders no_drop flist_active'] //a[@href='/en/forms.htm?target=shared'] /span [@class='count_folder']";
    public static String  MyAccount = ".//a [text()='My Account']";
    public static String AccountInformation = ".//div [@class='wrap-inner'] //div [@class='content-pad']//td[3]";
    public static String EmailRecipient = "//div [@class='p1']//span [@id='username']";
    public static String EmailOnLogin = "//td [@class='talign_l valign_t wd_300']// input [@name='username']";
    public static String PasswOnLogin = "//td [@class='talign_l valign_t wd_300']// input [@name='password']";
    public static String AddNewForms = "div[@class = 'add_new_forms_text']";
    public static String EmailGoogle = ".//span [@id = ':3y'] [text()='Avt Test Recipient'] ";
    public static String SubjectField = "//div [@class='form-group small subject']/input[@id='share-subject']";
    public static String LinkInLetter = "//div[@style='padding-top:10px']/p[text()='To access and edit this document, click ']/a[@href]";
    public static String NewPassw = "//div[@class='form-group']/input[@id='password_reset']";
    public static String ConfirmNewPass = "//div[@class='form-group']/input[@id='confirm_reset']";
    public static String Done = "//div[@class='account-confirm-form']//button [@class='btn btn--orange']";
    public static String G = "";











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
        P_O.ClickButton_id("share_link"); //Нажать на Choise
        P_O.checkAlert();  // переключение на окно регистрации
        P_O.Registration();  // регистрация
        Thread.sleep(3000);
        P_O.ClickButton_xpath(MyAccount);    //вытягиваем аккаунт который зарегистрировали
        P_O.ClickButton_xpath(AccountInformation);  //вытягиваем аккаунт который зарегистрировали
        Thread.sleep(3000);
        String  T = P_O.Get_Text(EmailRecipient);  //вытягиваем аккаунт который зарегистрировали
        String  Email_R = T.substring(0, T.length()-10);
        P_O.ClickButton_xpath(MyForms);  // переход на МYforms
        P_O.WaitButton(Share_MyForms, "Share");
        P_O.ClickButton_xpath(Share_MyForms); // Press Share
        P_O.WaitLink("en/share/"); // wait Share link
        Thread.sleep(4000);
        P_O.Screenshot();
        Thread.sleep(2000);
        P_O.SendKeys(RecipientEmail, Email_R + "Recipient@gmail.com");
        Thread.sleep(2000);
        P_O.ClearField(SubjectField);
        P_O.SendKeys(SubjectField, Email_R);
        G = Email_R;
        Thread.sleep(4000);
        P_O.Screenshot();
        P_O.ClickButton_xpath(ShareButton);
        P_O.checkAlert();
        P_O.ClickButton_xpath(GoToMyForms);
        P_O.WaitLink("forms.htm");
        Thread.sleep(3000);
        P_O.DeleteAccoutn();
        Thread.sleep(3000);
        GmailClient.GetEmail();
        P_O.WaitLink("password/temporary");
        Thread.sleep(3000);
        P_O.SendKeys(NewPassw, "1111");
        P_O.SendKeys(ConfirmNewPass, "1111");
        P_O.ClickButton_xpath(Done);
        P_O.WaitLink("en/project/");
        Thread.sleep(3000);
        P_O.Screenshot();
        P_O.GetParametr();
        P_O.WaitLink("export/choice");
        Thread.sleep(3000);
        P_O.ClickButton_xpath(MyAccount);
        P_O.DeleteAccoutn();
    }
}
