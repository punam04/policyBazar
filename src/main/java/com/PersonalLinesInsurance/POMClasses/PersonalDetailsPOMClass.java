package com.PersonalLinesInsurance.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPOMClass 
{
WebDriver driver;

@FindBy(xpath="//em[text()='Female']")
WebElement Female;

public void SelectGender()
{
	Female.click();	
}

@FindBy(xpath="//input[@id='fullname']")
WebElement Fullname;

public void EnterFullName()
{
	Fullname.sendKeys("Aarti shah");
}

@FindBy(xpath="//input[@id='pmobile']")
WebElement MobileNumber;

public void EnterMobileNumber()
{
	MobileNumber.sendKeys("9845673023");
}

@FindBy(xpath="//button[@Class='btn btncity arrowhide']")
WebElement Continue;

public void clickOnContinue()
{
	Continue.click();
}
 public PersonalDetailsPOMClass(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
	
}
