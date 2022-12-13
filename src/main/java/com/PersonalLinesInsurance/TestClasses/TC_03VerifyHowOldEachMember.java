package com.PersonalLinesInsurance.TestClasses;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.PersonalLinesInsurance.POMClasses.HealthInsurancePagePOMClass;
import com.PersonalLinesInsurance.POMClasses.HomePagePOMClass;
import com.PersonalLinesInsurance.POMClasses.HowOldEachMemberPOMClass;

public class TC_03VerifyHowOldEachMember extends TestBaseClass
{
	Select s;
@Test	
public void verifyAgeFunctionality()
{
	
	 HomePagePOMClass x=new HomePagePOMClass(driver);
	  x.clickOnHealthInsurance();
		HealthInsurancePagePOMClass P=new HealthInsurancePagePOMClass(driver); 
	    P.ClickOnCheckboxs();
	    P.clickonSelf();
	    P.clickoncontinue();
	    
	HowOldEachMemberPOMClass y=new HowOldEachMemberPOMClass(driver, s);
	y.clickonyourAge();
	
}
}
