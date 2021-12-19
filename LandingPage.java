package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	  
	public WebDriver driver;

	
	
	By gmail=By.cssSelector("a[href='https://mail.google.com/mail/&ogbl']");
	
	
public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver= driver;
	}



public WebElement Login() {
	return driver.findElement(gmail);
	
}

}