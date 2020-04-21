package com.nytimes.step_definitions;

import com.nytimes.pages.HomePage;
import com.nytimes.utilities.ExcelUtil;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class TryOut {
    public static void main(String[] args) {
        HomePage homePage=new HomePage();
        String path="/Users/Cybertek/IdeaProjects/NYTimes/src/test/resources/Data/NYTimes.xlsx";
        ExcelUtil excelUtil=new ExcelUtil(path, "Modules");
       // int rowcount=excelUtil.rowCount();
       // excelUtil.setCellData("Music", 6,1);
        System.out.println(excelUtil.getDataList());

            for(WebElement each:homePage.modules){
                for(Map<String, String> entry:excelUtil.getDataList()){
                    Assert.assertTrue(entry.containsValue(each.getText()));
                }
            }

    }
}
