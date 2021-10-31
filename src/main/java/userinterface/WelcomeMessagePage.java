package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomeMessagePage extends PageObject {

    public static final Target WELCOME_MESSAGE = Target.the("The user sees a welcome message")
            .located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freelance software testers!\")]"));
}
