package Runner;

import org.junit.runner.RunWith; 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith (Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features/Get.feature"},
		glue = {"stepDefinitions"},
		
		monochrome = true, dryRun = false, publish = true)

public class TestRunner {
	
	
}

