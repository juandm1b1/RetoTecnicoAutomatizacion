package tasks;

import model.UTestRegData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import userinterface.RegistrationOnePage;

import java.util.List;


public class RegistrationOne implements Task {

    private List<UTestRegData> uTestRegData;
    private String[] languages;


    public RegistrationOne(List<UTestRegData> uTestRegData) {
        this.uTestRegData = uTestRegData;
        this.languages = uTestRegData.get(0).getStrLanguages().split(",");
    }

    public static RegistrationOne signUp(List<UTestRegData> uTestRegData) {
        return Tasks.instrumented(RegistrationOne.class,uTestRegData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.until(WebElementQuestion.the(RegistrationOnePage.INPUT_FIRSTNAME),WebElementStateMatchers.isEnabled())
                        .forNoLongerThan(30).seconds(),
                Enter.theValue(uTestRegData.get(0).getStrFirstName()).into(RegistrationOnePage.INPUT_FIRSTNAME),
                Enter.theValue(uTestRegData.get(0).getStrLastName()).into(RegistrationOnePage.INPUT_LASTNAME),
                Enter.theValue(uTestRegData.get(0).getStrEmail()).into(RegistrationOnePage.INPUT_EMAIL),
                Enter.keyValues(uTestRegData.get(0).getStrMonthOfBirth()).into(RegistrationOnePage.INPUT_BIRTH_MONTH),
                Enter.keyValues(uTestRegData.get(0).getStrDayOfBirth()).into(RegistrationOnePage.INPUT_BIRTH_DAY),
                Enter.keyValues(uTestRegData.get(0).getStrYearOfBirth()).into(RegistrationOnePage.INPUT_BIRTH_YEAR)
        );

        for(String language : languages){
            actor.attemptsTo(Click.on(RegistrationOnePage.LANGUAGES_DIV),
                    Click.on(RegistrationOnePage.languageOption(language.trim()))
            );
        }

        actor.attemptsTo(Click.on(RegistrationOnePage.NEXT_LOCATION_BUTTON));
    }
}
