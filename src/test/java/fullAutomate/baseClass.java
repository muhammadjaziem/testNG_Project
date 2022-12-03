package fullAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class baseClass {
	
	public static WebDriver driver;
	@BeforeSuite
	public void launchApplication(String browser)
	{
		
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		
		
	}
	
	@AfterSuite
	public void closingBrowser()
	{
		driver.close();
	}

}
