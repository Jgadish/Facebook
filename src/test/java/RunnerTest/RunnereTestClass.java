package RunnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="C:\\Users\\RSC\\git\\Facebook\\Features",
		glue="StepDefination",
		dryRun=true,
		monochrome=true
		
		)


public class RunnereTestClass extends AbstractTestNGCucumberTests{

}
