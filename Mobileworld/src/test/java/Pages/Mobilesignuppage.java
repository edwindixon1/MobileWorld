package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mobilesignuppage {

	WebDriver driver;
	By homesignin=By.xpath("//button[.='SIGN IN']");
	By msignup=By.xpath("//a[.='Sign up']");
	By Fname=By.xpath("//input[@id='myName']");
	By Lname=By.xpath("//input[@placeholder='Last Name']");
	By Semail=By.xpath("//input[@type='Email']");
	By Spassword=By.xpath("//input[@type='Password']");
	By Sdate=By.xpath("//input[@type='date']");
	By Mgender=By.xpath("(//input[@name='gender'])[1]");
	By Fgender=By.xpath("(//input[@name='gender'])[2]");
	By mobile=By.xpath("//input[@type='number']");
	By bio=By.xpath("//textarea[@placeholder='Short Bio']");
	By Ssubmit=By.xpath("//button[@type='submit']");
	

	public Mobilesignuppage(WebDriver driver) {
		
		this.driver=driver;        
		
	}
	public void set1() {
		driver.findElement(homesignin).click();
		driver.findElement(msignup).click();
	}
	
	public void msignupset1(String firstname,String lastname,String email,String password) 
	
	{
		
		driver.findElement(Fname).sendKeys(firstname);
		driver.findElement(Lname).sendKeys(lastname);
		driver.findElement(Semail).sendKeys(email);
		driver.findElement(Spassword).sendKeys(password);
		
	}
	
	public void msignupset2(String date,String mob,String mbio) {
		
		driver.findElement(Sdate).sendKeys(date);
		driver.findElement(Mgender).click();
		driver.findElement(mobile).sendKeys(mob);
		driver.findElement(bio).sendKeys(mbio);
	}
	
	public void set2() {
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();//Register
		driver.switchTo().alert().accept();
		
	}
	
}
