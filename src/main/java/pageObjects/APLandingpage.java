package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class APLandingpage {

	WebDriver driver;
	
	public APLandingpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By myAccount=By.cssSelector("[href*='in/my']");
	By shop=By.cssSelector("[href*='/shop']");
	By arrivals=By.cssSelector(".products");
	By ruby=By.cssSelector("[alt*='Ruby']");
	By html=By.cssSelector("[alt*='n HTML']");
	By javaScript=By.cssSelector("[href*='javas']");
	
	public APLoginpage myAccount()
	{
		driver.findElement(myAccount).click();
		return new APLoginpage(driver);
		//return lp;
	}
	
	public APShoppage shop()
	{
		driver.findElement(shop).click();
		return new APShoppage(driver);
	}
	
	public List<WebElement> arrivals()
	{
		return driver.findElements(arrivals);
	}
	
	public Ruby ruby()
	{
		driver.findElement(ruby).click();
		return new Ruby(driver);
	}
	
	public html html()
	{
		driver.findElement(html).click();
		return new html(driver);
	}
	
	public Javascript javaScript()
	{
		driver.findElement(javaScript).click();
		return new Javascript(driver);
	} 
}
