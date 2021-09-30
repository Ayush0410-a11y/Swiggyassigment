package com.swiggy.stepdefination;

import java.io.IOException;

import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.swiggy.pageobject.Homepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageStepDef {
	
	Homepage hpage = new Homepage(Hooks.driver);
	
	@Given("user lauanch the swiggy application {string}")
	public void user_lauanch_the_swiggy_application(String string) throws IOException {
	    System.out.println("----swiggy page loaded");
	    hpage.getUrl();
	    Hooks.extenObj.log(LogStatus.INFO, "Launch the url");
		Hooks.extenObj.log(LogStatus.PASS, "Url launched sucessfully");
	}

	@And("user valiadtes the page tittle")
	public void user_valiadtes_the_page_tittle() {
		String actualtittle =   hpage.pagetittle();
		 System.out.println(actualtittle);
		 String expectedtittle = "Order food online from India's best food delivery service. Order from restaurants near you";
		 
		 Assert.assertEquals(actualtittle, expectedtittle);
		 Hooks.extenObj.log(LogStatus.INFO, "Validate page tittle");
		 Hooks.extenObj.log(LogStatus.PASS, "page tittle validated sucessfully");
	}

//	@When("user click on locateMe button")
//	public void user_click_on_locate_me_button() {
//		String actualtittle =   hpage.pagetittle();
//		 System.out.println(actualtittle);
//		 String expectedtittle = "Order food online from India's best food delivery service. Order from restaurants near you";
//		 
//		 Assert.assertEquals(actualtittle, expectedtittle);
//	}

	@When("user clicks on sigin button")
	public void user_clicks_on_sigin_button() {
		hpage.signInButon();
		 Hooks.extenObj.log(LogStatus.INFO, "clicked on signin button");
		 Hooks.extenObj.log(LogStatus.PASS, "Sucessfully clicked on signin button");
	}

	@Then("login page should be displayed")
	public void login_page_should_be_displayed() {
	    String actualtittle=hpage.loginTittle();
	    String expectedtittle ="Login";
	    Assert.assertEquals(actualtittle, expectedtittle);
	    Hooks.extenObj.log(LogStatus.INFO, "Validate login page tittle");
		 Hooks.extenObj.log(LogStatus.PASS, "login page tittle validated sucessfully");

	}

	@Then("user enters the phone number")
	public void user_enters_the_phone_number() throws Throwable {
		hpage.phoneNumber_reg();
		Hooks.extenObj.log(LogStatus.INFO, "Enter phone number");
		Hooks.extenObj.log(LogStatus.PASS, "phone number entred sucessfully");
	}
	
	@Then("user enters the unregister phone number")
	public void user_enters_the_unregister_phone_number() throws Throwable {
		hpage.phoneNumber_unreg();
		Hooks.extenObj.log(LogStatus.INFO, "Enter phone number");
		Hooks.extenObj.log(LogStatus.PASS, "phone number entred sucessfully");
	}

	@Then("user click on loginbutton")
	public void user_click_on_loginbutton() {
		hpage.loginButton();
		 Hooks.extenObj.log(LogStatus.INFO, "clicked on login button");
		 Hooks.extenObj.log(LogStatus.PASS, "Sucessfully clicked on login button");
	}

	@Then("enter otp page will open")
	public void enter_otp_page_will_open() throws Throwable {
		String actualTitle= hpage.enterOPTmessage();
		   String expectedTitle="Enter OTP";
		   Assert.assertEquals(actualTitle, expectedTitle);
		   Thread.sleep(1000);
		   Hooks.extenObj.log(LogStatus.INFO, "Validate OTP page");
		   Hooks.extenObj.log(LogStatus.PASS, "OTP page validated sucessfully");
		}
	}

