Feature: Search Bag

Scenario: Search bag from Amazon

Given User is on amazon home page
When User search for "Bag" and click search button
And User	takes note of the price of the top result
And User	clicks on the top result
Then User verifies default number of items is 1
Then User	verifies that price is the same as the one from step 4
Then User	verifies message "Added to Cart" is visible





