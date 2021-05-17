package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"step_defs"},
        tags = {},
        plugin= {"json:target/cucumber.json", "html:target/default-cucumber-reports", "pretty"},
        dryRun = false
)

public class Runner {
}
