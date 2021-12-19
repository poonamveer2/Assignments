package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenrio1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qatechhub.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[alt='QA Tech Hub']")).click();
		String tittle=driver.getTitle();
		System.out.println(tittle);
		
		
		
	}

}
