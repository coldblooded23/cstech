package Emptestcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.Baseclass;

public class Myaccount extends Baseclass{
	@Test(priority=1)
	public void postAjob() throws InterruptedException, Exception
	{
		doLogin();
		click("Myaccount_linkText");
		click("Postajob_Xpath");
		Thread.sleep(5000);
		driver.navigate().refresh();
		select("Jobtitle_Xpath","JobTitle_Value");
		type("Location_Xpath","Location_Value");
		Thread.sleep(8000);
		for(int i=0; i<=2;i++){
			  try{
				  new Select(driver.findElement(By.id("locres"))).selectByVisibleText("Hindupur,Andhra Pradesh,india");
			     break;
			  }
			  catch(Exception e){
			     Sysout(e.getMessage());
			  }
			}
		
		click("Jobtype_Xpath");	
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 Thread.sleep(2000);	
         robot.keyPress(KeyEvent.VK_ENTER);
	   	Thread.sleep(3000);
		
		type("Exp_Xpath","Exp_Value");
		type("Postedon_Xpath","Postedon_Value");
		type("Expiredon_Xpath","Expiredon_Value");
		select("Companyname_Xpath","Company_Value");
		select("Noofopenings_Xpath","Noofopenings_Value");
		click("Postjobbtn_Xpath");
	
		Thread.sleep(3000);
		
	}
private void Sysout(String message) {
		// TODO Auto-generated method stub
		
	}
/*@Test(priority=3)
public void postedJobs() throws InterruptedException
{ss
	
	click("Myaccount_linkText");
	click("Postedjobs_Xpath");
	Thread.sleep(3000);
}

@Test(priority=4)
public void searchJobTitle() throws InterruptedException
{
	
	click("Myaccount_linkText");
	click("Managejobs_Xpath");
	select("Filter_Xpath","Jobtitle_value");
	type("Search_Xpath","SearchJobtitle_Value");
	click("Searchbutton_Xpath");
	driver.navigate().back();
	Thread.sleep(3000);
}
@Test(priority=5)
public void searchJobType() throws InterruptedException
{
	
	click("Myaccount_linkText");
	click("Managejobs_Xpath");
	select("Filter_Xpath","Jobtype_Value");
	type("Search_Xpath","SearchJobtype_Value");
	click("Searchbutton_Xpath");
	Thread.sleep(3000);
}
@Test(priority=6)
public void searchLocation() throws InterruptedException
{
	
	click("Myaccount_linkText");
	click("Managejobs_Xpath");
	select("Filter_Xpath","Joblocation_Value");
	type("Search_Xpath","Searchlocation_Value");
	click("Searchbutton_Xpath");
	Thread.sleep(3000);
}
	@Test(priority=1)
public void editContact() throws InterruptedException
{
   doLogin();
	click("Myaccount_linkText");
	click("Myaccount1_Xpath");
	driver.findElement(By.xpath("//input[@id='Contact']")).clear();
	type("Contact_Xpath","Contact_Value");
	click("Savebtn_Xpath");
	Thread.sleep(3000);
	
	
}*/
	
	//public static void clickWhenReady(WebElement locator, int timeOut){
	//	WebDriverWait wait = new WebDriverWait(driver, timeOut);
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	//	element.click();
	}

//}
