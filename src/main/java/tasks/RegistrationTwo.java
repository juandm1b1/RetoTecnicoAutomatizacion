package tasks;

import model.UTestRegData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;
import userinterface.RegistrationOnePage;
import userinterface.RegistrationTwoPage;

import java.util.List;

public class RegistrationTwo implements Task {

    private List<UTestRegData> uTestRegData;


    public RegistrationTwo(List<UTestRegData> uTestRegData) {
        this.uTestRegData = uTestRegData;
    }

    public static RegistrationTwo signUpTwo(List<UTestRegData> uTestRegData) {
        return Tasks.instrumented(RegistrationTwo.class,uTestRegData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestRegData.get(0).getStrCity()).into(RegistrationTwoPage.SELECT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(RegistrationTwoPage.SELECT_CITY),
                Hit.the(Keys.ENTER).into(RegistrationTwoPage.SELECT_CITY),

                Enter.theValue(uTestRegData.get(0).getStrCodPostal()).into(RegistrationTwoPage.INPUT_POSTAL_COD),

                Wait.until(WebElementQuestion.the(RegistrationTwoPage.NEXT_DEVICES_BUTTON), WebElementStateMatchers.isEnabled())
                        .forNoLongerThan(30).seconds(),

                Click.on(RegistrationTwoPage.NEXT_DEVICES_BUTTON)
        );
    }
}
