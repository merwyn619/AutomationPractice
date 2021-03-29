package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.google.common.base.Verify;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.APLandingpage;
import pageObjects.APLoginpage;
import pageObjects.APShoppage;
import pageObjects.Checkout;
import pageObjects.Javascript;
import pageObjects.Menuitem;
import resources.Base;

public class stepDefinition extends Base{

	APLandingpage l;
	APLoginpage lp;
	APShoppage s;
	
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver=initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
		driver.get(arg1);
		driver.manage().window().maximize();
	}

	@Given("^Click on My Account link on Home page to land on secure sign in page$")
	public void click_on_My_Account_link_on_Home_page_to_land_on_secure_sign_in_page() throws Throwable {
		l=new APLandingpage(driver);
		lp=l.myAccount();
	}

	/*@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
		lp.username().sendKeys(arg1);
		lp.password().sendKeys(arg2);
		lp.rememberMe().click();
		lp.login().click();
		System.out.println(lp.error().getText());
		Assert.assertEquals(lp.error().getText(), "Error: A user could not be found with this email address."); //*[text()='Add to basket']
	}*/
	
	@When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		lp.username().sendKeys(username);
		lp.password().sendKeys(password);
		lp.rememberMe().click();
		lp.login().click();
		System.out.println(lp.error().getText());
		Assert.assertEquals(lp.error().getText(), "Error: A user could not be found with this email address.");
    }
	
	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
	    System.out.println("Logged in");
	}
	
	@Given("^Click on Shop Menu$")
	public void click_on_Shop_Menu() throws Throwable {
		l=new APLandingpage(driver);
		s=l.shop();		
	}

	@When("^Now click on Home menu button$")
	public void now_click_on_Home_menu_button() throws Throwable {
		s.home().click();
	}

	@Then("^The Home page must contain only three Arrivals$")
	public void the_Home_page_must_contain_only_three_Arrivals() throws Throwable {
	    System.out.println(l.arrivals().size());
	    Assert.assertEquals(l.arrivals().size(), 3);
	    //Verify.verify(l.arrivals().size(), Mismatch, 3);
	}
	
	@When("^Now click the image in the Arrivals$")
	public void now_click_the_image_in_the_Arrivals() throws Throwable {
	    System.out.println("Click image");
	}

	@Then("^Test whether it is navigating to next page where the user can add that book into his basket\\.$")
	public void test_whether_it_is_navigating_to_next_page_where_the_user_can_add_that_book_into_his_basket() throws Throwable {
		System.out.println("Success");
	}

	@Then("^Image should be clickable and should navigate to next page where user can add that book to his basket$")
	public void image_should_be_clickable_and_should_navigate_to_next_page_where_user_can_add_that_book_to_his_basket() throws Throwable {
		System.out.println("Done");
	}

	@When("^Click on Description tab for the book you clicked on$")
	public void click_on_Description_tab_for_the_book_you_clicked_on() throws Throwable {
		System.out.println("Click description");
	}

	@Then("^There should be a description regarding that book the user clicked on$")
	public void there_should_be_a_description_regarding_that_book_the_user_clicked_on() throws Throwable {
		System.out.println("description");
	}
	
	@When("^Click on Reviews tab for the book you clicked on$")
	public void click_on_Reviews_tab_for_the_book_you_clicked_on() throws Throwable {
		System.out.println("Click Reviews");
	}

	@Then("^There should be Reviews regarding that book the user clicked on$")
	public void there_should_be_Reviews_regarding_that_book_the_user_clicked_on() throws Throwable {
		for(int i=0;i<l.arrivals().size();i++)
	    {
	    	l.arrivals().get(i).click();
	    	System.out.println(driver.getCurrentUrl());
	    	driver.findElement(By.cssSelector("[class*='cart_b']")).click();
	    	try
	    	{
	    		System.out.println(driver.findElement(By.cssSelector("[class*='message']")).getText());
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println("No error msg");
	    	}
	   
	    	driver.findElement(By.cssSelector("[class*='reviews_t']")).click();
	
	    	try
	    	{
	    		System.out.println(driver.findElement(By.cssSelector("[class*='noreviews']")).getText());
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println("Not found");
	    	}
	    	driver.findElement(By.cssSelector("[alt*='Auto']")).click();
	    	
	    }
		driver.close();
	}
	
	@When("^Click on the Add To Basket button which adds that book to your basket$")
	public void click_on_the_Add_To_Basket_button_which_adds_that_book_to_your_basket() throws Throwable {
	    System.out.println("Add to Basket");
	}

	@Then("^User can view that Book in the Menu item with price\\.$")
	public void user_can_view_that_Book_in_the_Menu_item_with_price() throws Throwable {
		
	}

	@Then("^User can add a book by clicking on Add To Basket button which adds that book in to his Basket$")
	public void user_can_add_a_book_by_clicking_on_Add_To_Basket_button_which_adds_that_book_in_to_his_Basket() throws Throwable {
	    System.out.println("User can do the resp");
	    driver.close();
	}
	
	@When("^Now click on Item link which navigates to proceed to check out page\\.$")
	public void now_click_on_Item_link_which_navigates_to_proceed_to_check_out_page() throws Throwable {
		
	}

	@When("^User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page$")
	public void user_can_click_on_the_Item_link_in_menu_item_after_adding_the_book_in_to_the_basket_which_leads_to_the_check_out_page() throws Throwable {
		
	}

	@When("^Enter the Coupon code as ‘krishnasakinala’ to get (\\d+)rps off on the total\\.$")
	public void enter_the_Coupon_code_as_krishnasakinala_to_get_rps_off_on_the_total(int arg1) throws Throwable {
		
	}		
	@Then("^User can able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give (\\d+)rps off on the total price$")
	public void user_can_able_to_apply_coupon_by_entering_krishnasakinala_in_the_coupon_textbox_which_give_rps_off_on_the_total_price(int arg1) throws Throwable {
		for(int i=0;i<l.arrivals().size();i++)
	    {
	    	l.arrivals().get(i).click();
	    	System.out.println(driver.getCurrentUrl());
	    	driver.findElement(By.cssSelector("[class*='cart_b']")).click();
	    	try
	    	{
	    		System.out.println(driver.findElement(By.cssSelector("[class*='message']")).getText());
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println("No msg");
	    	}
	    	driver.findElement(By.xpath("//*[text()='View Basket']")).click();
	    	List<WebElement> j=driver.findElements(By.cssSelector(".cart_item"));
	    	for(int k=0;k<j.size();k++)
	    	{
	    		String text=j.get(k).getText();
	    		System.out.println(text);
	    	}
	    	driver.findElement(By.cssSelector("[href*='checkout']")).click();
	    	try
			{
				driver.findElement(By.cssSelector(".showcoupon")).click();
				driver.findElement(By.id("coupon_code")).sendKeys("krishnasakinala");
		    	driver.findElement(By.cssSelector("[value='Apply Coupon']")).click();
		    	driver.findElement(By.cssSelector("[class*='message']")).getText();
			}
	    	catch(Exception e)
			{
	    		System.out.println("Coupon already applied");
			}
	    	
	    	System.out.println(driver.findElement(By.cssSelector("[class*='subtotal']")).getText());
	    	System.out.println(driver.findElement(By.cssSelector("[class*='krishna']")).getText());
	    	System.out.println(driver.findElement(By.cssSelector("[class*='tax-rate']")).getText());
	    	System.out.println(driver.findElement(By.cssSelector("[class*='order-total']")).getText());
	    	System.out.println(driver.getCurrentUrl());
	    	driver.findElement(By.cssSelector("[alt*='Auto']")).click();
		}	
	}
	@Then("^User can not able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give (\\d+)rps off on the total price because the coupon is applicable for the book price > (\\d+) rps$")
	public void user_can_not_able_to_apply_coupon_by_entering_krishnasakinala_in_the_coupon_textbox_which_give_rps_off_on_the_total_price_because_the_coupon_is_applicable_for_the_book_price_rps(int arg1, int arg2) throws Throwable {
				
		Javascript js=l.javaScript();
		js.addtoBasket().click();
		System.out.println(js.message().getText());
		Menuitem mi=js.viewBasket();
		System.out.println(mi.cartItem().getText());
		Checkout c=mi.checkout();
		c.showCoupon().click();
		c.couponCode().sendKeys("krishnasakinala");
		c.applyCoupon().click();
		System.out.println(c.errorMsg().getText());
		System.out.println(driver.getCurrentUrl());
		c.home().click();
		driver.close();
	}
	
	@When("^Now click on Remove this icon in Check out page which removes that book from the grid\\.$")
	public void now_click_on_Remove_this_icon_in_Check_out_page_which_removes_that_book_from_the_grid() throws Throwable {
	   
	}

	@Then("^User has the feasibility to remove the book at the time of check out also$")
	public void user_has_the_feasibility_to_remove_the_book_at_the_time_of_check_out_also() throws Throwable {
	    Javascript js=l.javaScript();
	    js.addtoBasket().click();
	    System.out.println(js.message().getText());
	    Menuitem mi=js.viewBasket();
	    System.out.println(mi.cartItem().getText());
	    mi.remove().click();
	    System.out.println(mi.message().getText());
	}

}
