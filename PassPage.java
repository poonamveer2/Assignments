package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PassPage {

	public WebDriver driver;


By Password=By.cssSelector("div[id='password']");
By Checkbox=By.cssSelector("input[type='checkbox']");
	
	public PassPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
		this.driver=driver;
		
}

public WebElement Enterpass() {
		return driver.findElement(Password);
	}
public WebElement Clickcheckbox() {
	return driver.findElement(Checkbox);
}

}
