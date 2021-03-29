package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javascript {

	WebDriver driver;
	
	public Javascript(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By addtoBasket=By.xpath("//*[text()='Add to basket']");
	By message=By.cssSelector("[class*='message']");
	By viewBasket=By.xpath("//*[text()='View Basket']");
	
	public WebElement addtoBasket()
	{
		return driver.findElement(addtoBasket);
	}
	
	public WebElement message()
	{
		return driver.findElement(message);
	}
	
	public Menuitem viewBasket()
	{
		driver.findElement(viewBasket).click();
		return new Menuitem(driver);
	}
}
