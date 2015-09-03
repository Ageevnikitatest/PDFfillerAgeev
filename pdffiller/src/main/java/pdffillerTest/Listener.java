package pdffillerTest;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import pdffillerTest.PageObject;

import java.io.IOException;


/**
 * Created by ANS on 27/08/15.
 */



public class Listener extends TestListenerAdapter {





    public void onTestStart(ITestResult result){
       // System.out.println(result.getName() +"_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ Start");


    }



    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName()+ "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ Error");
        try {
            PageObject.screenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName() + "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ Success");
        /*try {
            PageObject.screenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        System.out.println(result.getName() + "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ Skipped");

    }

    @Override
    public void onFinish(ITestContext result) {


    }
}
