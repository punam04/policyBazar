package com.PersonalLinesInsurance.TestClasses;

import org.testng.annotations.Test;

import com.PersonalLinesInsurance.POMClasses.HealthInsurancePagePOMClass;
import com.PersonalLinesInsurance.POMClasses.HomePagePOMClass;

public class TC_02VerifyWhoWouldYouLikeToInsure extends TestBaseClass 
{
	@Test
	public void VerifyHealthInsuredFunctionality()
	{
		
  HomePagePOMClass x=new HomePagePOMClass(driver);
  x.clickOnHealthInsurance();
	HealthInsurancePagePOMClass P=new HealthInsurancePagePOMClass(driver); 
    P.ClickOnCheckboxs();
    P.clickonSelf();
    P.clickoncontinue();
	
	
	}
	}
