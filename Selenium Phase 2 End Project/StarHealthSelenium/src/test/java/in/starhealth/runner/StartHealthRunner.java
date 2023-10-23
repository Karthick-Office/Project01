package in.starhealth.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\karth\\eclipse-workspace\\StarHealthSelenium\\src\\test\\java\\in\\starhealth\\features\\starHealth.feature",
                          glue="in.starhealth.definition",
                          plugin= {"html:target/Cucumberreport.html",
						  "pretty",
						  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						  "timeline:test-output-thread/"
						  }
		         
		         )
public class StartHealthRunner {

}
