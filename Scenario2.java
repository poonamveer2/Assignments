package Assignment;

import java.sql.Driver;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scenario2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window,scrollBy(0,500)");
		
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.cssSelector("h4[class=\"title d-i fz-s fw-xl s-label\"]")));
		System.out.println(driver.findElement(By.cssSelector("h4[class=\"title d-i fz-s fw-xl s-label\"]")).getText());
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement minidriver= driver.findElement(By.cssSelector("ul[class=\"d-ib w-100p ov-h\"]"));
		System.out.println(minidriver.findElements(By.tagName("a")).size());
		System.out.println(minidriver.findElement(By.cssSelector("li[class=\"icon-find\"]")).getText());
for (int i=0;i<minidriver.findElements(By.tagName("a")).size();i++)
		
{
			String ClickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			minidriver.findElements(By.tagName("a")).get(i).sendKeys(ClickonlinkTab);
}
	//String Parent=
     Set<String> abc= driver.getWindowHandles();
    java.util.Iterator<String> it=abc.iterator();    
      while(it.hasNext())
      {
    	  driver.switchTo().window(it.next());
      }
      
      driver.navigate().to("https://in.search.yahoo.com/?fr2=inr");
      JavascriptExecutor js1 = (JavascriptExecutor) driver;  
		js1.executeScript("window,scrollBy(0,500)");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("li[class=\"icon-find\"]")).click();
		
		
		
		
		//*[@id="web"]/ol/li[3]/div/table/tbody/tr[1]/td[2]
		

		System.out.println(driver.findElement(By.xpath("//*[@id='web']/ol/li[3]/div/table/tbody/tr[1]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='web']/ol/li[3]/div/table/tbody/tr[1]/td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='web']/ol/li[3]/div/table/tbody/tr[1]/td[4]")).getText());
 //List<WebElement> list= driver.findElements(By.xpath("//td/div/spam/a[1][2][3][4]"));
 
  		
 
 
	}
}