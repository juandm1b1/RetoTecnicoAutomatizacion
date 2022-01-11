# Author: Juan David Martínez Botero
@stories
Feature: uTest Registration
  A user want to Sign up to uTest
  @scenario1
  Scenario Outline: Sign up to uTest
    Given than Juan wants to sign up to the uTest site
    When  he fills out the signup form
      | strFirstName | strLastName | strEmail | strMonthOfBirth | strDayOfBirth | strYearOfBirth | strLanguages | strCity | strCodPostal | strMobileDevice | strModel | strOS |strPassword | strConfirmPassword |
      |<strFirstName>|<strLastName>|<strEmail>|<strMonthOfBirth>|<strDayOfBirth>|<strYearOfBirth>|<strLanguages>|<strCity>|<strCodPostal>|<strMobileDevice>|<strModel>|<strOS>|<strPassword>|<strConfirmPassword>|
    Then he has registered on the website and receives a message Welcome to the world's largest community of freelance software testers!
#      | strMessage                                                              |
#      | Welcome to the world's largest community of freelance software testers! |

    Examples:
      | strFirstName | strLastName | strEmail            | strMonthOfBirth | strDayOfBirth   | strYearOfBirth |strLanguages      | strCity                     | strCodPostal |strMobileDevice |strModel |strOS      |  strPassword   | strConfirmPassword |
      | Juan David   | Botero      | soundga340@yahoo.es | number:1        | 12              | 1999           |Albanian,Spanish  |Col Bello Antioquia, Colombia| 051050       |Samsung         |Reality  |BREW       | Martinez1985++ | Martinez1985++     |
      | Wilson       | Medina      | abcd999@yahoo.es     | number:7        | 12              | 1999           |Bulgarian,Armenian| Medellin                    | 051050       |Alcatel          |One Touch Evolve    |Android 4.1| Martinez1985++ | Martinez1985++     |

