package com.ucuzabilet.page;

import com.ucuzabilet.driver.BaseTest;
import com.ucuzabilet.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.ucuzabilet.driver.BaseTest.driver;

public class TicketSelectPage {
    public WebDriver driver;
    Methods methods;

    public TicketSelectPage() {methods = new Methods();
    }

    public void ticketSelectPageControl(){
        methods.waitBySecond(2);
        Assert.assertTrue(methods.isElementVisible(By.id("monthCalendarGraphContent")));
    }
    public void selectFlight() {
        methods.waitBySecond(2);
        methods.randomPicker(By.cssSelector(".btn-select-flight.web-button-select"));

    }

    public void flightDetails(){
        Assert.assertTrue(methods.isElementVisible(By.id("checkout")));
        methods.scrollWithAction(By.id("contactMail"));
        methods.jsClick(By.xpath("//label[contains(text(),'Kadın')]"));
        methods.sendKeys(By.id("tb-name-1"),"Merve");
        methods.sendKeys(By.id("tb-surname-1"),"Aydın");
        methods.sendKeys(By.id("tb-birthdate-1"),"25101995");
        methods.sendKeys(By.id("tb-tckn-1"),"12312432511");}

    public void contactInformation(){
        methods.sendKeys(By.id("contactMail"),"merveaydin0212@gmail.com");
        methods.waitBySecond(1);
        methods.sendKeys(By.name("phoneNumber"),"5528652335");
        methods.waitBySecond(1);

    }

    public void paymentInformation(){
        methods.scrollWithAction(By.id("creditCardValidMonth"));
        methods.click(By.name("creditCardOwnerName"));
        methods.sendKeys(By.cssSelector("[name='creditCardOwnerName']"),"Merve AYDIN");
        methods.waitBySecond(1);
        methods.sendKeys(By.id("creditCardNumber"),"9055286523353167");
        methods.waitBySecond(1);
        methods.sendKeys(By.id("creditCardValidMonth"),"10");
        methods.waitBySecond(1);
        methods.sendKeys(By.id("creditCardValidYear"),"30");
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
    } }







