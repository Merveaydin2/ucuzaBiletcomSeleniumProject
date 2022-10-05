package com.ucuzabilet.test;

import com.ucuzabilet.driver.BaseTest;
import com.ucuzabilet.page.HomePage;
import com.ucuzabilet.page.TicketSelectPage;
import org.junit.Before;
import org.junit.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage;
    TicketSelectPage ticketSelectPage;

@Before
public void forStart() {
    homePage=new HomePage();
    ticketSelectPage=new TicketSelectPage();

}

    @Test
    public void homePageControlTest() {

        homePage.homePageControl();
    }

    @Test
    public void whereToFromTest(){

        homePage.whereToFrom();
    }
    /*@Test
    public void datePicker() {
        homePage.datePicker();
    }*/

    @Test
    public void selectPassenger() {
    //homePage.selectPassenger();
    }


    @Test
    public void ucuzaBiletTest(){
        homePage.homePageControl();
        homePage.whereToFrom();
        homePage.datePicker();
        ticketSelectPage.ticketSelectPageControl();
        ticketSelectPage.selectFlight();
        ticketSelectPage.flightDetails();
        ticketSelectPage.contactInformation();
        ticketSelectPage.paymentInformation();

    } }




