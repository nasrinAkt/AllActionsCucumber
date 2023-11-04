package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/allFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "StepDefinition",tags = {"@tag4"})

public class runner extends AbstractTestNGCucumberTests {

}
