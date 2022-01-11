package tasks;

import model.UTestRegData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.RegistrationFourPage;

import java.util.List;

public class RegistrationFour implements Task {

    private List<UTestRegData> uTestRegData;

    public RegistrationFour(List<UTestRegData> uTestRegData) {
        this.uTestRegData = uTestRegData;
    }

    public static RegistrationFour signUpFour(List<UTestRegData> uTestRegData) {
        return Tasks.instrumented(RegistrationFour.class,uTestRegData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTestRegData.get(0).getStrPassword()).into(RegistrationFourPage.INPUT_PASSWORD),
                Enter.theValue(uTestRegData.get(0).getStrConfirmPassword()).into(RegistrationFourPage.INPUT_CONFIRM_PASSWORD),
                Click.on(RegistrationFourPage.CHECKBOX_TERMS_OF_USE),
                Click.on(RegistrationFourPage.CHECKBOX_PRIVACY_POLICY),
                Click.on(RegistrationFourPage.COMPLETE_SETUP_BUTTON)
        );
    }
}
