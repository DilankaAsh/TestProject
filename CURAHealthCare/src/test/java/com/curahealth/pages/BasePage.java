package com.curahealth.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickAppointment() {
		this.driver.findElement(By.id("btn-make-appointment")).click();
	}

}
