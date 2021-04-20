package Emptestcases;



import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Base.Baseclass;

public class Userprofile extends Baseclass {

	@Test(priority=2)
	public void changePassword() throws InterruptedException
	{
		
		click("Userprofile_Xpath");
		click("Changepwd_linkText");
		type("Oldpwd_Xpath","Oldpwd_Value");
		type("Newpwd_Xpath","Newpwd_Value");
		type("Confirmpwd_Xpath","Confirmpwd_Value");
		click("Changepwdbtn_Xpath");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
	}
	@Test(priority=1)
	public void cancelButton() throws InterruptedException
	{
		doLogin();
		click("Userprofile_Xpath");
		click("Changepwd_linkText");
		type("Oldpwd_Xpath","Oldpwd_Value");
		type("Newpwd_Xpath","Newpwd_Value");
		type("Confirmpwd_Xpath","Confirmpwd_Value");
		click("Cancelbtn_Xpath");
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void logOff() throws InterruptedException
	{
		click("Userprofile_Xpath");
		click("Logoff_linkText");
		Thread.sleep(3000);
	}
	
}
