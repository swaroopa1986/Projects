package writings;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import usings.Homepage;
import usings.Register;



public class Register1 
{
	
	@Test(enabled=false)
	public void R() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		Thread.sleep(6000);
		Homepage h = new Homepage(driver);
		Thread.sleep(3000);
		h.reg();
		Thread.sleep(4000);
		
		Register r = new Register(driver);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		r.fn();
		r.ln();
		r.add();
		r.ci();
		r.st();
		r.zip();
		r.phn();
		r.sn();
		r.usr();
		r.pass();
		r.con();
		r.reg();
		String e = driver.findElement(By.xpath("//*[@id='rightPanel']/h1")).getText();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		if(e.equalsIgnoreCase("Welcome rao")){
			System.out.println(e);
			System.out.println("test pass");
		}
		else
			System.out.println("test fail");
	}
			

}

