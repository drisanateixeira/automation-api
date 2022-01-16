package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\features\\activitieApi.feature"},
		glue = "stepDefinitions",
		tags = "@test",
		plugin =  { "pretty", "html:target/cucumber-html-reports", 
				"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
		        "json:target/cucumber-html-reports/cucumber.json",
		        "rerun:target/failed_scenarios.txt" },
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false
		
		)

public class Runner {

	
}
