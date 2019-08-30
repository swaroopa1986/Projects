package usings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	WebDriver driver;
	By Try = By.xpath("//*[@id=\"block-headerlinks\"]/ul/li[1]/a");
	By CusPortal = By.xpath("//*[@id=\"block-headerlinks\"]/ul/li[2]/a");
	By Forum =By.xpath("//*[@id=\"block-headerlinks\"]/ul/li[3]/a");
	By Market = By.xpath("//*[@id=\"block-headerlinks\"]/ul/li[4]/a");
	By Blog = By.xpath("//*[@id=\"block-headerlinks\"]/ul/li[5]/a");
	By Support = By.xpath("//*[@id=\"block-headerlinks\"]/ulli[6]/a");
	By Contact = By.xpath("//*[@id=\"block-headerlinks\"]/ul/li[7]/a");
	By Lang = By.xpath("//*[@id=block-headerlinks\"]/ul/li[8]/a");
	By Search = By.xpath("//*[@id=\"block-headerlinks\"]/ul/li[9]/a");
	By Products = By.xpath("//*[@id=\"block-ps-one-main-menu\"]/ul/li[1]/a[1]");
	By Solutions = By.xpath("//*[@id=\"block-ps-one-main-menu\"]/ul/li[2]/a[1]");
	By Partners = By.xpath("//*[@id=\"block-ps-one-main-menu\"]/ul/li[3]/a[1]");
	By Company= By.xpath("//*[@id=\"block-ps-one-main-menu\"]/ul/li[4]/a[1]");
	By Resources = By.xpath("//*[@id=\"block-ps-one-main-menu\"]/ul/li[5]/a[1]");
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}
	public void t() {
		driver.findElement(Try).click();
	}
	public void cp() {
		driver.findElement(CusPortal).click();
	}
	public void f() {
		driver.findElement(Forum).click();
	}
	public void m() {
		driver.findElement(Market).click();
	}
	public void b() {
		driver.findElement(Blog).click();
	}
	public void sp() {
		driver.findElement(Support).click();
	}
	public void c() {
		driver.findElement(Contact).click();
	}
	public void lg() {
		driver.findElement(Lang).click();
	}
	public void sch() {
		driver.findElement(Search).click();
	}
	public void pro() {
		driver.findElement(Products).click();
	}
	public void sol() {
		driver.findElement(Solutions).click();
	}
	public void part() {
		driver.findElement(Partners).click();
	}
	public void comp() {
		driver.findElement(Company).click();
	}
	public void res() {
		driver.findElement(Resources).click();
	}

}
