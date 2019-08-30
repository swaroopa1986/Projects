package usings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register
{
	WebDriver driver;
	By firstname = By.xpath("//*[@id='customer.firstName']");
	By lastname = By.xpath("//*[@id='customer.lastName']");
	By address = By.xpath("//*[@id='customer.address.street']");
	By city = By.xpath("//*[@id='customer.address.city']");
	By state  = By.xpath("//*[@id='customer.address.state']");
	By zipcode = By.xpath("//*[@id='customer.address.zipCode']");
	By phone   = By.xpath("//*[@id='customer.phoneNumber']");
	By  ssn= By.xpath("//*[@id='customer.ssn']");	
	By username= By.xpath("//*[@id='customer.username']");
	By password= By.xpath("//*[@id='customer.password']");
	By confirm= By.xpath("//*[@id='repeatedPassword']");
	By register = By.xpath("//*[@id='customerForm']/table/tbody/tr[13]/td[2]/input");
	
	
	public Register (WebDriver driver)
	{
		this.driver=driver;
	} 
	public void fn ()
	{
		  driver.findElement(firstname).sendKeys("juno");
	}
	public void ln()
	{
		driver.findElement(lastname).sendKeys("billa");
	}
    public void add()
    {
    	driver.findElement(address).sendKeys("23");
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
    public void phn()
    {
    	driver.findElement(phone).sendKeys("6789012");
    }
    public void sn()
    {
    	driver.findElement(ssn).sendKeys("abcd23");
    }
    public  void usr()
    {
    	driver.findElement(username).sendKeys("rao");
    }
    public void pass ()
    {
    	driver.findElement(password).sendKeys("123456");
    }
    public void con ()
    {
    	driver.findElement(confirm).sendKeys("123456");
    }
    public void reg()
    {
    	driver.findElement(register).click();
    }

}   
