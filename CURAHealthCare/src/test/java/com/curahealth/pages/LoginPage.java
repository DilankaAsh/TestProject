package com.curahealth.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	//click login button
	public void clickLogin() {
		this.driver.findElement(By.id("btn-login")).click();
	}

	//get the error message
	public String getErrorMessage() {

		return this.driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[1]/p[2]")).getText();

	}

	//set the username
	public void setUsername(String username) {
		
		this.driver.findElement(By.id("txt-username")).sendKeys(username);
	}

	//set password
	public void setPassword(String password) {
		
		this.driver.findElement(By.id("txt-password")).sendKeys(password);
	}

}
