package testNG_Project;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void loginToApplication()
	{
		System.out.println("Login to Application");
	}
	
	@AfterTest
	public void logoutFromApplication()
	{
		
		System.out.println("Logout from Application");
		
	}
	
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("DB Connected");
	}
	
	@AfterMethod
	public void disconnectFromDB()
	{
		System.out.println("DB Disconnected");
	}
	@Test(priority=2,description="This is a login test")
	public void bloginTest()
	{
		System.out.println("Login is Successful");
	}
	
	@Test(priority=1,description="This is a logout test")
	public void alogoutTest()
	{
		System.out.println("Logout is successful");
	}

}
