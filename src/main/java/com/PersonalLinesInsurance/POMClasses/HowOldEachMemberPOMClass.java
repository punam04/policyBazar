package com.PersonalLinesInsurance.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HowOldEachMemberPOMClass 
{
	WebDriver driver;
	static Select s;
	static Select t;
	static Select u;
	static Select v;
	static Select w;
	static Select x;
	
	@FindBy(xpath="//select[@id='Self']")
	WebElement yourAge;
	

	public void clickonyourAge()
	{
		yourAge.click();
		
		s.selectByValue("29");
	}
	
	@FindBy(xpath="//select[@id='Spouse']")
	WebElement SpouseAge;
	
	public void clickonspouseAge()
	{
		SpouseAge.click();
		t.selectByValue("28");
	}
	
 @FindBy(xpath="//select[@id='Son']")
 WebElement SonAge;
 
 public void clickOnSonAge()
 {
	 SonAge.click();
	 u.selectByValue("2");
	 
}
 @FindBy(xpath="//select[@id='Daughter']")
 WebElement DaughterAge;
 
 public void clickOnDaughterAge()
 {
	 DaughterAge.click();
	 v.selectByValue("1");
 }
 
 @FindBy(xpath="//select[@id='Father']")
 WebElement FatherAge;
 
 public void clickOnFatherAge()
 {
	 FatherAge.click();
	 w.selectByValue("60");
 }
 @FindBy(xpath="//select[@id='Mother']")
 WebElement MotherAge;
 
 public void clickOnMotherAge()
 {
	 MotherAge.click();
	 x.selectByValue("58");
 }
 
@FindBy(xpath="//input[@id='submitButton']")
WebElement Continue;

public void ClickOnContinue()
{
	Continue.click();
}
 
 public HowOldEachMemberPOMClass(WebDriver driver)
	{
		this.driver=driver;
		
	PageFactory.initElements(driver, this);
		s=new Select( yourAge);
		t=new Select(SpouseAge);
		u=new Select(SonAge);
		v=new Select(DaughterAge);
		w=new Select(FatherAge);
		x=new Select(MotherAge);
	}


}
