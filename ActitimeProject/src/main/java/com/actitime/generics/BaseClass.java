package com.actitime.generics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\ActitimeProject\\src\\main\\resources\\driver\\chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		Reporter.log("Open browser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("Login",true);
		driver.get("https://demo.actitime.com/login.do");
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout",true);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("Close browser",true);
		driver.close();
	}
	
}
