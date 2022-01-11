package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationOnePage extends PageObject {

    public static final Target INPUT_FIRSTNAME = Target.the("Where the user writes their first name")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("Where the user writes their last name")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Where the user writes their email")
            .located(By.id("email"));

    public static final Target INPUT_BIRTH_MONTH = Target.the("Where the user selects their birth month")
            .located(By.id("birthMonth"));

    public static final Target INPUT_BIRTH_DAY = Target.the("Where the user writes their birth day")
            .located(By.id("birthDay"));

    public static final Target INPUT_BIRTH_YEAR = Target.the("Where the user writes their birth year")
            .located(By.id("birthYear"));

    public static final Target LANGUAGES_DIV = Target.the("Lenguages div")
            .located(By.id("languages"));

    public static Target languageOption(String language){
        return Target.the("Specific language option").locatedBy("//ul/li[@id='ui-select-choices-0']/div/span/div[contains(text(),'"+ language +"')]");
    }

    public static final Target NEXT_LOCATION_BUTTON = Target.the("Button that shows us the next signup form page")
            .located(By.xpath("//a[@aria-label='Next step - define your location']"));
}