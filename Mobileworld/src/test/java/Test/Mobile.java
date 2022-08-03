package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Mobile extends Generic {

	

       

	@Test(priority=1)
		public void SignUp() 
		{  
			driver.findElement(By.xpath("//button[.='SIGN IN']")).click();
			driver.findElement(By.xpath("//a[.='Sign up']")).click();
			driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("Edwin");//First Name
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Dixon");//Last Name
			driver.findElement(By.xpath("//input[@type='Email']")).sendKeys("edwindixon1@gmail.com");//Email
			driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("Edwin@!123");//password
			driver.findElement(By.xpath("//input[@type='date']")).sendKeys("14-06-1997");//DOB
			driver.findElement(By.xpath("(//input[@name='gender'])[1]")).click();//Male
			//driver.findElement(By.xpath("(//input[@name='gender'])[2]")).click();//Female
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
       
       @Test(priority = 2, dataProvider="getdata")
       public void signin(String email,String password)
       {

   		driver.findElement(By.xpath("//button[.='SIGN IN']")).click();
   		driver.findElement(By.id("username")).sendKeys(email);
   		driver.findElement(By.id("password")).sendKeys(password);
   		driver.findElement(By.xpath("//a[.='Log In']")).click();
    	
       }
       
       @DataProvider
       public Object[][] getdata()
   	 {
                Object[][] data=new Object[4][2];
                data[0][0]="edwindixon1@gmail.com";
                data[0][1]="Edwin@!123";
   	        	data[1][0]="edwindixon1@gmail.com";
   	        	data[1][1]="Ed";
                data[2][0]="edwin@ghml";
   	        	data[2][1]="Edwin@!123";
   	        	data[3][0]="edwin@sdf";
   	        	data[3][1]="edjj";
                
                return data;	
   	}
       
       
       @Test(priority=5)
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
       
       @Test(priority=4)
       public void Order()
   	{
    	driver.findElement(By.linkText("Order")).click();
    	
   	    Set<String>win=driver.getWindowHandles();
   		Iterator<String>it=win.iterator(); 
   		String parentId=it.next();
   		String childId=it.next();
   		driver.switchTo().window(childId);
   		driver.findElement(By.xpath("(//input[@id='inputFirstName'])[1]")).sendKeys("Edwin");//First Name
   		driver.findElement(By.xpath("(//input[@id='inputFirstName'])[2]")).sendKeys("Dixon");//Last Name
		driver.findElement(By.id("inputEmail")).sendKeys("edwindixon1@gmail.com");//Email
		driver.findElement(By.id("inputPassword")).sendKeys("edwin@123");//password
		driver.findElement(By.id("flexRadioDefault1")).click();//Male
		//driver.findElement(By.id("flexRadioDefault2")).click();//Female
		driver.findElement(By.xpath("//input[@placeholder='00000000000']")).sendKeys("9847147279");//MOB
		driver.findElement(By.xpath("//input[@id=' address1']")).sendKeys("kattumath house");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("mannampetta");
		driver.findElement(By.xpath("//input[@id='inputCity']")).sendKeys("thrissur");
		WebElement web=driver.findElement(By.xpath("//select[@id='inputState']"));
		Select dropdown=new Select(web);
		dropdown.selectByVisibleText("Karnataka");
		driver.findElement(By.xpath("//input[@id='inputZip']")).sendKeys("680302");
		//driver.findElement(By.xpath("//label[.='Samsung']")).click();
		driver.findElement(By.xpath("//label[.='Apple']")).click();
		//driver.findElement(By.xpath("//label[.='Samsung']")).click();
		//driver.findElement(By.xpath("//label[.='Lenovo']")).click();
		WebElement web1=driver.findElement(By.xpath("//select[@class='multi_select']"));
		Select dropdown1=new Select(web1);
		driver.findElement(By.xpath("//option[@id='apple'][2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='no of mobiles']")).sendKeys("1");
		WebElement web2=driver.findElement(By.xpath("//select[@id='bought']"));
		Select dropdown2=new Select(web2);
		dropdown2.selectByVisibleText("Yes");
		driver.findElement(By.xpath("//input[@id='time']")).sendKeys("2");
		//dropdown2.selectByVisibleText("No");
		driver.findElement(By.xpath("(//input[@id='gridCheck1'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='gridCheck1'])[2]")).click();
		driver.findElement(By.xpath("//button[contains(.,'Ord')]")).click();//Register  
		
	
	
   		
   		
   	}
       
       @Test(priority=3)
       public void allmobiles()
       {
    	   driver.findElement(By.linkText("All Mobiles")).click();
    	   String exp="All Mobile Details";
    	   String mob = driver.findElement(By.xpath("//b[.='All Mobile Details']")).getText();  //Titleverification
    	   Assert.assertEquals(exp,mob);
    	   driver.findElement(By.id("myInput")).sendKeys("lenovo k13");
    	   driver.findElement(By.xpath("(//a[.=' Order'])[2]")).click();
    	   
    	   
    	   
       }
       

}

	
