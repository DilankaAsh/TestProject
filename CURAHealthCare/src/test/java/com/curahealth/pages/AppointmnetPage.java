package com.curahealth.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppointmnetPage extends BasePage {

	public AppointmnetPage(WebDriver driver) {
		super(driver);

	}

	// click to select faculty
	public void clickFaculty() {

		this.driver.findElement(By.id("combo_facility")).click();
	}

	// select faculty Hongkong CURA Healthcare Center
	public void selectFaculty() {

		this.driver.findElement(By.xpath("//*[@id=\"combo_facility\"]/option[2]")).click();

	}

	// select Apply for hospital readmission
	public void seletCheckBox() {

		this.driver.findElement(By.className("checkbox-inline")).click();
	}

	// select None
	public void selectProgram() {
		
		this.driver.findElement(By.id("radio_program_none")).click();
	}

	//select date
	public void setDate(String date) {
		
		this.driver.findElement(By.name("visit_date")).sendKeys(date);
		
	}

	//add a comment
	public void addComment(String comment) {

		this.driver.findElement(By.id("txt_comment")).sendKeys(comment);
	}

	//click book appointment
	public void clickBookAppointment() {

		this.driver.findElement(By.id("btn-book-appointment")).click();

	}
}
