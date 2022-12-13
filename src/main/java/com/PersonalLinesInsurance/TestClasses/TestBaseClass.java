package com.PersonalLinesInsurance.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseClass 
{
public WebDriver driver;
@BeforeMethod
public void SetUp()
{
	System.setProperty("webdriver.chrome.driver","./DriverFiles\\chromedriver.exe" );
	driver= (WebDriver) new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.policybazaar.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
}
@AfterMethod
public void TearDown()
{
  //driver.close();
}

}
