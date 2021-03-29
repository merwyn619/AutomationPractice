package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {

	WebDriver driver;
	
	public Checkout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".showcoupon")
	WebElement showCoupon;
	
	@FindBy(id="coupon_code")
	WebElement couponCode;
	
	@FindBy(css="[value*='Apply']")
	WebElement applyCoupon;
	
	@FindBy(css="[class*='error']")
	WebElement errorMsg;
	
	@FindBy(css="[alt*='Auto']")
	WebElement home;
	
	public WebElement showCoupon()
	{
		return showCoupon;
	}
	
	public WebElement couponCode()
	{
		return couponCode;
	}
	
	public WebElement applyCoupon()
	{
		return applyCoupon;
	}
	
	public WebElement errorMsg()
	{
		return errorMsg;
	}
	
	public WebElement home()
	{
		return home;
	}
}
