package Retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

    int count=0, maxcount=3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(count<maxcount){
            count++;
            System.out.println("Retrying test : "+iTestResult.getName()+ "Retry count: "+count);
             return true;
        }
        return false;
    }
}
