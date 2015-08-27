package pdffillerLessons;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;


/**
 * Created by ANS on 27/08/15.
 */



public class Listener extends TestListenerAdapter {


    public void onTestStart(ITestResult result){
        System.out.println(result.getName() +"__________________________________________________________Start");


    }



    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName()+ "_______________________________________________________Failure");



    }



    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName() + "______________________________________________________Success");
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        System.out.println(result.getName() + "______________________________________________________Skipped");

    }

    @Override
    public void onFinish(ITestContext result) {


    }
}
