package com.crm.DemoMaven;

import org.testng.annotations.Test;

public class CreateOrganisationTest {

	@Test(groups = "regressionTest")
	public void orgWithMandatoryField() {
		System.out.println("Here organisation is created with mandatory fields");
	}
	@Test(groups = "regressionTest")
	public void orgWithContact() {
		System.out.println("Here organisation is created with contact");
	}
	@Test(groups = "smokeTest")
	public void orgWithProduct() {
		System.out.println("Here organisation is created with product");
	}
}
