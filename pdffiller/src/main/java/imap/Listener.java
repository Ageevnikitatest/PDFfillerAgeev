package imap;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.IOException;


/**
 * Created by ANS on 27/08/15.
 */



public class Listener extends TestListenerAdapter {





    public void onTestStart(ITestResult result){
       System.out.println(result.getName() +" - this test_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ Start"+ "\n");


    }



    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName()+ " - this test _ __ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ Error"+ "\n");
        try {
            PageObject.screenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName() + " - this test_ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _ _ _ _ _ Success"+ "\n");
        try {
            PageObject.screenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        System.out.println(result.getName() + " - this test_ _ _ _  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ Skipped"+ "\n");

    }

    @Override
    public void onFinish(ITestContext result) {


    }
}
