package Assignment;


	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.MutableCapabilities;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.opera.OperaDriver;
	import org.openqa.selenium.support.ui.Select;

	public class copyAssignment {

		public static void main(String[] args) throws InterruptedException {

			// declaration and instantiation of objects/variables
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromeDriver.exe");
			WebDriver driver=new ChromeDriver();

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromeDriver.exe");
			driver = new ChromeDriver(options);
			
	        driver.get("https://www.myntra.com/");
	        
	        // Maximize the browser window.
	     		driver.manage().window().maximize();
	        //Choose any section like men or women from menu bar.
			driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a")).click();
			
			//driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/div/div/div/li[1]/ul/li[2]/a")).click();
			// choose any item you want to purchase.
			driver.findElement(By.xpath("(//img[contains(@class,'image-image undefined image-hand')])[3]")).click();
			
			//Click on sort by and choose What’s new.
			driver.findElement(By.className("sort-sortBy")).click();
			//WebElement el =driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[1]/section/div[1]/div[1]/div/div/div"));
					//Select select =new Select(el);
					//select.selectByValue("new");
			
			//applay fileter
			driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[3]/ul/li[2]/label")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[4]/ul/li[1]/label")).click();

			/* List <WebElement> AllCheckboxes =  driver.findElements(By.xpath("//*[@id=\"checkbox-example\"]/fieldset"));
		        
		        
		        int size = AllCheckboxes.size();
		       
		        System.out.println(size);
		       */
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[5]/ul/li[1]/label")).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[5]/ul/li[1]/label")).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[6]/ul/li[2]/label")).click();
	 
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[7]/ul/li[2]/label")).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[5]/ul/li[1]/label")).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[2]/a/div[1]/div")).click();
			
			//add bag
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"sizeButtonsContainer\"]/div[2]/div[2]/div[1]/button")).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/main/div[2]/div[2]/div[3]/div/div[1]")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/main/div[2]/div[2]/div[3]/div/a")).click();

			//move to whish list
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"appContent\"]/div/div/div/div/div[1]/div[3]/div[3]/div[2]/button")).click();
	     		
	     		
			
			
		
		
	}


}
