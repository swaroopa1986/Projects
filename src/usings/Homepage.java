package usings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage
{

	WebDriver driver;
	By solutions = By.xpath("//*[@id='headerPanel']/ul[1]/li[1]");
	By aboutus = By.xpath("//*[@id='headerPanel']/ul[1]/li[2]/a");
	By services = By.xpath("//*[@id='headerPanel']/ul[1]/li[3]/a");
	By products = By.xpath("//*[@id='headerPanel']/ul[1]/li[4]/a");
	By locations  = By.xpath("//*[@id='headerPanel']/ul[1]/li[5]/a");
	By adminpage = By.xpath("//*[@id='headerPanel']/ul[1]/li[6]/a");
	By username = By.xpath("//*[@id='loginPanel']/form/div[1]/input");
	By password= By.xpath("//*[@id='loginPanel']/form/div[2]/input");	
	By login= By.xpath("//*[@id='loginPanel']/form/div[3]/input");
	By forgetlogininfo= By.xpath("//*[@id='loginPanel']/p[1]/a");
	By register = By.xpath("//*[@id='loginPanel']/p[2]/a");
	By home =By.xpath("//*[@id='headerPanel']/ul[2]/li[1]/a");
	By about = By.xpath("//*[@id='headerPanel']/ul[2]/li[2]/a");
	By customercare =By.xpath("//*[@id='headerPanel']/ul[2]/li[3]/a");
	
	public Homepage (WebDriver driver)
	{
		this.driver=driver;
	} 
	public void sol ()
	{
		  driver.findElement(solutions).click();
	}
	public void abt()
	{
		driver.findElement(aboutus).click();
	}
    public void serv()
    {
    	driver.findElement(services).click();
    }
    public void adp ()
    {
    	driver.findElement(adminpage).click();
    }
    public void usn ()
    {
    	driver.findElement(username).sendKeys("rao");
    }
    public void pass()
    {
    	driver.findElement(password).sendKeys("123456");
    }
    public void log()
    {
    	driver.findElement(login).click();
    }
    public void forlog()
    {
    	driver.findElement(forgetlogininfo).click();
    }
    public void reg()
    {
    	driver.findElement(register).click();
    }
    public  void hom()
    {
    	driver.findElement(home).click();
    }
    public void ab()
    {
    	driver.findElement(about).click();
    }
    public void cc ( )
    {
    	driver.findElement(customercare).click();
    }
}
