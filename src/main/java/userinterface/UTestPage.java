package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class UTestPage extends PageObject {
    public static final Target JOIN_TODAY_BUTTON = Target.the("Button that shows us the signup form")
            .located(By.xpath("//a[@href='/signup/personal' and @class='unauthenticated-nav-bar__sign-up']"));
}
