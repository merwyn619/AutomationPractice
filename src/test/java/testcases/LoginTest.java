package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.APLandingpage;
import pageObjects.APLoginpage;
import resources.Base;

public class LoginTest extends Base{

	public WebDriver driver;
	
	@BeforeTest
	public void setup() throws IOException
	{
		driver=initializeDriver();
	}
	
	@Test(dataProvider="getData")
	public void login(String username, String password)
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		APLandingpage l=new APLandingpage(driver);
		APLoginpage lp=l.myAccount();
		lp.username().sendKeys(username);
		lp.password().sendKeys(password);
		lp.rememberMe().click();
		lp.login().click();
		System.out.println(lp.error().getText());
		Assert.assertEquals(lp.error().getText(), "Error: A user could not be found with this email address.");
		//Assert.assertTrue(true, lp.error().getText());
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object data[][]=new Object[2][2];
		data[0][0]="merwyn@abc.com";
		data[0][1]="123456";
		data[1][0]="john@abc.com";
		data[1][1]="456789";
		return data;
	}
	
	//@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
