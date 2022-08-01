package Test;

// import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Generic {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void open()
	

	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		 // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
public void close()
	

	{
		driver.quit();
	}
	
}


