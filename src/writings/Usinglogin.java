package writings;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import usings.Homepage;




public class Usinglogin {
      @	Test(enabled=true)
      public void L() throws InterruptedException{
	
		 System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
			
			Homepage h =new Homepage(driver);
			Thread.sleep(3000);
			h.usn();
            h.pass();
			h.log();
			String s = driver.findElement(By.xpath("//*[@id='rightPanel']/div/div/h1")).getText();
			String s1 = "Accounts Overview";
			if(s.equals(s1)){
				System.out.println(s);
				System.out.println("test pass");
			}
			else
                System.out.println("test fail");
			driver.close();
      }

}
