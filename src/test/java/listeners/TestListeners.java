package listeners;

import base.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import reports.ExtentReportManager;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentReportManager.getExtentReports();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        Object testClass = result.getInstance();
        BaseTest baseTest = (BaseTest) testClass;

        String path = ScreenshotUtil.captureScreenshot(baseTest.getDriver(), result.getName());

        test.fail("Test Failed").addScreenCaptureFromPath(path);
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
