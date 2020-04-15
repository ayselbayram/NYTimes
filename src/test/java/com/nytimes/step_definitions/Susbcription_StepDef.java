package com.nytimes.step_definitions;

import com.nytimes.pages.HomePage;
import com.nytimes.pages.SubscriptionPage1;
import com.nytimes.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Susbcription_StepDef {
    HomePage homePage=new HomePage();

    SubscriptionPage1 subscriptionPage1=new SubscriptionPage1();

    @Then("user clicks on susbcribe now button")
    public void user_clicks_on_susbcribe_now_button() {

        WebDriverWait wait= new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.visibilityOf(homePage.LogIn));
        homePage.LogIn.click();

    }

    @Then("user clicks on Subscribe Now button")
    public void user_clicks_on_Subscribe_Now_button() {
        //subscriptionPage1.subscribeNow1.click();

    }

    @Then("user enters valid {string}")
    public void user_enters_valid(String string) {

    }

    @Then("user clicks on Continue")
    public void user_clicks_on_Continue() {

    }

    @Then("user clicks on Login")
    public void user_clicks_on_Login() {

    }

    @Then("user enters requires information to be subscribed")
    public void user_enters_requires_information_to_be_subscribed(io.cucumber.datatable.DataTable dataTable) {

    }

    @Then("user clicks on purchase subsciption")
    public void user_clicks_on_purchase_subsciption() {

    }

    @Then("verify user sess error message {string} is displayed")
    public void verify_user_sess_error_message_is_displayed(String string) {

    }

}
