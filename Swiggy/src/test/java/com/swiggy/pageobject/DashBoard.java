package com.swiggy.pageobject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DashBoard{
	public static Logger log= LogManager.getLogger(DashBoard.class.getName());
	WebDriver driverDB;
	
	
	public DashBoard(WebDriver driver) {
	this.driverDB = driver;
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement logInButton;
	
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	WebElement signUpButton;
	
	@FindBy(xpath="//span[contains(text(),'Locate Me')]")
	WebElement locateMe;
	
	@FindBy(xpath="//span[contains(text(),'FIND FOOD')]")
	WebElement findFood;
	
	@FindBy(xpath="//div[contains(text(),'Sign up')]")
	WebElement signUp_Tittle;
	
	@FindBy(xpath="//div[contains(text(),'Enter your delivery location')]")
	WebElement body_text;
	
	public void click_login_Button() {
		logInButton.click();
		log.info("click on login button");
		
	}
	
	public void click_singUp_button() {
		signUpButton.click();
		log.info("cliked on signed on button");
	}
	
	public String signUp_tittle() {
		String tittle = signUp_Tittle.getText();
		log.info("tittle is fetched");
		return tittle;
		}
	
	
	public void click_findFood_button() {
		findFood.click();
		log.info("clicked on find food button");
	}
	
	public String bodytext() {
		String text = body_text.getText();
		log.info("tittle is fetched");
		return text;
	}
	
	public void click_locateMe_button() {
		locateMe.click();
		log.info("clicked on locate me button");
	}


}
