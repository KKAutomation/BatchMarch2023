Feature: this feature is to test lms application

  Scenario Outline: login to lms application
    When user open lms system using "<url>"
    And enter "<userid>"
    And enter password "<password>"
    And click submit button
    Then user should see landing page
    Examples:
    |url|userid|password|
    |https://zemusidemo.in|admin|7676password|