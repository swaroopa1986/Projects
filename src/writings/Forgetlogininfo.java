package writings;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import usings.Forgotlogin;
import usings.Homepage;



public class Forgetlogininfo
{

	 @	Test(enabled=true)
     public void A() throws InterruptedException
     {
	  System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=1FABF317AEC9E2FD17E9AC67916B175B");
		
		
		 Homepage h =new  Homepage (driver);
		Thread.sleep(3000);
		h.forlog();
		Thread.sleep(3000);
		   
		 Forgotlogin f= new  Forgotlogin (driver);
	     f.fn();
	     f.ln();
	     f.add();
	     f.ci();
	     f.st();
	     f.zip();
	     f.sn();
	     f.fmln();
}
}


