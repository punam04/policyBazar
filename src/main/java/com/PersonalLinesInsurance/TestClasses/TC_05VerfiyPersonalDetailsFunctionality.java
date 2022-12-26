package com.PersonalLinesInsurance.TestClasses;

import com.PersonalLinesInsurance.POMClasses.HealthInsurancePagePOMClass;
import com.PersonalLinesInsurance.POMClasses.HomePagePOMClass;
import com.PersonalLinesInsurance.POMClasses.HowOldEachMemberPOMClass;
import com.PersonalLinesInsurance.POMClasses.PersonalDetailsPOMClass;
import com.PersonalLinesInsurance.POMClasses.WhereDoYouLivePOMClass;

public class TC_05VerfiyPersonalDetailsFunctionality extends TestBaseClass
{
public void verifyPersonalDetailsFunctionality()
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
	
	WhereDoYouLivePOMClass  p= new WhereDoYouLivePOMClass(driver);
	p.SelectCity();
	
	PersonalDetailsPOMClass V=new PersonalDetailsPOMClass(driver);
		V.SelectGender();
	    V.EnterFullName();
	    V.EnterMobileNumber();
	    V.clickOnContinue();
		
			
}

}
