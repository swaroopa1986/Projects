package usings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Updatecontactinfo
{
	WebDriver driver;
	By firstname = By.xpath("//*[@id='customer.firstName']");
	By lastname = By.xpath("//*[@id='customer.lastName']");
	By address = By.xpath("//*[@id='customer.address.street']");
	By city = By.xpath("//*[@id='customer.address.city']");
	By state  = By.xpath("//*[@id='customer.address.state']");
	By zipcode = By.xpath("//*[@id='customer.address.zipCode']");
	By phone   = By.xpath("//*[@id='customer.phoneNumber']");
	By update = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[8]/td[2]/input");
	
	public Updatecontactinfo (WebDriver driver)
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
    	driver.findElement(zipcode).sendKeys("23456");
    }
    public void phn()
    {
    	driver.findElement(phone).sendKeys("56789012");
    }
    public void up()
    {
    	driver.findElement(update).click();
    }


}
