package com.crm.DemoMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Link;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginCMDParameter {

	@Test
	public void login() {
		String browser= System.getProperty("browser");
		String url = System.getProperty("url");
		String username= System.getProperty("username");
		String password= System.getProperty("password");
		
		WebDriver driver= null;
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver= new FirefoxDriver();
		}
		else {
			System.out.println("specify browser");
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		WebElement e=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(e).perform();
		
		driver.findElement(By.linkText("Sign Out")).click();
		driver.quit();
	}
}
