package usings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accountservices
{
	WebDriver driver;
 	By opennewaccounttype  = By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a");
	By accountsoverview   = By.xpath("//*[@id='leftPanel']/ul/li[2]/a");
	By transferfunds = By.xpath("//*[@id='leftPanel']/ul/li[3]/a");
	By billpay = By.xpath("//*[@id='leftPanel']/ul/li[4]/a");
	By findtransactions  = By.xpath("//*[@id='leftPanel']/ul/li[5]/a");
	By  updatecontactinfo= By.xpath("//*[@id='leftPanel']/ul/li[6]/a");
	By requestloan = By.xpath("//*[@id='leftPanel']/ul/li[7]/a");
	By logout = By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a");

	public Accountservices (WebDriver driver)
	{
		this.driver=driver;
	} 
	public void onat(){
		driver.findElement(opennewaccounttype).click();
	}
	public void aov(){
		driver.findElement(accountsoverview).click();
	}
	public void tf(){
		driver.findElement(transferfunds).click();
	}
	public void bp(){
		driver.findElement(billpay).click();
	}
	public void ft(){
		driver.findElement(findtransactions).click();
	}
    public void ucinfo(){
    	driver.findElement(updatecontactinfo).click();
    }
    public void rl(){
    	driver.findElement(requestloan).click();
    }
    public void lout(){
    	driver.findElement(logout).click();
    }

}
