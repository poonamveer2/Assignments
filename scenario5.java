package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.ie.driver", "C:\\Users\\hp\\Downloads\\IEDriverServer_x64_2.48.0"); 
		  WebDriver driver =new InternetExplorerDriver(); 
			
			//WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			// driver.findElement(By.cssSelector("div[class=\"desktop-navLinks\"]"));
			String selectmenu= "WOMEN";
			if(selectmenu== "MEN" )
			{
				driver.findElement(By.cssSelector("a[href=\"/shop/men\"]")).click();
			}
			else 
			{
				driver.findElement(By.cssSelector("a[href=\"/shop/women\"]")).click();
			}
			JavascriptExecutor js = (JavascriptExecutor) driver;  
			js.executeScript("window,scrollBy(0,500)");
			
			//Disable notification
			//
			Thread.sleep(5000);
		        //
	//driver.findElement(By.cssSelector("img[class=\"image-image undefined image-hand\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a")).click()  ;   
			Thread.sleep(3000);
			
		   //WebElement Sortelement = driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[1]/section/div[1]/div[1]"));
			Actions a = new Actions(driver);
			 WebElement abc = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
			a.moveToElement(abc).click().build().perform();
					
			 List<WebElement> allOptions= abc.findElements( By.cssSelector("label[class='sort-label']"));
			 
			 System.out.println(allOptions.size());
			 for(int i = 0; i<=allOptions.size()-1; i++) {
	             
	             
		      if(allOptions.get(i).getText().contains("What's New")) 
		            {
		                 
		                allOptions.get(i).click();
		                break;
		            }
		      }
	}

}
