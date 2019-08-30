package usings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Requestloan
{
	WebDriver driver;
	By loanamount = By.xpath("//*[@id='amount']");
	By downpayment = By.xpath("//*[@id='downPayment']");
	By fromaccount = By.xpath("//*[@id='fromAccountId']");
    By applyloan   =By.xpath("//*[@id='rightPanel']/div/div/form/table/tbody/tr[4]/td[2]/input");
      
    public Requestloan (WebDriver driver)
    {
    	this.driver=driver;
    }
    public void lam()
    {
		  driver.findElement(loanamount).sendKeys("1900");
    }
    public void dpay()
    {
		  driver.findElement(downpayment).sendKeys("1200");
    }
    public void facc()
    {
		  driver.findElement(fromaccount).sendKeys("18660");
    }
    public void ap()
    {
		  driver.findElement(applyloan).click();

    }

}