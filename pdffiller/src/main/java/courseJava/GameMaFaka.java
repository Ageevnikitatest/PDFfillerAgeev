package courseJava;

import imap.BeforeAfter;
import imap.PageObject;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 * Created by ANS on 22/03/16.
 */
public class GameMaFaka extends BeforeAfter{

    @Test

    public static void game () throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Random random = new Random();
        PageObject.openUrl("http://gabrielecirulli.github.io/2048/");

        int counters =random.nextInt(3) ;

        while (counters<10) {

        switch (counters) {

            case 0:  robot.keyPress(KeyEvent.VK_RIGHT);
            case 1:  robot.keyPress(KeyEvent.VK_LEFT);
            case 2:  robot.keyPress(KeyEvent.VK_DOWN);
            case 3:  robot.keyPress(KeyEvent.VK_UP);

                counters = random.nextInt(3);

                if (driver.findElement(By.xpath("")).isDisplayed()){
                    break;
                }
                else {

                }

        }

    }

}}
