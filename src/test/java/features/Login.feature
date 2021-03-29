Feature: Application Test

#Scenario Outline: Positive test validating login
#Given Initialize the browser with chrome
#And Navigate to "http://practice.automationtesting.in/" Site
#And Click on My Account link on Home page to land on secure sign in page
#When User enters <username> and <password> and logs in
#Then Verify that user is successfully logged in

#Examples:
#|	username		|	password		|
#|	merwyn@abc.com	|	123456			|
#|	sonu@abc.com	|	678905			|

#Scenario: Home Page with three Arrivals only
#Given Initialize the browser with chrome
#And Navigate to "http://practice.automationtesting.in/" Site
#And Click on Shop Menu
#When Now click on Home menu button
#Then The Home page must contain only three Arrivals

#Scenario: Home Page - Images in Arrivals should navigate
#Given Initialize the browser with chrome
#And Navigate to "http://practice.automationtesting.in/" Site
#And Click on Shop Menu
#And Now click on Home menu button
#When The Home page must contain only three Arrivals
#And Now click the image in the Arrivals
#Then Test whether it is navigating to next page where the user can add that book into his basket.
#Then Image should be clickable and should navigate to next page where user can add that book to his basket

#Scenario: Home Page - Arrivals Images Description
#Given Initialize the browser with chrome
#And Navigate to "http://practice.automationtesting.in/" Site
#And Click on Shop Menu
#And Now click on Home menu button
#When The Home page must contain only three Arrivals
#And Now click the image in the Arrivals
#And Test whether it is navigating to next page where the user can add that book into his basket.
#And Image should be clickable and should navigate to next page where user can add that book to his basket
#And Click on Description tab for the book you clicked on
#Then There should be a description regarding that book the user clicked on

#Scenario: Home Page - Arrivals Images Reviews
#Given Initialize the browser with chrome
#And Navigate to "http://practice.automationtesting.in/" Site
#And Click on Shop Menu
#And Now click on Home menu button
#When The Home page must contain only three Arrivals
#And Now click the image in the Arrivals
#And Test whether it is navigating to next page where the user can add that book into his basket.
#And Image should be clickable and should navigate to next page where user can add that book to his basket
#And Click on Reviews tab for the book you clicked on
#Then There should be Reviews regarding that book the user clicked on

#Scenario: Home Page - Arrivals Images Add to Basket
#Given Initialize the browser with chrome
#And Navigate to "http://practice.automationtesting.in/" Site
#And Click on Shop Menu
#And Now click on Home menu button
#When The Home page must contain only three Arrivals
#And Now click the image in the Arrivals
#And Test whether it is navigating to next page where the user can add that book into his basket.
#And Image should be clickable and should navigate to next page where user can add that book to his basket
#And Click on the Add To Basket button which adds that book to your basket
#Then User can view that Book in the Menu item with price.
#And User can add a book by clicking on Add To Basket button which adds that book in to his Basket

#Scenario: Home Page - Arrivals Images Add to Basket
#Given Initialize the browser with chrome
#And Navigate to "http://practice.automationtesting.in/" Site
#And Click on Shop Menu
#And Now click on Home menu button
#When The Home page must contain only three Arrivals
#And Now click the image in the Arrivals
#And Test whether it is navigating to next page where the user can add that book into his basket.
#And Image should be clickable and should navigate to next page where user can add that book to his basket
#And Click on the Add To Basket button which adds that book to your basket
#And User can view that Book in the Menu item with price.
#And Now click on Item link which navigates to proceed to check out page.
#And User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page
#And Enter the Coupon code as ‘krishnasakinala’ to get 50rps off on the total.
#Then User can able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give 50rps off on the total price

#Scenario: Home Page - Arrivals Images Add to Basket Items Coupon value<450
#Given Initialize the browser with chrome
#And Navigate to "http://practice.automationtesting.in/" Site
#And Click on Shop Menu
#And Now click on Home menu button
#When The Home page must contain only three Arrivals
#And Now click the image in the Arrivals
#And Test whether it is navigating to next page where the user can add that book into his basket.
#And Image should be clickable and should navigate to next page where user can add that book to his basket
#And Click on the Add To Basket button which adds that book to your basket
#And User can view that Book in the Menu item with price.
#And Now click on Item link which navigates to proceed to check out page.
#And User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page
#And Enter the Coupon code as ‘krishnasakinala’ to get 50rps off on the total.
#Then User can not able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give 50rps off on the total price because the coupon is applicable for the book price > 450 rps

Scenario: Home-Arrivals-Add to Basket-Items-Remove book
Given Initialize the browser with chrome
And Navigate to "http://practice.automationtesting.in/" Site
And Click on Shop Menu
And Now click on Home menu button
When The Home page must contain only three Arrivals
And Now click the image in the Arrivals
And Test whether it is navigating to next page where the user can add that book into his basket.
And Image should be clickable and should navigate to next page where user can add that book to his basket
And Click on the Add To Basket button which adds that book to your basket
And User can view that Book in the Menu item with price.
And Now click on Item link which navigates to proceed to check out page.
And Now click on Remove this icon in Check out page which removes that book from the grid.
Then User has the feasibility to remove the book at the time of check out also
