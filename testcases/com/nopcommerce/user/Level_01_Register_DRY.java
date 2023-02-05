package com.nopcommerce.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Level_01_Register_DRY {
		WebDriver driver;
		String projectPath = System.getProperty("user.dir");


		public void beforeClass() {
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
	}

	@Test
	public void TC_01() {
		driver.get("https://demo.nopcommerce.com/");
	}

	@Test
	public void TC_02() {

	}

	@AfterClass
	public void afterClass() {

	}



}
