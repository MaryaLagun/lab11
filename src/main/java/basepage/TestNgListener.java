package basepage;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.*;
import test.BaseTest;
import test.enable.InvokedMethodListener;
public class TestNgListener implements ITestListener, IInvokedMethodListener {
  //  @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
        if (method.isConfigurationMethod() || method.isTestMethod()) {
            int status = testResult.getStatus();
            if (status != 1 && WebDriverRunner.hasWebDriverStarted()) {
                try {
                } catch (Exception e) {
                    System.out.println("test");
                }
            }
        }
    }

    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}


