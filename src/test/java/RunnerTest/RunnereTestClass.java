package RunnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src/test/java/Features",
		glue="StepDefination",
		dryRun=false,
		monochrome=true
		
		)


public class RunnereTestClass extends AbstractTestNGCucumberTests{

}
