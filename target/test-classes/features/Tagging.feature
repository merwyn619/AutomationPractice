Feature: Tags in cucumber

@SanityTest
Scenario: Verify login
Given This is valid login test
When User enters username and password and logs in

@SanityTest @End2End
Scenario: Verify logout
Given This is logout test 

@RegressionTest
Scenario: Verify search
Given This is search test

@RegressionTest @End2End
Scenario: Verify advanced search
Given This is advanced search test

@End2End
Scenario: Verify prepaid recharge
Given This is prepaid recharge test

@End2End
Scenario: Verify postpaid recharge
Given This is postpaid recharge test
