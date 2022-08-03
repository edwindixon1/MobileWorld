package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.Mobilecontactus;
import Pages.Mobileloginpage;
import Pages.Mobileorderpage;
import Pages.Mobilesignuppage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mobiletest  {
	
WebDriver driver;
	
	
	@BeforeMethod
	public void open()
	

	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterMethod
public void close()
	

	{
		driver.quit();
	}
	
	
	
	@Test(priority=1)
	public void testsignup() {
		Mobilesignuppage ob1=new Mobilesignuppage(driver);
		ob1.set1();
		ob1.msignupset1("Edwin","Dixon","edwindixon1@gmail.com","Edwin@123");
		ob1.msignupset2("14-06-1997", "9847147279", "Hello Edwin Dixon");
		ob1.set2();
		
	}
	
	
	@Test(priority=2,dataProvider="getdata")
	public void testlogin(String email1,String password1) {
		Mobileloginpage ob=new Mobileloginpage(driver);
		ob.mloginset(email1,password1);
		
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
	
	
	
	@Test(priority=3)
	public void order() {
		Mobileorderpage or=new Mobileorderpage(driver);
		or.orderset1("Edwin","Dixon","edwindixon1@gmail.com","Edwin@123");
		or.orderset2("9847147279","Kattumath house","mannampetta","thrissur","680302");
		or.orderset3("2");
		
	}
	
	@Test(priority=4)
	public void contactus() {
		Mobilecontactus co=new Mobilecontactus(driver);
		co.contactus("EdwinDixon", "edwindixon1@gmail.com", "9847147279", "Hello Mobileworld");
	}
}
