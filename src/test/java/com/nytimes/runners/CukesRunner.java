package com.nytimes.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue="com/nytimes/step_definitions",
        dryRun = false,
        tags="@Subscription",
        plugin={"html:target/default-cucumber-reports",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt"
}
)









public class CukesRunner {

}
