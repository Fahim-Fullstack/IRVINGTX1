
Feature:  Dell product search validation

@findNewProduct 
Scenario Outline: Dell product search validation

Given  user click on home page
When send "<Search>" on searchbar
Then click the search bar
And select one product and click Customized & buy
And select one Inspiron Approved for Personal Laptops( Add one recommended product to the cart)
And click get the deal button
And click proceed to cart button
And Change qty 1 to 2 qty
And click checkout button and close


	Examples:     

| Search   		| 
| laptop      |