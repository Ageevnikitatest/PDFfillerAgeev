package vkBot;

import imap.BeforeAfter;
import imap.PageObject;

/**
 * Created by ANS on 26/09/15.
 */
public class MailAccount extends BeforeAfter {



    public  static  void registration () {

        PageObject.openUrl("https://e.mail.ru/signup?from=main&rf=e.mail.ru");
        PageObject.sendKeys("","");

    }


// Shkola  //div[@class='join_next_cont']//button[@id='join_school_next_button']
    // University //div[@class='join_next_cont']//button[@id='join_university_next_button']
    // go to my page   //div[@class='join_next_cont']//button[@id='join_school_next_button']
    //  vk  +79667516687  Anna26
  // mail.ru anya.anna26.anna@mail.ru  qwer123
}
