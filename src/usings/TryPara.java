package usings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TryPara {
	WebDriver driver;
	By Firstname = By.name("firstname");
	By Lastname = By.name("lastname");
	By Company  = By.name("company");
	By Title =  By.name("jobtitle");
	By Email = By.name("email");
	By Phone = By.name("phone");
	By Country = By.name("country");
	By Submit = By.xpath("//*[@id=\"hsForm_8a4dfd60-b833-4b50-bc76-8fc9535dfd0d\"]/div[8]/div[2]/input");
	By Para1  = By.xpath("//*[@id=\"block-ps-one-content\"]/div/article/div/div[3]");
	By Para2 = By.xpath("//*[@id=\"block-ps-one-content\"]/div/article/div/div[4]");
	By Para3  = By.xpath("//*[@id=\"block-ps-one-content\"]/div/article/div/div[5]");
	By Para4 = By.xpath("//*[@id=\"block-ps-one-content\"]/div/article/div/div[6]");
	By Para5 = By.xpath("//*[@id=\"block-ps-one-content\"]/div/article/div/div[7]");
	By Footer = By.xpath("//*[@id=\"page\"]/footer");
	
	public TryPara(WebDriver driver) {
		this.driver = driver;
	}
	public void fn() {
		driver.findElement(Firstname).sendKeys("Aruka");
	}
	public void ln() {
		driver.findElement(Lastname).sendKeys("Rapaka");
	}
	public void com() {
		driver.findElement(Company).sendKeys("Accenture");
	}
	public void t() {
		driver.findElement(Title).sendKeys("Tester");
	}
	public void em() {
		driver.findElement(Email).sendKeys("arukarapaka@gmail.com");
	}
	public void p() {
		driver.findElement(Phone).sendKeys("9656768698");
	}
	public void cy() {
		driver.findElement(Country).sendKeys("INDIA");
	}
	public  void  p1() {
		driver.findElement(Para1).getText();
	}
	public void p2() {
		driver.findElement(Para2).getText();
	}
	public void p3() {
		driver.findElement(Para3).getText();
	}
	public void p4() {
		driver.findElement(Para4).getText();
	}
	public void p5() {
		driver.findElement(Para5).getText();
	}
	public void ft() {
		driver.findElement(Footer).getText();
	}
	

}
