package Framework;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Baseclass;
import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.PassPage;

public class HomePage extends Baseclass {
	@Test
	public void basePageNavigation(String username ,String password, String Text ) throws IOException
	{
		
		driver= initializeDriver();
		driver.get("https://google.com");
		//we can access the objects and method from landing page by creating object for that class
		LandingPage lp= new LandingPage(driver);//same as driver.findelement bycss
		lp.Login().click();
		LoginPage Login=new LoginPage(driver);
		Login.Getuseraccount().click();
		Login.Email().sendKeys("abc@gmail.com");
		Login.Next().click();
		PassPage pp=new PassPage(driver);
		pp.Enterpass().sendKeys("12345");
		pp.Clickcheckbox().click();
		
		
	}
	
	@DataProvider 
	public void Getdata()
	{// Rows stands how many data types test should run
		//column stands for how many values for each test.
		Object[][] data =new Object[2][3];
		
		data[0][0]="abc@gmail.com";
		data[0][1]=	"12345";
		data[0][2]="Restricted Data";
		
		data[1][0]="pqr@gmail.com";
		data[1][1]=	"12345";
		data[2][2]="unrestricted Data";
		
		
	}
}




