package com.crm.DemoMaven;

import org.testng.annotations.Test;

public class CreateContactTest {
	
	@Test(groups = "regressionTest")
	public void contactNameTest() {
	System.out.println("Contact name provided ");
    }
	@Test(groups = "smokeTest")
	public void contactWithOrgTest() {
		System.out.println("Contact is with organisation");
	}
	@Test(groups = "smokeTest")
	public void contactWithNumberTest() {
		System.out.println("contact with number is here");
	}
}
