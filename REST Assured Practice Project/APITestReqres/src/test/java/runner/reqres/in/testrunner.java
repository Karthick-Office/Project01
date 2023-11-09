package runner.reqres.in;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\feature\\reqres\\in\\reqres.feature",
				 glue= {"definition.reqres.in"},
	
						 plugin= {"html:target/Cucumberreport.html",
								 "pretty",
								"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
								"timeline:test-output-thread/"})

public class testrunner {

}
