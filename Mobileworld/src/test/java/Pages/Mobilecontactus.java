package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mobilecontactus {
	
	WebDriver driver;

	By support=By.xpath("(//a[@role='button'])[2]");
    By contact=By.linkText("Contact Us");
    
    By Uname=By.xpath("//input[@type='text']");
    By email=By.xpath("//input[@type='email']");
    By Mobile=By.xpath("//input[@type='tel']");
    By message=By.xpath("//textarea[@name='message']");
    By sentb=By.xpath("//input[@value='Send']");
    
    
public Mobilecontactus(WebDriver driver) {
		
		this.driver=driver;        
		
	}

public void contactus(String name,String mail,String mob,String msg)
{
	driver.findElement(support).click();
    driver.findElement(contact).click();
    Set<String> web=driver.getWindowHandles();
    Iterator<String> it=web.iterator();
    String parent_id=it.next();
    String child_id=it.next();
    driver.switchTo().window(child_id);
    driver.findElement(Uname).sendKeys(name);
    driver.findElement(email).sendKeys(mail);
    driver.findElement(Mobile).sendKeys(mob);
    driver.findElement(message).sendKeys(msg);
    driver.findElement(sentb).click();
    driver.close();

}

}
