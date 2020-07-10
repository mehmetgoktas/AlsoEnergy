package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
			plugin ={"html:target/cucumber", "json:target/report.json"},
			features = "src/test/resources/",
			tags = "@test" ,
			glue = "steps",
			dryRun = false,
			monochrome = true
			)
public class Runner {

}
