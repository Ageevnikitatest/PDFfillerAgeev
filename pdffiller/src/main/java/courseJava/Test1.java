package courseJava;

import imap.BeforeAfter;
import org.testng.annotations.Test;

/**
 * Created by ANS on 22/04/16.
 */
public class Test1 extends BeforeAfter{

    User user  = new User("fdvfd@greg.reg","gfd");

    @Test
    public void fds() throws InterruptedException {

        driver.get("https://kismia.com/#registration");
        InterFace regForm = new RegForm5(driver);
        regForm.registerNewUser(user);
        Thread.sleep(5000);
    }


}
