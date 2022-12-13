package com.PersonalLinesInsurance.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClass
{
WebDriver driver;

@FindBy(xpath="(//i[@class='icon-bg homeIconsBg health-insurance'])[2]")
		WebElement HealthInsurance;

public void clickOnHealthInsurance()
{
	HealthInsurance.click();
}

public HomePagePOMClass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
	
}
