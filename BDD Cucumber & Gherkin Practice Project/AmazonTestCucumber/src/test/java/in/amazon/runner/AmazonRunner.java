package in.amazon.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\karth\\eclipse-workspace\\AmazonTestCucumber\\src\\test\\java\\in\\amazon\\features\\Amazon.feature",
                          glue="in.amazon.definition",
                          plugin= {"html:target/Cucumberreport.html",
						  "pretty",
						  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						  "timeline:test-output-thread/"
						  }
		         
		         )
public class AmazonRunner {

}
