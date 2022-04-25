package com.curahealth.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.curahealth.pages.BasePage;
import com.curahealth.pages.LoginPage;

class LoginTest extends BaseTest {

	@Test
	void test() {
		// Test the login button
		
		//click appointment button
		BasePage basePage = new BasePage(driver);
		basePage.clickAppointment();
		
		//click login button with empty fields
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickLogin();
		
		//check login error message		
		Assertions.assertEquals("Login failed! Please ensure the username and password are valid.",loginPage.getErrorMessage(), "Login failed! Please ensure the username and password are valid.");
		
		
		// pass values to the username and password
		loginPage.setUsername("John Doe");
		loginPage.setPassword("ThisIsNotAPassword");
		
		
		//click login button
		loginPage.clickLogin();
		
	}

}
