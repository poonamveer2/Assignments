package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

By accountselect=By.cssSelector("a[href='Use another account']");
By Email=By.cssSelector("div[class='rFrNMe N3Hzgf jjwyfe QBQrY zKHdkd sdJrJc Tyc9J']");
By Next=By.cssSelector("span[class='VfPpkd-vQzf8d']");
	
	public LoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
		this.driver=driver;
		
}

	public WebElement Getuseraccount()
	{
		return driver.findElement(accountselect);
	}
	public WebElement Email() {
		return driver.findElement(Email);
		
	}
	public WebElement Next() {
		return driver.findElement(Next);
	}
}
