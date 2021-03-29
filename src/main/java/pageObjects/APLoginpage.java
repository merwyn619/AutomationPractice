package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class APLoginpage {

	WebDriver driver;
	
	public APLoginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.cssSelector("#username");
	By password=By.id("password");
	By rememberMe=By.id("rememberme");
	By login=By.name("login");
	By error=By.xpath("//*[@class='woocommerce-error']/li");
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement rememberMe()
	{
		return driver.findElement(rememberMe);
	}
	public WebElement login()
	{
		return driver.findElement(login);
	}
	public WebElement error()
	{
		return driver.findElement(error);
	}
}
