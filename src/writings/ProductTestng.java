package writings;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ProductTestng {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	
	@Test(priority = 1)
	public  void trypara() {
		
		driver.get("https://www.parasoft.com/try");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement>lt = driver.findElements(By.tagName("a"));
		System.out.println("no of links : " + lt.size());
		for(WebElement e : lt) {
			System.out.println(e.getText());
		}
		driver.close();
		}
	
	@Test(priority = 2)
	public void customerportal() {
		
		driver.get("https://www.parasoft.com/products");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"block-headerlinks\"]/ul/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String u = "https://parasoft.force.com/customerportal/login?startURL=%2Fcustomerportal%2FCommunitiesMainPage";
		String e = driver.getCurrentUrl();
		assertEquals(e,u);
		System.out.println(e);
		driver.close();
		}
	
	@Test(priority = 3)
	public void forum() throws InterruptedException {
		
		try {
		driver.get("https://forums.parasoft.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String expected = "Welcome to the Forums";
		String actual =  driver.findElement(By.xpath("//*[@id=\"vanilla_categories_index\"]/main/section/h1/center")).getText();
		assertEquals(actual, expected);
		System.out.println(actual);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		List<WebElement>lf = driver.findElements(By.tagName("a"));
		System.out.println("No of links : " + lf.size());
		for(WebElement links : lf) {
			System.out.println(links.getText());
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		driver.close();
	}
	
	@Test(priority=4)
	public  void market() throws InterruptedException {
		
		driver.get("https://marketplace.parasoft.com/#query?limit=24&offset=0");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String u = "Marketplace";
		String actual = driver.findElement(By.xpath("//*[@id=\"marketplace_heaader\"]")).getText();
		assertEquals(actual, u);
		System.out.println(actual);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		List<WebElement>lm = driver.findElements(By.xpath("a"));
		System.out.println("No of links : " +lm.size());
		driver.close();		
	}
	
	@Test(priority=5)
	public void blog() {
		
		driver.get("https://blog.parasoft.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String t =  "Welcome to Parasoft Blog";
		String actual = driver.findElement(By.xpath("//*[@id=\"hs_cos_wrapper_module_15556271508391036_\"]/h1")).getText();
		assertEquals(actual, t);
		System.out.println(actual);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		List<WebElement>lb = driver.findElements(By.tagName("a"));
		System.out.println("No of links : " +lb.size());
		driver.close();
	}

	@Test(priority=6)
	public void  support() {
		
		driver.get("https://www.parasoft.com/support");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String s = "Parasoft Support";
		String actual = driver.findElement(By.xpath("//*[@id=\"block-ps-one-content\"]/div/article/div/div[1]/div/div[2]/h1")).getText();
	    assertEquals(actual, s);
		System.out.println(actual);
		driver.close();
		}
	
	@Test(priority=7)
	public void contact() {
		
		driver.get("https://www.parasoft.com/company/contacts");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String s =  "Contact Us";
		String actual =  driver.findElement(By.xpath("//*[@id=\"block-ps-one-content\"]/div/article/div/div[1]/div/div[2]/div/h1")).getText();
		assertEquals(actual, s);
		System.out.println(actual);
		driver.close();
		}
	
	@Test(priority=8)
	public void lang() {
		
		driver.get("https://parasoft.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String expected ="Automated Software Testing Tools for Creating High Quality Software";
		String actual = driver.findElement(By.xpath("//*[@id=\"block-ps-one-content\"]/div/article/div/div[1]/div/div[1]/h1")).getText();
	    AssertJUnit.assertEquals(actual, expected);
	    System.out.println(actual);
	    driver.close();
	    }
	
	@Test(priority=9)
	public void search() {
		
		driver.get("https://parasoft.com/search");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String expected = "Search";
		String actual =  driver.findElement(By.xpath("//*[@id=\"block-search\"]/div/div[1]/div[1]/div/div/h1")).getText();
		AssertJUnit.assertEquals(actual, expected);
		System.out.println(actual);
		driver.close();
	}
	
	
	
}
