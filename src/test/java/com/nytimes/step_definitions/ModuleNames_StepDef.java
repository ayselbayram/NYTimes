package com.nytimes.step_definitions;

import com.nytimes.pages.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ModuleNames_StepDef {
    HomePage homePage=new HomePage();
    @Then("verify {string} is displayed")
    public void verify_is_displayed(String string) {
        for(WebElement each:homePage.modules){
            if(each.getText().equals(string)){
                System.out.println(each.getText()+" is displayed");
            }
        }

    }

}
