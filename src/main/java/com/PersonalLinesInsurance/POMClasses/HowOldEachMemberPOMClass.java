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
	public Select s;
	
	@FindBy(xpath="//select[contains(@class,'placeholder input_box select_input_box')]")
	List<WebElement> MembersAge;
	

	public void clickonyourAge()
	{
		MembersAge.get(1).click();
		
		s.selectByValue("29");
	}
	
	
	public HowOldEachMemberPOMClass(WebDriver driver)
	{
		this.driver=driver;
		
	PageFactory.initElements(driver, this);
		s=new Select( MembersAge);
	}


}
