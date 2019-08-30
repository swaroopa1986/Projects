package usings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Transferfunds
{
	WebDriver driver;
	By  amount= By.xpath("//*[@id='amount']");
	By fromaccount=By.xpath("//*[@id='fromAccountId']");
	By toaccount=By.xpath("//*[@id='toAccountId']");
	By transfer=By.xpath("//*[@id='rightPanel']/div/div/form/div[2]/input");

    public Transferfunds (WebDriver driver)
    {
    	this.driver=driver;
    }
    public void am()
    {
		  driver.findElement(amount).sendKeys("613");
    }
    public void facc()
    {
		  driver.findElement(fromaccount).sendKeys("14010");
    }
    public void toacc()
    {
		  driver.findElement(toaccount).sendKeys("14010");
    }
    public void tr()
    {
		  driver.findElement(transfer).click();

    }
    
    

}
