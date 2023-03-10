package com.PersonalLinesInsurance.TestClasses;

import org.testng.annotations.Test;

import com.PersonalLinesInsurance.POMClasses.HealthInsurancePagePOMClass;
import com.PersonalLinesInsurance.POMClasses.HomePagePOMClass;
import com.PersonalLinesInsurance.POMClasses.HowOldEachMemberPOMClass;

public class TC_03VerifyHowOldEachMember extends TestBaseClass
{
	
@Test	
public void verifyAgeFunctionality()
{
	
	 HomePagePOMClass x=new HomePagePOMClass(driver);
	  x.clickOnHealthInsurance();
		HealthInsurancePagePOMClass P=new HealthInsurancePagePOMClass(driver); 
	    P.ClickOnCheckboxs();
	    P.clickonSelf();
	    P.clickoncontinue();
	    
	HowOldEachMemberPOMClass y=new HowOldEachMemberPOMClass(driver);
	y.clickonyourAge();
	y.clickonspouseAge();
	y.clickOnSonAge();
	y.clickOnDaughterAge();
	y.clickOnFatherAge();
	y.clickOnMotherAge();
	y.ClickOnContinue();
	
}
}
