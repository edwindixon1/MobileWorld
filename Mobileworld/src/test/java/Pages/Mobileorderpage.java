package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Mobileorderpage {
	
	WebDriver driver;
	
	By Order=By.linkText("Order");
	
	By Fname=By.xpath("(//input[@id='inputFirstName'])[1]");
	By Lname=By.xpath("(//input[@id='inputFirstName'])[2]");
	By email=By.id("inputEmail");
	By passw=By.id("inputPassword");
	By Male=By.id("flexRadioDefault1");
	By Female=By.id("flexRadioDefault2");
	By mobile=By.xpath("//input[@placeholder='00000000000']");
	By addr1=By.xpath("//input[@id=' address1']");
	By addr2=By.xpath("//input[@id='address2']");
	By city=By.xpath("//input[@id='inputCity']");
	By state=By.xpath("//select[@id='inputState']");
	
	By zip=By.xpath("//input[@id='inputZip']");
	By sam=By.xpath("//label[.='Samsung']");
	By apple=By.xpath("//label[.='Apple']");
	
	By leno=By.xpath("//label[.='Lenovo']");
	
	By model=By.xpath("//option[@id='apple'][2]");
	By number=By.xpath("//input[@placeholder='no of mobiles']");
	By yesno=By.xpath("//select[@id='bought']");
	
	
	By check1=By.xpath("(//input[@id='gridCheck1'])[1]");
	By check2=By.xpath("(//input[@id='gridCheck1'])[2]");
	By ordernow=By.xpath("//button[@class='btn btn-primary']");
	
	public Mobileorderpage(WebDriver driver) {
		
		this.driver=driver;        
		
	}
	
	public void orderset1(String Firstname,String Lastname,String mail,String pass) 
	{
	
	driver.findElement(Order).click();
	
	    Set<String>win=driver.getWindowHandles();
		Iterator<String>it=win.iterator(); 
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		driver.findElement(Fname).sendKeys(Firstname);
		driver.findElement(Lname).sendKeys(Lastname);
	driver.findElement(email).sendKeys(mail);
	driver.findElement(passw).sendKeys(pass);
	}
	
	public void orderset2(String mob,String address1,String address2,String cit,String pin)
	{
	driver.findElement(Male).click();
	//driver.findElement(Female).click();
	driver.findElement(mobile).sendKeys(mob);
	driver.findElement(addr1).sendKeys(address1);
	driver.findElement(addr2).sendKeys(address2);
	driver.findElement(city).sendKeys(cit);
	WebElement web=driver.findElement(state);
	Select dropdown=new Select(web);
	dropdown.selectByVisibleText("Karnataka");
	driver.findElement(zip).sendKeys(pin);
	}
	
	public void orderset3(String no)
	{
		
	driver.findElement(apple).click();
	driver.findElement(sam).click();
	//driver.findElement(leno).click();
	
	driver.findElement(model).click();
	driver.findElement(number).sendKeys(no);
	WebElement web2=driver.findElement(yesno);
	Select dropdown2=new Select(web2);
	dropdown2.selectByVisibleText("No");
	driver.findElement(check1).click();
	driver.findElement(check2).click();
	driver.findElement(ordernow).click();
	
	}
	

}
