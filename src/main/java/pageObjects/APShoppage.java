package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class APShoppage {

	WebDriver driver;
	
	public APShoppage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By home=By.xpath("//*[text()='Home']");
	
	public WebElement home()
	{
		return driver.findElement(home);
	}
}
