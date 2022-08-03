package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mobileloginpage {
	
	WebDriver driver;
	
	By homelogin=By.xpath("//button[.='SIGN IN']");
	By Mloginemail=By.id("username");
	By Mloginpassword=By.id("password");
	By Mlogin=By.xpath("//a[.='Log In']");

	
	
	public Mobileloginpage(WebDriver driver) {
		this.driver=driver;        
		
	}
		
	
	public void mloginset(String email,String password)
	{
		driver.findElement(homelogin).click();
		driver.findElement(Mloginemail).sendKeys(email);
		driver.findElement(Mloginpassword).sendKeys(password);
		driver.findElement(Mlogin).click();
	}
	
}
