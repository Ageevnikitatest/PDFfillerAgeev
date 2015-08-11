package pdffillerTest;

import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

/**
 * Created by ANS on 29/07/15.
 */
public class RobotPutPicture {




    public  static void robotPic() throws InterruptedException, AWTException {





        String arr[] = {"/Users/ANS/Documents/JAVA/TEST.jpg"};

        StringSelection photo = new StringSelection(arr[0]);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(photo, null);



        Thread.sleep(3000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        Thread.sleep(5000);

    }
}
