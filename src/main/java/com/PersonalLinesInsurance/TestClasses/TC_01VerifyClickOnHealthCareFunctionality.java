package com.PersonalLinesInsurance.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PersonalLinesInsurance.POMClasses.HealthInsurancePagePOMClass;
import com.PersonalLinesInsurance.POMClasses.HomePagePOMClass;
import com.PersonalLinesInsurance.UtilityClasses.TakeScreenshots;

public class TC_01VerifyClickOnHealthCareFunctionality extends TestBaseClass
{
@Test(priority=1)
public void veifyClickOnHealthInsuranceFunctionality() throws IOException
{
	HomePagePOMClass x=new HomePagePOMClass(driver);
	x.clickOnHealthInsurance();
	TakeScreenshots.ScreenShot(driver);
			
}
@Test(priority=2)
public void verifyHealthInsuranceTitle()
{
	HealthInsurancePagePOMClass y=new HealthInsurancePagePOMClass(driver);
	String ActualTitle=y.VerifyTitle();
	System.out.println(ActualTitle);
	String ExpectedTitle="Insurance - Compare & Buy Insurance Plans – Health, Term, Life, Car";

Assert.assertEquals(ActualTitle, ExpectedTitle);



}
	
}
