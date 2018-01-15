package com.org.Maven.myMavenProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class File1Test {
	
		@Test
		public void login()
	{
		System.out.println("Logging in account");
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
	}
}
