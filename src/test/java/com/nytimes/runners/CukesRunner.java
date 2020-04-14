package com.nytimes.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/Cybertek/IdeaProjects/NYTimes/src/test/resources/features",
        glue="/Users/Cybertek/IdeaProjects/NYTimes/src/test/java/com/nytimes/step_definitions",
        dryRun = false
)









public class CukesRunner {

}
