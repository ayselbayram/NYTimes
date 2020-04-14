package com.nytimes.step_definitions;

import com.nytimes.utilities.ConfigurationReader;
import com.nytimes.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {
    @Before
    public void setup(){
        Driver.get().get(ConfigurationReader.getProperty("url"));
        Driver.get().manage().window().maximize();
    }

    @After
    public void teardown(Scenario scenario){
        //if test failed - do this
        if(scenario.isFailed()){
            System.out.println("Test failed!");
            byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");

        }else{
            System.out.println("Cleanup!");
            System.out.println("Test completed!");
        }
        System.out.println("##############################");
        //after every test, we gonna close browser
        Driver.close();
    }
}
