package testNG_Project;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class titleTest {
	
	@Test
	public void titleTestNew()
	{
		SoftAssert softassert = new SoftAssert();
		 	String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		 	String expectedTest = "Search";
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.ebay.com/");
	        String actualTitle = driver.getTitle();
	        
	        softassert.assertEquals(actualTitle, expectedtitle);
	       
	       String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
	       softassert.assertEquals(actualtext, expectedTest,"Second Test");
	       driver.close();
	}

}
