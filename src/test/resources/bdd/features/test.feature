Feature: Test Feature file

  Scenario Outline:  This is testing if "<Input>" and "<Output>" is being detected correctly
    Given "<Input>" to my application
    When "<Input>" is processed
    Then "<Output>" is generated

    Examples:
    | Input                       | Output                |
    | Hello                       | Hi                    |