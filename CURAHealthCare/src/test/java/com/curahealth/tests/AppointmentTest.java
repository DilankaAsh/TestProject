package com.curahealth.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.curahealth.pages.AppointmnetPage;
import com.curahealth.pages.BasePage;
import com.curahealth.pages.LoginPage;

class AppointmentTest extends BaseTest {

	@Test
	void test() {
		
		//click appointment
		BasePage basePage = new BasePage(driver);
		basePage.clickAppointment();
		
		//login to the system
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername("John Doe");
		loginPage.setPassword("ThisIsNotAPassword");
		loginPage.clickLogin();
		
		
		//Enter data to the fields
		AppointmnetPage appointmentPage = new AppointmnetPage(driver);
		appointmentPage.clickFaculty();
		appointmentPage.selectFaculty();
		appointmentPage.seletCheckBox();
		appointmentPage.selectProgram();
		appointmentPage.setDate("21/05/2020");
		appointmentPage.addComment("Automation Testing");
		
		
		//click book appointment button
		appointmentPage.clickBookAppointment();
		
	}

}
