
Feature: DellHomepage Validation

@home
Scenario: Validate Dell Home page visit

Given User visit DellHome page
When Click product
Then Click laptop
And close the windows