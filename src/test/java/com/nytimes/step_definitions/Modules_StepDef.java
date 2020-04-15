package com.nytimes.step_definitions;

import com.nytimes.pages.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Modules_StepDef {
    HomePage homePage=new HomePage();

    @Then("user should see {string} modules")
    public void user_should_see_modules(String string) {
        int result;
        result=homePage.modules.size();
        int expected=Integer.parseInt(string);
        Assert.assertEquals(expected,result);

    }
}
