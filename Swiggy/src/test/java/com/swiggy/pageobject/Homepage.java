package com.swiggy.pageobject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swiggy.excelutilies.ExcelOperation;


public class Homepage {
	public Homepage(String path) {
		super();
		this.path = path;
	}
	
	
	
	WebDriver driverHp;
	public String path ="C:\\Users\\HELLO\\eclipse-workspace\\Swiggy\\src\\test\\resources\\Excelsheet\\Swiggyexcercise.xlsx";
	
	ExcelOperation excelOpration= new ExcelOperation(path);
	
	public Homepage(WebDriver driver) {
		this.driverHp = driver;
		PageFactory.initElements(driver, this);
		}
	

	public String getUrl() throws IOException {
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\HELLO\\eclipse-workspace\\Swiggy\\src\\main\\resources\\Config.properties");
		properties.load(fis);
		String url = properties.getProperty("url");
		driverHp.get(url);
		return url;
	}
	
	
	
	
	@FindBy(xpath="//span[contains(text(),'Sign In')]")
	WebElement signinButton;
	
	@FindBy(xpath="//input[@id='mobile']")
	WebElement phoneNumber;
	
	@FindBy(xpath ="//div/div[contains(text(),'Login')]")
	WebElement loginTittle;
	
	@FindBy(xpath ="//body/div[@id='overlay-sidebar-root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/a[1]/input[1]")
	WebElement loginButton;
	
	@FindBy(xpath ="//div[contains(text(),'Enter OTP')]")
	WebElement enterOTP;
	
	
	
	public void signInButon() {
		signinButton.click();
		
	}
	
	public void phoneNumber_reg() throws Throwable {
		String phNumber =excelOpration.getCellData("phoneNumber", 1, 0);
		phoneNumber.sendKeys(phNumber);
		Thread.sleep(1000);
	}
	
	public void phoneNumber_unreg() throws Throwable {
		String phNumber =excelOpration.getCellData("phoneNumber", 2, 0);
		phoneNumber.sendKeys(phNumber);
		Thread.sleep(1000);
	}
	
	public String loginTittle() {
		
	String tittle=	loginTittle.getText();
	return tittle;
		
	}
	
	public String enterOPTmessage() {
		
		String tittle=enterOTP.getText();
		return tittle;
			}
	
	public void loginButton() {
		//loginButton.click();
		
		WebElement ele = driverHp.findElement(By.xpath("//body/div[@id='overlay-sidebar-root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/a[1]/input[1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driverHp;
		executor.executeScript("arguments[0].click();", ele);
	}
	
	public String pagetittle() {
		String 	tittle= driverHp.getTitle();
		return tittle;
		}



}
