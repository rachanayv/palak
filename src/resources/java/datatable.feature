Feature: demo on datatatable
Scenario: Search a product in the application
Given open the application and and land up in the search page
When type the below products and search for it
|Products|
|headphones|
|Mobile phones|
Then ensure that the product details is displayed
