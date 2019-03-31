package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",

		glue= {"StepDefinition"},
		dryRun=false,
		monochrome=true,
		tags= {"@Smoke,@E2E,@Smoke1"} ,
        plugin= {"pretty"}
		
		)



public class testRunner {
	
	




}
