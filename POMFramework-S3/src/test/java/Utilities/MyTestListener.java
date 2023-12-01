package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener {
    private WebDriver driver; // Assuming you have the driver initialized somewhere

    public void onTestStart(ITestResult result) {
        System.out.println("Test method has been started");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test method is success");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test method is failure");
        System.out.println("Screenshot code");
        try {
            captureScreenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test method is skipped");
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Test method is failure due to timeout");
    }

    public void onStart(ITestContext context) {
        System.out.println("Testing has started");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Testing has ended");
    }

    private void captureScreenshot(String testName) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath = "screenshots/" + testName + ".png";
        FileUtils.copyFile(src, new File(screenshotPath));
        System.out.println("Screenshot captured: " + screenshotPath);
    }
}
