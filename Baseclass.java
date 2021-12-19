package Resources;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;







public class Baseclass {
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream ("C:\\Users\\hp\\Eclipse WorkSpace\\Assignment\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if (browserName.equals("Chrome"))
		{
         System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromeDriver.exe");
	       driver= new ChromeDriver();
		driver.get("https://Google.com");
		}
		else if(browserName.equals("Firefox"))
		{
			//driver-=new FirefoxDriver();
			}
		else if(browserName.equals("IE"))
		{
			//System.setProperty("webdriver.ie.driver", "C:\\Users\\hp\\Downloads\\IEDriverServer_x64_2.48.0"); 
			 // WebDriver driver =new WebDiver(); 
				
		}
		
		return driver;
	}

}