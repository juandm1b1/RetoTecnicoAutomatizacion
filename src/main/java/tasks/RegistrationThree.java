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
import userinterface.RegistrationThreePage;
import userinterface.RegistrationTwoPage;

import java.util.List;


public class RegistrationThree implements Task {

    private List<UTestRegData> uTestRegData;

    public RegistrationThree(List<UTestRegData> uTestRegData) {
        this.uTestRegData = uTestRegData;
    }

    public static RegistrationThree signUpThree(List<UTestRegData> uTestRegData) {
        return Tasks.instrumented(RegistrationThree.class,uTestRegData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(RegistrationThreePage.MOBILE_DEVICE_INPUT),
                Click.on(RegistrationThreePage.mobileDeviceInput(uTestRegData.get(0).getStrMobileDevice())),

                Click.on(RegistrationThreePage.MODEL_INPUT),
                Click.on(RegistrationThreePage.modelInput(uTestRegData.get(0).getStrModel())),

                Click.on(RegistrationThreePage.OS_INPUT),
                Wait.until(WebElementQuestion.the(RegistrationThreePage.osInput(uTestRegData.get(0).getStrOS())), WebElementStateMatchers.isEnabled())
                        .forNoLongerThan(30).seconds(),

                Click.on(RegistrationThreePage.osInput(uTestRegData.get(0).getStrOS())),
                Click.on(RegistrationThreePage.NEXT_LASTSTEP_BUTTON));
    }
}
