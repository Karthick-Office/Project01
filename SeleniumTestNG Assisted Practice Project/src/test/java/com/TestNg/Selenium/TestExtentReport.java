package com.TestNg.Selenium;
import java.awt.Desktop;
import java.io.File;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestExtentReport {

	@Test
	public void Report() throws Exception {
		ExtentReports ex=new ExtentReports();
//		File f=new File("Report.html");
		ExtentSparkReporter sr=new ExtentSparkReporter("Report.html");
		ex.attachReporter(sr);
		ex.flush(); 
        Desktop.getDesktop().browse(new File("Report.html").toURI());
	}
}
