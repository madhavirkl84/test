package pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadMoreFunctionality {
	WebDriver driver;
	By homeNav = By.xpath("//a[normalize-space()='Home']");
	By readMore = By.xpath("//a[normalize-space()='Read more']");
	By outOfStock = By.xpath("//p[@class='stock out-of-stock']");
	
	public ReadMoreFunctionality(WebDriver driver) {
		
		this.driver= driver;
	}
	
	public WebElement getHome() {
		return driver.findElement(homeNav);
	
	}
	
	public WebElement getReadMore() {
		return driver.findElement(readMore);
	
	}
	public WebElement getOutOfStock() {
		return driver.findElement(outOfStock);
	
	}
	public void checkOutofStock() {
		
		getHome().click();
		getReadMore().click();
		assertTrue(getOutOfStock().getText().contains("Out of stock"));
	}
	public void productOutofStock() {
		assertTrue(getOutOfStock().getText().contains("Out of stock"));
		}

}
