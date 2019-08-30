package usings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forgotlogin
{
	WebDriver driver;
	By firstname = By.xpath("//*[@id=\"firstName\"]");
	By lastname = By.xpath("//*[@id=\"lastName\"]");
	By adress = By.xpath("//*[@id=\"address.street\"]");
	By city = By.xpath("//*[@id=\"address.city\"]");
	By state  = By.xpath("//*[@id=\"address.state\"]");
	By zipcode = By.xpath("//*[@id=\"address.zipCode\"]");
	By  ssn= By.xpath("//*[@id=\"ssn\"]");	
	By findmylogininfo = By.xpath("//*[@id=\"lookupForm\"]/table/tbody/tr[8]/td[2]/input");

	public Forgotlogin  (WebDriver driver)
	{
		this.driver=driver;
	} 
	public void fn ()
	{
		  driver.findElement(firstname).sendKeys("aksa");
	}
	public void ln()
	{
		driver.findElement(lastname).sendKeys("billa");
	}
    public void add()
    {
    	driver.findElement(adress).sendKeys("23");
    }
    public void ci ()
    {
    	driver.findElement(city).sendKeys("vsp");
    }
    public void st ()
    {
    	driver.findElement(state).sendKeys("ap");
    }
    public void zip ()
    {
    	driver.findElement(zipcode).sendKeys("3456");
    }
    public void sn()
    {
    	driver.findElement(ssn).sendKeys("abcd23");
    }
    public void fmln()
    {
    	driver.findElement(findmylogininfo).click();
    }



}
