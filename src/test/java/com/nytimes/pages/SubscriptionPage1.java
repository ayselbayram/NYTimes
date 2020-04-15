package com.nytimes.pages;

import com.nytimes.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionPage1 {

    @FindBy(linkText="Subscribe Now")
    public WebElement subscribeNow1;

    public SubscriptionPage1(){
        PageFactory.initElements(Driver.get(),this);

    }



}
