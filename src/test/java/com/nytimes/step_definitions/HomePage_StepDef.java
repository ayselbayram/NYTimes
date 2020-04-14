package com.nytimes.step_definitions;

import com.nytimes.utilities.ConfigurationReader;
import com.nytimes.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomePage_StepDef {
    @Then("verify that title is equal {string}")
    public void verify_that_title_is_equal(String string) {
        String actual= Driver.get().getTitle();
        Assert.assertEquals(string,actual);
        System.out.println("actual = " + actual);
    }


    @Given("user is on homepage")
    public void userIsOnHomepage() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }
}
