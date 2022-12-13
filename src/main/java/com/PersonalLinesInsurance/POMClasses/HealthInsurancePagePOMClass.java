package com.PersonalLinesInsurance.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthInsurancePagePOMClass 
{
WebDriver driver;

public String VerifyTitle()
{
	String ActualTitle=driver.getTitle();
	return ActualTitle;


}
 public HealthInsurancePagePOMClass(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }

@FindBy(xpath="//i[@class='checkbox']")
List<WebElement>Checkboxs;

public void ClickOnCheckboxs()
{
	for (WebElement i:Checkboxs)
	{
		i.click();
	}
}

	public void clickonSelf()
	{
		Checkboxs.get(0).click();
	}

	@FindBy(xpath="//input[@id='submitButton']")
	WebElement Continue;
	
	public void clickoncontinue()
	{
		Continue.click();
	}
}
