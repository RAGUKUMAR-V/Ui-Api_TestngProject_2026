package listeners;

import DriverManager.DriverFactory;
import Utilities.Utils;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class itestlistener extends Utils implements ITestListener {


    public void onTestFailure(ITestResult result)  {
        System.out.println("===== onTestFailure Executed =====");
        String testname=result.getName();
        try {
            takescreenshot(DriverFactory.getDriver(),testname);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
