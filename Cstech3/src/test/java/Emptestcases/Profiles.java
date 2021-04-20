package Emptestcases;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Base.Baseclass;

public class Profiles extends Baseclass{
@Test(priority=1)
public void allProfilesPage() throws InterruptedException {
	
		doLogin();
		click("Profiles_Xpath");
		Thread.sleep(3000);
		click("AllProfiles_Xpath");
		Thread.sleep(3000);
	}
	@Test(priority=2)
	public void appliedProfilesPage() throws InterruptedException
	{
		click("Profiles_Xpath");
		Thread.sleep(3000);
		click("Appliedprofiles_Xpath");
		Thread.sleep(3000);
	}
	@Test(priority=3)
	public void pageNavigationNext() throws InterruptedException
	{
		click("Profiles_Xpath");
		click("AllProfiles_Xpath");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,3500)");
		  Thread.sleep(3000);
		  click("PagenavigationNext_Xpath");
			Thread.sleep(3000);
		  
	}
	@Test(priority=4)
	public void pageNavigationPrevious() throws InterruptedException
	{
		click("Profiles_Xpath");
		click("AllProfiles_Xpath");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,3500)");
		  Thread.sleep(3000);
		  click("PagenavigationPrev_Xpath");
			Thread.sleep(3000);
		  
	}
}

