package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Baseclass {
	public static WebDriver driver;
    public static Properties OR=new Properties();
    public static Properties Config=new Properties();
    public static WebElement dropdown;
    public static WebDriverWait Wait; 
    
    
    
@BeforeClass
public void setUp() throws IOException
{
	FileInputStream  fis = new FileInputStream("C:\\git\\Workspace\\projects\\Cstech\\src\\test\\resources\\Properties\\Config.Properties");
	
	Config.load(fis);
	

	FileInputStream fis1 = new FileInputStream("C:\\git\\Workspace\\projects\\Cstech\\src\\test\\resources\\Properties\\OR.Properties");
	
	  OR.load(fis1);

if(Config.getProperty("browser").equals("chrome"))
        {
         System.setProperty(Config.getProperty("chromedriverkey"), Config.getProperty("chromedriverpath"));
         driver=new ChromeDriver();
        }
else if(Config.getProperty("browser").equals("gecho"))
{
    System.setProperty(Config.getProperty("gechodriverkey"), Config.getProperty("gechodriverpath"));
    driver=new FirefoxDriver();
    }
driver.get(Config.getProperty("testurl"));
driver.manage().window().maximize();
Wait =new WebDriverWait(driver,10);
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

}
public static void click(String locatorkey)
{
	if(locatorkey.endsWith("_Xpath"))
	{
        driver.findElement(By.xpath(OR.getProperty(locatorkey))).click();
        }
	else if(locatorkey.endsWith("_CSS"))
	{
		driver.findElement(By.cssSelector(OR.getProperty(locatorkey))).click();
	}
	else if(locatorkey.endsWith("_linkText"))
	{
		driver.findElement(By.linkText(OR.getProperty(locatorkey))).click();
	}
}
        
public static void type(String locatorkey,String value )
{
	if(locatorkey.endsWith("_Xpath"))
	{	
		driver.findElement(By.xpath(OR.getProperty(locatorkey))).sendKeys(OR.getProperty(value));
	}
	else if(locatorkey.endsWith("_CSS"))
	{
		driver.findElement(By.cssSelector(OR.getProperty(locatorkey))).sendKeys(OR.getProperty(value));
	}
}
public static void select(String locatorkey,String value)
{
	
			if(locatorkey.endsWith("_Xpath"))
			{
		        dropdown=driver.findElement(By.xpath(OR.getProperty(locatorkey)));
		        }
			else if(locatorkey.endsWith("_CSS"))
			{
				dropdown=driver.findElement(By.cssSelector(OR.getProperty(locatorkey)));
			}
			Select s=new Select(dropdown);
			s.selectByVisibleText((OR.getProperty(value)));
}
public static void doLogin()
{
	type("Username_Xpath","Username_Value");
	type("Password_Xpath","Password_Value");
	click("Loginbtn_Xpath");
}
 

 
@AfterClass
public void tearDown()
{
   // driver.close();
}
        
    }




