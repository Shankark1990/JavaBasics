package testngLabs.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTestListner implements IRetryAnalyzer {

    int max = 3;
    int retryCount = 0;

    @Override
    public boolean retry(ITestResult iTestResult) {

        if (iTestResult.isSuccess() == false) {
            retryCount++;
            if (retryCount <= max) {
                return true;
            }
        }
        return false;
    }
}
