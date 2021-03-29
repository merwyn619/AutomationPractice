package testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.APLandingpage;
import pageObjects.APShoppage;
import pageObjects.Checkout;
import pageObjects.Javascript;
import pageObjects.Menuitem;
import pageObjects.Ruby;
import pageObjects.html;
import resources.Base;

public class HomePageTest extends Base{

	public WebDriver driver;
	
	@BeforeTest
	public void setup() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test(enabled=false)
	public void checkCouponValue()
	{
		APLandingpage l=new APLandingpage(driver);
		APShoppage s=l.shop();
		s.home().click();
		System.out.println(l.arrivals().size());
		Assert.assertEquals(l.arrivals().size(), 3);
		Javascript j=l.javaScript();
		j.addtoBasket().click();
		System.out.println(j.message().getText());
		Menuitem m=j.viewBasket();
		System.out.println(m.cartItem().getText());
		Checkout c=m.checkout();
		c.showCoupon().click();
		c.couponCode().sendKeys("krishnasakinala");
		c.applyCoupon().click();
		System.out.println(c.errorMsg().getText());
	}
	
	@Test
	public void removeBook()
	{
		APLandingpage l=new APLandingpage(driver);
		APShoppage s=l.shop();
		s.home().click();
		System.out.println(l.arrivals().size());
		Assert.assertEquals(l.arrivals().size(), 3);
		for(int i=0;i<l.arrivals().size();i++)
		{
			l.arrivals().get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.cssSelector("[class*='cart_b']")).click();
			driver.findElement(By.xpath("//*[text()='View Basket']")).click();
			Menuitem m=new Menuitem(driver);
			List<WebElement> items=m.cartItem2();
			for(int j=0;j<items.size();j++)
			{
				System.out.println(items.get(j).getText());
				m.remove().click();
				System.out.println(m.message().getText());
				Assert.assertTrue(true, m.message().getText());
			}
			driver.findElement(By.cssSelector("[alt*='Auto']")).click();
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
