package writings;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import usings.Accountservices;
import usings.Billpay;
import usings.Homepage;
import usings.Requestloan;
import usings.Transferfunds;
import usings.Updatecontactinfo;
import usings.opennewaccounts;



public class Usingaccounts
{
	public WebDriver driver;
	@BeforeMethod
	public void setup(){
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	 Homepage h = new Homepage(driver);
	 driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	 h.usn();
	 h.pass();
	 h.log();
	 driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
	  @	Test(enabled=false)
      public void A() throws InterruptedException
      {
	       Accountservices as = new Accountservices(driver);
	       as.onat();
	       driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				opennewaccounts o=new opennewaccounts(driver);
				o.act();
				o.md();
				o.ona();
				String s = "Account Opened!";
				driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				String actual = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")).getText();
				Thread.sleep(3000);
				AssertJUnit.assertEquals(actual, s);
				System.out.println(actual);
				driver.close(); 

   	}
	  
	  @Test(enabled=false)
	  public void accoverview()
	  {
	  
		  Accountservices as = new Accountservices(driver);
	       as.aov();
	       driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		String s = "Accounts Overview";
		String actual = driver.findElement(By.xpath("//*[@id='rightPanel']/div/div/h1")).getText();
		AssertJUnit.assertEquals(actual, s);
		System.out.println(actual);
		driver.close();

	  }
		@Test(enabled=false)
		public void f() throws InterruptedException{
			
			 Accountservices as = new Accountservices(driver);
		       as.tf();
		       driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			Transferfunds T =new Transferfunds(driver);
			T.am();
			T.facc();
			T.toacc();
			T.tr();
			String s ="Transfer Complete!";
			String actual = driver.findElement(By.xpath("//*[@id='rightPanel']/div/div/h1")).getText();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			AssertJUnit.assertEquals(actual, s);
			System.out.println(actual);
			driver.close();


		}
			

		@Test(enabled=false)
		public void P() throws InterruptedException 
		{
			
			 Accountservices as = new Accountservices(driver);
		       as.bp();
			Thread.sleep(6000);
	        Billpay B=new Billpay(driver);
				B.pay();
				B.add();
				B.ct();
				B.sta();
				B.zip();
				B.pho();
				B.acct();
				B.vacct();
				B.amt();
				B.facc();
				B.spay();
				String s="Bill Payment Complete";
				 String actual=driver.findElement(By.xpath("//*[@id=rightPanel]/div/div[2]/h1")).getText();
				 driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				 AssertJUnit.assertEquals(actual,s);
				 System.out.println(actual);
					driver.close();

		}
		
		@Test(enabled=false)
		public void trans()
		{
			
			 Accountservices as = new Accountservices(driver);
		       as.ft();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"accountId\"]")).sendKeys("14232");
			driver.findElement(By.xpath("//*[@id=\"criteria.fromDate\"]")).sendKeys("12/08/2005");
			driver.findElement(By.xpath("//*[@id=\"criteria.toDate\"]")).sendKeys("12/08/2006");
			driver.findElement(By.xpath("//*[@id=\"criteria.amount\"]")).sendKeys("1200");
			driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[9]/button")).click();
			String s="Transaction Results";
			String actual=driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")).getText();
			AssertJUnit.assertEquals(actual,s);
			System.out.println(actual);
			driver.close();

		}
		
		@Test(enabled=false)
		public void contact()
		{
			
			 Accountservices as = new Accountservices(driver);
		       as.ucinfo();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

			 Updatecontactinfo U=new  Updatecontactinfo (driver);
			 U.fn();
			 U.ln();
			 U.add();
			 U.ci();
			 U.st();
			 U.zip();
			 U.phn();
			 U.up();
			 String s="Profile Updated";
			 String actual=driver.findElement(By.xpath("//*[@id='rightPanel']/div/div/h1")).getText();
			 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			 AssertJUnit.assertEquals(actual,s);
			 System.out.println(actual);
				driver.close();



		}
		@Test(enabled=false)
		public void apply()
		{
			
			 Accountservices as = new Accountservices(driver);
		       as.rl();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

			 Requestloan R=new  Requestloan(driver);
			 R.lam();
			 R.dpay();
			 R.facc();
			 R.ap();
			 String s="Loan Request Processed";
			 String actual=driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")).getText();
			 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			 AssertJUnit.assertEquals(actual,s);
			 System.out.println(actual);
				driver.close();
}
		@Test(enabled=false)
		public void out() 
		{
			 Accountservices as = new Accountservices(driver);
		       as.lout();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			String expected = "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC";
			String actual = driver.getCurrentUrl();
			assertEquals(actual,expected);
			 System.out.println(actual);
				driver.close();
			
		}
		
		
}		