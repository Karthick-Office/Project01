package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "resource",
    glue = "stepdefinition",
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {
}
