@Subscription
Feature: Buying subscription

  Scenario: Verify that not be able to purchase subscription
    Then user clicks on susbcribe now button
    And user clicks on Subscribe Now button
    Then user enters valid "ayselbayram83@yahoo.com"

    Then user clicks on Continue
    Then user enters valid "Balikesir1026"
    And user clicks on Login
    And user enters requires information to be subscribed
      | Katie               |
      | George              |
      | 4467 8475 9388 2122 |
      | 02/23               |
      | 345                 |
      | 18104               |

    And user clicks on purchase subsciption
    And verify user sess error message "xxxxx" is displayed


