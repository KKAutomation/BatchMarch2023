Feature: Calculate using calculator


  Scenario Outline:  Calculate using calculator example
    When i open calculator in web "https://www.calculatorsoup.com/calculators/math/basic.php"
    And i enter  "<digit1>"
    And   i enter math operator "<opr>"
    And   second input  "<digit2>"
    And   I enter  equal sign
    Then it should display result as "<output>"
    Examples:
      | digit1 | opr   | digit2 | output |
      | 1      | plus  | 2     | 3     |
#      | 9      | Minus | 5      | 4      |
#      | 9      | Multi | 5      | 45     |
