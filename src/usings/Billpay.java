package usings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Billpay 
{
	WebDriver driver;
    By payeename=By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[1]/td[2]/input");
    By address=By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[2]/td[2]/input");
    By  city=By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[3]/td[2]/input");
    By   state=By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[4]/td[2]/input");
    By   zipcode=By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[5]/td[2]/input");
    By   phone=By.name("payee.phoneNumber");
    By   account=By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[8]/td[2]/input");
    By   verifyaccount=  By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[9]/td[2]/input");
    By amount = By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[11]/td[2]/input");
    By   fromaccount = By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[13]/td[2]/select");
    By   sendpayment =By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[14]/td[2]/input");
    
    public Billpay (WebDriver driver)
    {
    	this.driver=driver;
    }
    public void pay()
    {
		  driver.findElement(payeename).sendKeys("raja");
    }
    public void add()
    {
		  driver.findElement(address).sendKeys("adheri");
    }
    public void ct()
    {
		  driver.findElement(city).sendKeys("mumbai");
    }
    public void sta()
    {
		  driver.findElement(state).sendKeys("maharatra");

    }
    public void zip ()
    {
    	driver.findElement(zipcode).sendKeys("3456");
    }
    public void pho()
    {
		  driver.findElement(phone).sendKeys("123456");
    }
    public void acct()
    {
		  driver.findElement(account).sendKeys("18006");
    }
    public void vacct()
    {
		  driver.findElement(verifyaccount).sendKeys("18006");
    }
    public void amt()
    {
		  driver.findElement(amount).sendKeys("18006");

    }
    public void facc()
    {
		  driver.findElement(fromaccount).sendKeys("14010");

    }
    public void spay()
    {
		  driver.findElement(sendpayment).click();

    }
    
}
