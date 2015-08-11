package com.company.Lessons;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Никита on 08/05/15.
 */

@RunWith(JUnit4.class)
public class Zadanie_10 {
    // для окна загрузки файлов
     /*
    setClipboardData("C:\\file.jpg");
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
     public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);}*/





    @Before
     public void Start(){
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver dr = new ChromeDriver();
        Zadanie_10_P_O.open(dr);
    }

     //   /usr/local/bin/chromedriver     drone    C:/Nikita/Work/Avtomatization/chromedriver.exe


    @Test        //Проверка на работоспособность
    public void Test1() throws InterruptedException {

        Zadanie_10_P_O.SendKeysLeft("Hello . how are you ?");
        Zadanie_10_P_O.ClickTranslate();
        String b = "Здравствуйте. как дела?";
        Thread.sleep (2000);
        Assert.assertEquals("Проверка на работоспособность", b, Zadanie_10_P_O.GetResult());
        Zadanie_10_P_O.Closeee();

    }

    @Test     //Проверка title

    public  void Test2(){
        String expectedTitle = "Переводчик Google";
        Assert.assertEquals(expectedTitle,Zadanie_10_P_O.getTitle() );
        Zadanie_10_P_O.Closeee();

    }

    @Test     // Проверить наличие полей и кнопки Транслейт

    public void  Test3() throws InterruptedException {      // найти поля и кнопку

        Assert.assertEquals(true, Zadanie_10_P_O.DisplayedLeftPart());
        Assert.assertEquals(true, Zadanie_10_P_O.DisplayedRightPart());
        Assert.assertEquals(true, Zadanie_10_P_O.DisplayedButton());
        Zadanie_10_P_O.Closeee();

    }

    @Test     // Правое поле не добавляет текст

    public void Test4(){
              boolean k = true;
              Assert.assertEquals(k,Zadanie_10_P_O.isEnableRight());
        Zadanie_10_P_O.Closeee();

    }

    @Test   // роверка наличия языков (Греческий...)

    public  void  Test5() throws InterruptedException {

        Zadanie_10_P_O.SelectLangLeft();

        Thread.sleep(2000);
        String a = "греческий";
        String b = "мальтийский";
        String c = "словацкий";
        Assert.assertEquals(a,Zadanie_10_P_O.GetLang1());
        Assert.assertEquals(b,Zadanie_10_P_O.GetLang2());
        Assert.assertEquals(c,Zadanie_10_P_O.GetLang3());
        Zadanie_10_P_O.Closeee();

    }

    @Test  //  Проверка наличия кнопки прослушки

    public  void  Test6 () throws InterruptedException {
        Zadanie_10_P_O.SendKeysLeft("Hello");
        Zadanie_10_P_O.ClickTranslate();
        boolean k = true;
        Thread.sleep(1000);
        Assert.assertEquals(k,Zadanie_10_P_O.DisplayedVolumeButton());
        Zadanie_10_P_O.Closeee();

    }

    @Test // Проверка что переводится Hello в другой ссылке

    public  void  Test7() throws InterruptedException {
        Zadanie_10_P_O.OpenLink();
        Zadanie_10_P_O.GetLeftField();
        Thread.sleep(1000);
        String k1 = "Привет";
        String k2 = "Hello";
        Assert.assertEquals(k1,Zadanie_10_P_O.GetResult());
        Assert.assertEquals(k2,Zadanie_10_P_O.GetLeftField());
        Zadanie_10_P_O.Closeee();

    }

    @Test   // Выбрать языки , изменить местами, проверить правильность

    public  void Test8 () throws InterruptedException {
        Zadanie_10_P_O.SelectLangLeft();
        Zadanie_10_P_O.ByXPath1();
        Zadanie_10_P_O.SelectLangRight();
       Zadanie_10_P_O.ByXPath2();
        Zadanie_10_P_O.ChangeLang();
        Zadanie_10_P_O.SendKeysLeft("Hello");
        String g = "hola";
        Thread.sleep(1000);
        Assert.assertEquals(g,Zadanie_10_P_O.GetResult());
        Zadanie_10_P_O.Closeee();


    }

    @Test    // Проверка  cross

    public  void  Test9() throws InterruptedException {
        Zadanie_10_P_O.SendKeysLeft("Hello");
        Zadanie_10_P_O.ClickCross();
        Thread.sleep(1000);
        String g1 = "";
        Assert.assertEquals(g1,Zadanie_10_P_O.GetLeftField());
        Assert.assertEquals(g1,Zadanie_10_P_O.GetResult());
        Zadanie_10_P_O.Closeee();

    }

    @Test   // Выбо укр. языка и перевод

    public  void  Test10 () throws InterruptedException {
        Zadanie_10_P_O.SelectLangLeft();
        Thread.sleep(1000);
        Zadanie_10_P_O.ByXPath3();
        Zadanie_10_P_O.SelectLangRight();
        Thread.sleep(1000);
        Zadanie_10_P_O.ByXPath4();
        Thread.sleep(1000);
        Zadanie_10_P_O.SendKeysLeft("С У! Г С!");
        Thread.sleep(2000);
        System.out.println(Zadanie_10_P_O.GetResult());
        Zadanie_10_P_O.Closeee();
    }
}




