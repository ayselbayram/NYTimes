package com.nytimes.pages;

import com.nytimes.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    @FindBy(xpath = "//div[@data-testid='masthead-mini-nav']/ul/li")
    public List<WebElement>modules;

    @FindBy(xpath="//button[@data-testid='login-button']")
    public WebElement LogIn;


    public HomePage(){
        PageFactory.initElements(Driver.get(),this);

    }
    public int moduleCount(){
        int result;
        result=modules.size();
        return result;
    }

}

