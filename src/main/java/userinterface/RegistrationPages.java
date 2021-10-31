package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationPages extends PageObject {

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


    public static final Target SELECT_CITY = Target.the("Where the user selects their ubication/city")
            .located(By.id("city"));

    public static final Target INPUT_POSTAL_COD = Target.the("Where the user puts their postal code")
            .located(By.id("zip"));


    public static final Target NEXT_LOCATION_BUTTON = Target.the("Button that shows us the next signup form page")
            .located(By.xpath("//a[@aria-label='Next step - define your location']"));

    public static final Target NEXT_DEVICES_BUTTON = Target.the("Button that shows us the next signup form page")
            .located(By.xpath("//a[@aria-label='Next step - select your devices']"));

    public static final Target NEXT_LASTSTEP_BUTTON = Target.the("Button that shows us the last signup form page")
            .located(By.xpath("//a[@aria-label='Next - final step']"));

    public static final Target INPUT_PASSWORD = Target.the("Where the user writes their password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Where the user confirms their password")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_TERMS_OF_USE = Target.the("Where the user accepts the uTest Terms of Use")
            .located(By.id("termOfUse"));

    public static final Target CHECKBOX_PRIVACY_POLICY = Target.the("Where the user accepts the uTest Privacy Policy")
            .located(By.id("privacySetting"));

    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Button that completes the setup")
            .located(By.id("laddaBtn"));
}