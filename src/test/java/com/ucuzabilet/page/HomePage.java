package com.ucuzabilet.page;

import com.ucuzabilet.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage {

    Methods methods;

    public HomePage() {
        methods = new Methods();
    }

    public void homePageControl() {
        methods.waitBySecond(2);
        Assert.assertTrue(methods.isElementVisible(By.id("ub-ets-logo")));
    }

    public void whereToFrom() {
        methods.sendKeys(By.id("from_text"), "izm");
        methods.waitBySecond(2);
        methods.click(By.className("ui-menu-item"));
        methods.waitBySecond(2);
        //methods.click(By.cssSelector("input#to_text"));
        methods.waitBySecond(2);
        methods.sendKeys(By.id("to_text"), "ada");
        methods.waitBySecond(2);
        methods.click(By.xpath("//li[@data-value='Adana Şakirpaşa (ADA) - Adana, Türkiye']"));
        methods.waitBySecond(2);
    }



    public void datePicker() {
        methods.click(By.xpath("(//a[@class='ui-state-default'])[2]"));
        //methods.randomPicker(By.xpath("//a[@class='ui-state-default']"));
        methods.waitBySecond(2);
        methods.click(By.id("searchFormSubmit"));
    }

        /*public void selectPassenger() {
           // methods.randomPicker(By.className("col-md-4 col-12 passenger-select search-col px-1"));
            methods.waitBySecond(2);
            methods.click(By.id("searchFormSubmit"));
        }*/




}




