package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/resources/Features",
                 glue = {"StepDefinition"},
                 plugin = {"pretty", "html:target/Cucumber_Report/Cucumber.html","json:target/Cucumber_Report/Cucumber.json"}
		
		
		
		)
public class TestRunner extends AbstractTestNGCucumberTests
{

}
