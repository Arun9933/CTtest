package CTtest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        // Implementation for onStart method
    	
    }

    @Override
    public void onFinish(ITestContext context) {
        // Implementation for onFinish method
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Implementation for onTestStart method
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Implementation for onTestSuccess method
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Implementation for onTestFailure method
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Implementation for onTestSkipped method
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Implementation for onTestFailedButWithinSuccessPercentage method
    }
}

