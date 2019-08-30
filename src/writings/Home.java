package writings;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Home 
{
	@Test(priority=1)
	  public void aboutus()
	  {
	  System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/about.htm");
		String s = "ParaSoft Demo Website";
		String actual = driver.findElement(By.xpath("//*[@id='rightPanel']/h1")).getText();
		AssertJUnit.assertEquals(actual, s);
		System.out.println(actual);
		driver.close();
	  }
	@Test(priority=2)
	  public void services()
	  {
	  System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/services.htm");
		String s = "Available Bookstore SOAP services:";
		String actual = driver.findElement(By.xpath("//*[@id='rightPanel']/span[1]")).getText();
		AssertJUnit.assertEquals(actual, s);
		System.out.println(actual);
		driver.close();
	  }
	@Test(priority=3)
	  public void locations ()
	  {
	  System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.parasoft.com/company/contacts");
		String s = "Contact Us";
		String actual = driver.findElement(By.xpath("//*[@id='block-ps-one-content']/div/article/div/div[1]/div/div[2]/div/h1")).getText();
		AssertJUnit.assertEquals(actual, s);
		System.out.println(actual);
		driver.close();
	  }
	@Test(priority=4)
	  public void adminpage ()
	  {
	  System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/admin.htm");
		String s = "Administration";
		String actual = driver.findElement(By.xpath("//*[@id='rightPanel']/h1")).getText();
		AssertJUnit.assertEquals(actual, s);
		System.out.println(actual);
		driver.close();
	  }



	
}
