package Admintestcases;



import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Base.Baseclass;

public class Skillmanagement extends Baseclass {
	
	
	@Test(priority=6)
	public void searchSkillname() throws InterruptedException
	{
		
		click("Skillmanagement_linkText");
		select("Filter_Xpath","SkillName_Value");
		type("Search_Xpath","SearchSkillName_Value");
		click("Searchbutton_Xpath");
		Thread.sleep(3000);
			
	}
	
	@Test(priority=1)
	public void createNew() throws InterruptedException
	{
		doLogin();
		click("Skillmanagement_linkText");
		click("CreateNew_Xpath");
		Thread.sleep(3000);
      Set<String> windows=driver.getWindowHandles();
		
		for(String window:windows) {
			driver.switchTo().window(window);
		type("Skillname_Xpath","Skill_Value");
		select("Notsetfilter_Xpath","Notset_Value");
		click("Sumbitbtn_Xpath");
		//Alert a = driver.switchTo().alert();
		//a.accept();
		Thread.sleep(3000);
	}
	}

@Test(priority=2)
public void resetButton() throws InterruptedException

{
	click("CreateNew_Xpath");
	Thread.sleep(3000);
    Set<String> windows=driver.getWindowHandles();
		
		for(String window:windows) {
			driver.switchTo().window(window);
			type("Skillname_Xpath","Skill_Value");
			select("Notsetfilter_Xpath","Notset_Value");
			click("Resetbtn_Xpath");
			Thread.sleep(3000);
			click("Closebtn_Xpath");
			Thread.sleep(3000);
}
	
}
@Test(priority=3)
public void cancelButton() throws InterruptedException

{
	click("CreateNew_Xpath");
	Thread.sleep(3000);
    Set<String> windows=driver.getWindowHandles();
		for(String window:windows) {
			driver.switchTo().window(window);
			click("Cancelbtn1_Xpath");
			Thread.sleep(3000);

}
}
@Test(priority=4)
public void pageNavigationNext() throws InterruptedException
{
	click("Profiles_Xpath");
	click("AllProfiles_Xpath");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,3500)");
	  Thread.sleep(3000);
	  click("SkillspagenavigationNext_Xpath");
		Thread.sleep(3000);
	  
}
@Test(priority=5)
public void pageNavigationPrevious() throws InterruptedException
{
	click("Skillmanagement_linkText");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,3000)");
	  Thread.sleep(3000);
	  click("PagenavigationPrev_Xpath");
		Thread.sleep(3000);
	  
}
}

