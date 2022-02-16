package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	
	features= {"src/test/java/Feature"},
	glue= {"StepDefinations"},
	tags= {"@test1"}
)

public class TestRunner extends AbstractTestNGCucumberTests {


}
