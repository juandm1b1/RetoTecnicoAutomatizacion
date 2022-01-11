package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationFourPage extends PageObject {

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
