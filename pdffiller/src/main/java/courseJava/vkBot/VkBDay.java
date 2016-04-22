package courseJava.vkBot;


import imap.BeforeAfter;
import imap.Listener;
import imap.PageObject;
import org.testng.annotations.Listeners;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by ANS on 21/04/16.
 */

@Listeners({Listener.class})
public class VkBDay extends BeforeAfter{

    private static  String people = "//a[@id='head_people']";
    private static  String vk = "https://www.vk.com";

    private static  String nameField = "//div[@class='labeled']/input [@name='email']";
    private static  String passField = "//div[@class='labeled']/input [@name='pass']";
    private static  String enterButton = "//button[@class='flat_button button_wide button_big'][1]";
    private static  String logOut = "//a[@id='logout_link']";
    private static  String addFriendButton = "(//div[@class='info fl_l']/button[@id])[]" + "[]";



    @Step ("login")
        public static void loginVk (String email, String password) throws InterruptedException {

             PageObject.openUrl(vk);
             PageObject.sendKeys(nameField,email);
             PageObject.sendKeys(passField, password);
             PageObject.clickButtonXpath(enterButton);
             PageObject.waitElement(people,5);
}

    @Step ("logOut")
        public static void  logUot (){
        PageObject.clickButtonXpath(logOut);
    }



    @Step ("addPeople")
        public static void addPeople(String email, String password) throws InterruptedException {

             PageObject.clickButtonXpath(people);
             Thread.sleep(2000);

                 for (int i = 1; i <= 11; i++){
                     PageObject.clickButtonXpath("(//div[@class='info fl_l']/button[@id])[" + i + "]");
                     Thread.sleep(3000);
                     System.out.println(PageObject.getText("(//div[@class='labeled name']/a[@href])[" +i+ "]" + "\n"));
                     i++;

                     PageObject.clickButtonXpath("(//span[@class='left_label inl_bl'])[11]");
                     Thread.sleep(3000);
                     PageObject.clickButtonXpath("(//span[@class='left_label inl_bl'])[1]");
                     Thread.sleep(3000);
                     PageObject.clickButtonXpath(people);
            }
        }
    }








