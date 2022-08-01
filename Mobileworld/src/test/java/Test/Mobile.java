package Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Mobile extends Generic {

	

       @Test
		public void SignUp() throws InterruptedException
		{  
			driver.findElement(By.xpath("//button[.='SIGN IN']")).click();
			driver.findElement(By.xpath("//a[.='Sign up']")).click();
			driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("Edwin");//First Name
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Dixon");//Last Name
			driver.findElement(By.xpath("//input[@type='Email']")).sendKeys("edwindixon1@gmail.com");//Email
			driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("Edwin@!123");//password
			driver.findElement(By.xpath("//input[@type='date']")).sendKeys("14-06-1997");//DOB
			driver.findElement(By.xpath("//label[.='Male']/../input[1]")).click();//Male
			driver.findElement(By.xpath("//label[.='Female']/following-sibling::input")).click();//Female
			driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9847147279");//MOB
			driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Hello Edwin Dixon");//BIO
			driver.findElement(By.xpath("//button[@type='submit']")).click();//Register
			driver.switchTo().alert().accept();
			driver.findElement(By.xpath("//button[.='Sign In']")).click();//Sign in
			driver.switchTo().alert().accept();
			driver.findElement(By.id("username")).sendKeys("edwindixon1@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Edwin@!123");
			driver.findElement(By.xpath("//a[.='Log In']")).click();
		}
	
	
       
}

	
