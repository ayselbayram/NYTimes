package com.nytimes.step_definitions;

import com.nytimes.pages.HomePage;
import com.nytimes.utilities.ExcelUtil;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class Excel_StepDef {
    @Then("verify module is displayed in data at {string}")
    public void verify_module_is_displayed_in_data_at(String path) {


        HomePage homePage = new HomePage();
        //String path="/Users/Cybertek/IdeaProjects/NYTimes/src/test/resources/Data/NYTimes.xlsx";
        ExcelUtil excelUtil = new ExcelUtil(path, "Modules");
        // int rowcount=excelUtil.rowCount();
        // excelUtil.setCellData("Music", 6,1);
        //System.out.println(excelUtil.getDataList());

        for (WebElement each : homePage.modules) {
            for (String each1: excelUtil.getRowNames()) {
                System.out.println(each1);
                Assert.assertTrue(homePage.modules.contains(each1));


            }


        }
    }
}