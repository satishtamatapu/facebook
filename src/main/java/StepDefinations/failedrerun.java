package StepDefinations;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
glue =     {"StepDefinations"},
plugin =    { "pretty","html:target/cucumber-reports",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"rerun:target/failedrerun.txt"},
features = {"@target/failedrerun.txt"},
	
 monochrome = true )
public class failedrerun extends AbstractTestNGCucumberTests {

}
