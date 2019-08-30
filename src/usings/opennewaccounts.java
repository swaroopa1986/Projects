package usings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class opennewaccounts  
	{	 
	
	WebDriver driver;
	By accounttype = By.xpath("//*[@id=\"type\"]");
	By moneydeposit= By.xpath("//*[@id=\"fromAccountId\"]");
	By opennewaccount=By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input");

	
	public  opennewaccounts (WebDriver driver)
	{
		this.driver=driver;
	} 
	public void act ()
	{
		  driver.findElement(accounttype).sendKeys("savings");
	}
	public void md()
	{
		driver.findElement(moneydeposit).sendKeys("14121");
	}
	public void ona()
	{
		driver.findElement(opennewaccount).click();
	}

	
}

	