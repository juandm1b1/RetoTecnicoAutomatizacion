# Author: Juan David Martínez Botero
@stories
Feature: uTest Registration
  A user want to Sign up to uTest
  @scenario1
  Scenario Outline: Sign up to uTest
    Given than Juan wants to sign up to the uTest site
    When  he fills out the signup form
      | strFirstName  | strLastName    | strEmail    | strMonthOfBirth   | strDayOfBirth   | strYearOfBirth  | strPassword   | strConfirmPassword   |
      | <strFirstName>| <strLastName>  | <strEmail>  | <strMonthOfBirth> | <strDayOfBirth> | <strYearOfBirth>| <strPassword> | <strConfirmPassword> |
    Then he has registered on the website and receives a message
      | strMessage                                                              |
      | Welcome to the world's largest community of freelance software testers! |

    Examples:
      | strFirstName | strLastName | strEmail            | strMonthOfBirth | strDayOfBirth   | strYearOfBirth | strPassword    | strConfirmPassword |
      | Juan David   | Botero      | soundga22@yahoo.es  | number:1        | 12              | 1999           | Martinez1985++ | Martinez1985++     |

