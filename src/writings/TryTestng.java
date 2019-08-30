package writings;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import usings.ProductsPage;
import usings.TryPara;



public class TryTestng {
	
	@Test(enabled=true)
	public void trypage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.parasoft.com/products");
		ProductsPage pp = new ProductsPage(driver);
		Thread.sleep(4000);
		pp.t();
		Thread.sleep(6000);
		
		TryPara tp = new TryPara(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		tp.fn();
		tp.ln();
		tp.com();
		tp.t();
		tp.em();
		tp.p();
		tp.cy();
		tp.p1();
		tp.p2();
		tp.p3();
		tp.p4();
		tp.p5();
		tp.ft();
	}
	
	
	

}
