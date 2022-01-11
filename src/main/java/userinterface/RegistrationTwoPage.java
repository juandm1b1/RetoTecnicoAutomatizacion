package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationTwoPage extends PageObject {

    public static final Target SELECT_CITY = Target.the("Where the user selects their location/city")
            .located(By.id("city"));

    public static final Target INPUT_POSTAL_COD = Target.the("Where the user puts their postal code")
            .located(By.id("zip"));

    public static final Target NEXT_DEVICES_BUTTON = Target.the("Button that shows us the next signup form page")
            .located(By.xpath("//a[@aria-label='Next step - select your devices']"));
}
