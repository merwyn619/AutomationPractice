package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menuitem {

	WebDriver driver;
	
	public Menuitem(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By cartItem=By.cssSelector(".cart_item");
	By cartItem2=By.cssSelector(".cart_item");
	By remove=By.className("remove");
	By message=By.cssSelector("[class*='message']");
	By checkout=By.cssSelector("[href*='checkout']");
	
	public WebElement cartItem()
	{
		return driver.findElement(cartItem);
	}
	
	public List<WebElement> cartItem2()
	{
		return driver.findElements(cartItem2);
	}
	
	public WebElement remove() 
	{
		return driver.findElement(remove);
	}
	
	public WebElement message() 
	{
		return driver.findElement(message);
	}
	
	public Checkout checkout()
	{
		driver.findElement(checkout).click();
		return new Checkout(driver);
	}
}
