package com.ucuzabilet.page;

import com.ucuzabilet.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class e2e {
    Methods methods;


    public e2e() {
        methods = new Methods();
    }



        public void senaryoTest() {
            methods.waitBySecond(2);
            Assert.assertTrue(methods.isElementVisible(By.id("ub-ets-logo")));
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
            methods.click(By.xpath("(//a[@class='ui-state-default'])[2]"));
            //methods.randomPicker(By.xpath("//a[@class='ui-state-default']"));
            methods.waitBySecond(2);
            methods.click(By.id("searchFormSubmit"));
            methods.waitBySecond(2);
            Assert.assertTrue(methods.isElementVisible(By.id("monthCalendarGraphContent")));
            methods.waitBySecond(2);
            methods.randomPicker(By.cssSelector(".btn-select-flight.web-button-select"));
            Assert.assertTrue(methods.isElementVisible(By.id("checkout")));
            methods.scrollWithAction(By.id("contactMail"));
            methods.jsClick(By.xpath("//label[contains(text(),'Kadın')]"));
            methods.sendKeys(By.id("tb-name-1"),"Merve");
            methods.sendKeys(By.id("tb-surname-1"),"Aydın");
            methods.sendKeys(By.id("tb-birthdate-1"),"18021992");
            methods.sendKeys(By.id("tb-tckn-1"),"23623826192");
            methods.sendKeys(By.id("contactMail"),"merveaydin0212@gmail.com");
            methods.waitBySecond(1);
            methods.sendKeys(By.name("phoneNumber"),"5528652335");
            methods.waitBySecond(1);
            methods.scrollWithAction(By.id("creditCardValidMonth"));
            methods.click(By.name("creditCardOwnerName"));
            methods.sendKeys(By.cssSelector("[name='creditCardOwnerName']"),"Merve AYDIN");
            methods.waitBySecond(1);
            methods.sendKeys(By.id("creditCardNumber"),"9055286523353167");
            methods.waitBySecond(1);
            methods.sendKeys(By.id("creditCardValidMonth"),"10");
            methods.waitBySecond(1);
            methods.sendKeys(By.id("creditCardValidYear"),"2030");
            methods.waitBySecond(1);
            methods.sendKeys(By.name("creditCardCVC"),"253");
            methods.waitBySecond(1);
            methods.scrollWithAction(By.name("agreeementRules"));
            //methods.jsClick(By.id("cb-aggrement-rules"));
            methods.jsClick(By.name("agreeementRules"));
            methods.scrollWithAction(By.id("makeResButton"));
            methods.waitBySecond(4);
            methods.jsClick(By.id("makeResButton"));
            methods.waitBySecond(3);
            // methods.click(By.name("agreeementRules"));
    }

        }








