
@End2EndScenario
Feature: Purchase cheapest and costlier products

Scenario Outline: SCN_001 Verify products can be purchased successfully

  Given user is on login page
  When user navigates to product page successfully with valid credentials
  And add cheapest and costier product to basket
  And open basket and checkout products
  And user is able to complete details "<firstname>" "<lastname>" and "<postcode>"
  Then user can finish purchase successfully
  
	Examples:
  	|firstname|lastname|postcode|
  	|Testuser |One     |CV345LD|
  
  