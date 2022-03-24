package com.crm.DemoMaven;

import org.testng.annotations.Test;

public class CreateCampaignTest {

	@Test(groups = "regressionTest")
	public void campaignWithFieldTest() {
		System.out.println("Campaign is created with mandatory field");
	}
	
	@Test(groups = "smokeTest")
	public void campaignWithContactTest() {
		System.out.println("Campaign is created with contact");
		System.out.println("changes done again and again");
		
	
	}
}
