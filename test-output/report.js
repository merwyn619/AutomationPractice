$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Application Test",
  "description": "",
  "id": "application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario Outline: Positive test validating login"
    },
    {
      "line": 4,
      "value": "#Given Initialize the browser with chrome"
    },
    {
      "line": 5,
      "value": "#And Navigate to \"http://practice.automationtesting.in/\" Site"
    },
    {
      "line": 6,
      "value": "#And Click on My Account link on Home page to land on secure sign in page"
    },
    {
      "line": 7,
      "value": "#When User enters \u003cusername\u003e and \u003cpassword\u003e and logs in"
    },
    {
      "line": 8,
      "value": "#Then Verify that user is successfully logged in"
    },
    {
      "line": 10,
      "value": "#Examples:"
    },
    {
      "line": 11,
      "value": "#|\tusername\t\t|\tpassword\t\t|"
    },
    {
      "line": 12,
      "value": "#|\tmerwyn@abc.com\t|\t123456\t\t\t|"
    },
    {
      "line": 13,
      "value": "#|\tsonu@abc.com\t|\t678905\t\t\t|"
    },
    {
      "line": 15,
      "value": "#Scenario: Home Page with three Arrivals only"
    },
    {
      "line": 16,
      "value": "#Given Initialize the browser with chrome"
    },
    {
      "line": 17,
      "value": "#And Navigate to \"http://practice.automationtesting.in/\" Site"
    },
    {
      "line": 18,
      "value": "#And Click on Shop Menu"
    },
    {
      "line": 19,
      "value": "#When Now click on Home menu button"
    },
    {
      "line": 20,
      "value": "#Then The Home page must contain only three Arrivals"
    },
    {
      "line": 22,
      "value": "#Scenario: Home Page - Images in Arrivals should navigate"
    },
    {
      "line": 23,
      "value": "#Given Initialize the browser with chrome"
    },
    {
      "line": 24,
      "value": "#And Navigate to \"http://practice.automationtesting.in/\" Site"
    },
    {
      "line": 25,
      "value": "#And Click on Shop Menu"
    },
    {
      "line": 26,
      "value": "#And Now click on Home menu button"
    },
    {
      "line": 27,
      "value": "#When The Home page must contain only three Arrivals"
    },
    {
      "line": 28,
      "value": "#And Now click the image in the Arrivals"
    },
    {
      "line": 29,
      "value": "#Then Test whether it is navigating to next page where the user can add that book into his basket."
    },
    {
      "line": 30,
      "value": "#Then Image should be clickable and should navigate to next page where user can add that book to his basket"
    },
    {
      "line": 32,
      "value": "#Scenario: Home Page - Arrivals Images Description"
    },
    {
      "line": 33,
      "value": "#Given Initialize the browser with chrome"
    },
    {
      "line": 34,
      "value": "#And Navigate to \"http://practice.automationtesting.in/\" Site"
    },
    {
      "line": 35,
      "value": "#And Click on Shop Menu"
    },
    {
      "line": 36,
      "value": "#And Now click on Home menu button"
    },
    {
      "line": 37,
      "value": "#When The Home page must contain only three Arrivals"
    },
    {
      "line": 38,
      "value": "#And Now click the image in the Arrivals"
    },
    {
      "line": 39,
      "value": "#And Test whether it is navigating to next page where the user can add that book into his basket."
    },
    {
      "line": 40,
      "value": "#And Image should be clickable and should navigate to next page where user can add that book to his basket"
    },
    {
      "line": 41,
      "value": "#And Click on Description tab for the book you clicked on"
    },
    {
      "line": 42,
      "value": "#Then There should be a description regarding that book the user clicked on"
    },
    {
      "line": 44,
      "value": "#Scenario: Home Page - Arrivals Images Reviews"
    },
    {
      "line": 45,
      "value": "#Given Initialize the browser with chrome"
    },
    {
      "line": 46,
      "value": "#And Navigate to \"http://practice.automationtesting.in/\" Site"
    },
    {
      "line": 47,
      "value": "#And Click on Shop Menu"
    },
    {
      "line": 48,
      "value": "#And Now click on Home menu button"
    },
    {
      "line": 49,
      "value": "#When The Home page must contain only three Arrivals"
    },
    {
      "line": 50,
      "value": "#And Now click the image in the Arrivals"
    },
    {
      "line": 51,
      "value": "#And Test whether it is navigating to next page where the user can add that book into his basket."
    },
    {
      "line": 52,
      "value": "#And Image should be clickable and should navigate to next page where user can add that book to his basket"
    },
    {
      "line": 53,
      "value": "#And Click on Reviews tab for the book you clicked on"
    },
    {
      "line": 54,
      "value": "#Then There should be Reviews regarding that book the user clicked on"
    },
    {
      "line": 56,
      "value": "#Scenario: Home Page - Arrivals Images Add to Basket"
    },
    {
      "line": 57,
      "value": "#Given Initialize the browser with chrome"
    },
    {
      "line": 58,
      "value": "#And Navigate to \"http://practice.automationtesting.in/\" Site"
    },
    {
      "line": 59,
      "value": "#And Click on Shop Menu"
    },
    {
      "line": 60,
      "value": "#And Now click on Home menu button"
    },
    {
      "line": 61,
      "value": "#When The Home page must contain only three Arrivals"
    },
    {
      "line": 62,
      "value": "#And Now click the image in the Arrivals"
    },
    {
      "line": 63,
      "value": "#And Test whether it is navigating to next page where the user can add that book into his basket."
    },
    {
      "line": 64,
      "value": "#And Image should be clickable and should navigate to next page where user can add that book to his basket"
    },
    {
      "line": 65,
      "value": "#And Click on the Add To Basket button which adds that book to your basket"
    },
    {
      "line": 66,
      "value": "#Then User can view that Book in the Menu item with price."
    },
    {
      "line": 67,
      "value": "#And User can add a book by clicking on Add To Basket button which adds that book in to his Basket"
    },
    {
      "line": 69,
      "value": "#Scenario: Home Page - Arrivals Images Add to Basket"
    },
    {
      "line": 70,
      "value": "#Given Initialize the browser with chrome"
    },
    {
      "line": 71,
      "value": "#And Navigate to \"http://practice.automationtesting.in/\" Site"
    },
    {
      "line": 72,
      "value": "#And Click on Shop Menu"
    },
    {
      "line": 73,
      "value": "#And Now click on Home menu button"
    },
    {
      "line": 74,
      "value": "#When The Home page must contain only three Arrivals"
    },
    {
      "line": 75,
      "value": "#And Now click the image in the Arrivals"
    },
    {
      "line": 76,
      "value": "#And Test whether it is navigating to next page where the user can add that book into his basket."
    },
    {
      "line": 77,
      "value": "#And Image should be clickable and should navigate to next page where user can add that book to his basket"
    },
    {
      "line": 78,
      "value": "#And Click on the Add To Basket button which adds that book to your basket"
    },
    {
      "line": 79,
      "value": "#And User can view that Book in the Menu item with price."
    },
    {
      "line": 80,
      "value": "#And Now click on Item link which navigates to proceed to check out page."
    },
    {
      "line": 81,
      "value": "#And User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page"
    },
    {
      "line": 82,
      "value": "#And Enter the Coupon code as ???krishnasakinala??? to get 50rps off on the total."
    },
    {
      "line": 83,
      "value": "#Then User can able to apply coupon by entering ???krishnasakinala??? in the coupon textbox which give 50rps off on the total price"
    },
    {
      "line": 85,
      "value": "#Scenario: Home Page - Arrivals Images Add to Basket Items Coupon value\u003c450"
    },
    {
      "line": 86,
      "value": "#Given Initialize the browser with chrome"
    },
    {
      "line": 87,
      "value": "#And Navigate to \"http://practice.automationtesting.in/\" Site"
    },
    {
      "line": 88,
      "value": "#And Click on Shop Menu"
    },
    {
      "line": 89,
      "value": "#And Now click on Home menu button"
    },
    {
      "line": 90,
      "value": "#When The Home page must contain only three Arrivals"
    },
    {
      "line": 91,
      "value": "#And Now click the image in the Arrivals"
    },
    {
      "line": 92,
      "value": "#And Test whether it is navigating to next page where the user can add that book into his basket."
    },
    {
      "line": 93,
      "value": "#And Image should be clickable and should navigate to next page where user can add that book to his basket"
    },
    {
      "line": 94,
      "value": "#And Click on the Add To Basket button which adds that book to your basket"
    },
    {
      "line": 95,
      "value": "#And User can view that Book in the Menu item with price."
    },
    {
      "line": 96,
      "value": "#And Now click on Item link which navigates to proceed to check out page."
    },
    {
      "line": 97,
      "value": "#And User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page"
    },
    {
      "line": 98,
      "value": "#And Enter the Coupon code as ???krishnasakinala??? to get 50rps off on the total."
    },
    {
      "line": 99,
      "value": "#Then User can not able to apply coupon by entering ???krishnasakinala??? in the coupon textbox which give 50rps off on the total price because the coupon is applicable for the book price \u003e 450 rps"
    }
  ],
  "line": 101,
  "name": "Home-Arrivals-Add to Basket-Items-Remove book",
  "description": "",
  "id": "application-test;home-arrivals-add-to-basket-items-remove-book",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 102,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 103,
  "name": "Navigate to \"http://practice.automationtesting.in/\" Site",
  "keyword": "And "
});
formatter.step({
  "line": 104,
  "name": "Click on Shop Menu",
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "Now click on Home menu button",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "The Home page must contain only three Arrivals",
  "keyword": "When "
});
formatter.step({
  "line": 107,
  "name": "Now click the image in the Arrivals",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "Test whether it is navigating to next page where the user can add that book into his basket.",
  "keyword": "And "
});
formatter.step({
  "line": 109,
  "name": "Image should be clickable and should navigate to next page where user can add that book to his basket",
  "keyword": "And "
});
formatter.step({
  "line": 110,
  "name": "Click on the Add To Basket button which adds that book to your basket",
  "keyword": "And "
});
formatter.step({
  "line": 111,
  "name": "User can view that Book in the Menu item with price.",
  "keyword": "And "
});
formatter.step({
  "line": 112,
  "name": "Now click on Item link which navigates to proceed to check out page.",
  "keyword": "And "
});
formatter.step({
  "line": 113,
  "name": "Now click on Remove this icon in Check out page which removes that book from the grid.",
  "keyword": "And "
});
formatter.step({
  "line": 114,
  "name": "User has the feasibility to remove the book at the time of check out also",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.initialize_the_browser_with_chrome()"
});
formatter.result({
  "duration": 2676544417,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://practice.automationtesting.in/",
      "offset": 13
    }
  ],
  "location": "stepDefinition.navigate_to_Site(String)"
});
formatter.result({
  "duration": 15283310061,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.click_on_Shop_Menu()"
});
formatter.result({
  "duration": 6312648378,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.now_click_on_Home_menu_button()"
});
formatter.result({
  "duration": 13183382714,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.the_Home_page_must_contain_only_three_Arrivals()"
});
formatter.result({
  "duration": 70006185,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.now_click_the_image_in_the_Arrivals()"
});
formatter.result({
  "duration": 131262,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.test_whether_it_is_navigating_to_next_page_where_the_user_can_add_that_book_into_his_basket()"
});
formatter.result({
  "duration": 119918,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.image_should_be_clickable_and_should_navigate_to_next_page_where_user_can_add_that_book_to_his_basket()"
});
formatter.result({
  "duration": 125860,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.click_on_the_Add_To_Basket_button_which_adds_that_book_to_your_basket()"
});
formatter.result({
  "duration": 115597,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_can_view_that_Book_in_the_Menu_item_with_price()"
});
formatter.result({
  "duration": 48615,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.now_click_on_Item_link_which_navigates_to_proceed_to_check_out_page()"
});
formatter.result({
  "duration": 56178,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.now_click_on_Remove_this_icon_in_Check_out_page_which_removes_that_book_from_the_grid()"
});
formatter.result({
  "duration": 56177,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_has_the_feasibility_to_remove_the_book_at_the_time_of_check_out_also()"
});
formatter.result({
  "duration": 8976108768,
  "status": "passed"
});
});