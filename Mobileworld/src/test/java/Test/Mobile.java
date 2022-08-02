package Test;

import java.util.Iterator;
import java.util.Set;

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
			//driver.findElement(By.xpath("//label[.='Female']/following-sibling::input")).click();//Female
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
       
       @Test
       public void signin()
       {

   		driver.findElement(By.xpath("//button[.='SIGN IN']")).click();
   		driver.findElement(By.id("username")).sendKeys("edwindixon1@gmail.com");
   		driver.findElement(By.id("password")).sendKeys("Edwin@!123");
   		driver.findElement(By.xpath("//a[.='Log In']")).click();
    	
       }
       
       
       @Test
       public void contactus()
       {
     	  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
          driver.findElement(By.linkText("Contact Us")).click();
          Set<String> web=driver.getWindowHandles();
          Iterator<String> it=web.iterator();
          String parent_id=it.next();
          String child_id=it.next();
          driver.switchTo().window(child_id);
          driver.findElement(By.xpath("//input[@type='text']")).sendKeys("EdwinDixon");
          driver.findElement(By.xpath("//input[@type='email']")).sendKeys("edwindixon1@gmail.com");
          driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9847147279");
          driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Hello Mobileworld");
          driver.findElement(By.xpath("//input[@value='Send']")).click();
          driver.close();
	
       }
       

}

	
