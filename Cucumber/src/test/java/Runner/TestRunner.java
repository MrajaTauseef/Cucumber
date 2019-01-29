package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature",glue={"StepDefinition"})
public class TestRunner {
	
	//Testing it for Push tp master branch

}
