package testNG_Project;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {


	
	@DataProvider(name="create")
	public Object[][] dataSet1(Method m)
	{
		
		Object[][] testdata = null;
		
		if(m.getName().equals("test1"))
		{
			testdata = new Object[][]
		
	
				{
			{
				"standard_user","secret_sauce"
			},
			{
				"locked_out_user","secret_sauce"
			},
			{
				"problem_user","secret_sauce"
			},
			{
				"performance_glitch_user","secret_sauce"
			},
				};
	}
		
		return testdata;
	
}
}