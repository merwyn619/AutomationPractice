package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class html {

	WebDriver driver;
	
	public html(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By addtoBasket=By.xpath("//*[text()='Add to basket']");
	By viewBasket=By.xpath("//*[text()='View Basket']");
	
	public WebElement addtoBasket()
	{
		return driver.findElement(addtoBasket);
	}
	
	public Menuitem viewBasket()
	{
		driver.findElement(viewBasket).click();
		return new Menuitem(driver);
	}
}
