package Runner;

import org.junit.runner.RunWith; 

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith (Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/Postfeature"},
		glue = {"stepDefinitions"},
		plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		
		monochrome = true, dryRun = false, publish = true)

public class TestRunner {
	
	
}

