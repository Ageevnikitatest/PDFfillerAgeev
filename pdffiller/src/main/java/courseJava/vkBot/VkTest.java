package courseJava.vkBot;


import courseJava.vkBot.VkBDay;
import org.testng.annotations.Test;

/**
 * Created by ANS on 21/04/16.
 */


public class VkTest extends VkBDay {


    private static  String phone = "+79667516687";
    private static  String password = "Anna26";

    @Test
    public static void addPeople () throws InterruptedException {

        VkBDay.loginVk(phone,password);
        // VkBDay.addPeople(phone,password);


        VkBDay.logUot();


    }


}
