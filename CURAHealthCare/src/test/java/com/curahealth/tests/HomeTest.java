package com.curahealth.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.curahealth.pages.BasePage;

class HomeTest extends BaseTest {

	@Test
	void test() {
		
		BasePage basePage = new BasePage(driver);
		basePage.clickAppointment();
		
		
	}

}
