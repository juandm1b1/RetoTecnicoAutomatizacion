package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.support.ui.Select;
import userinterface.RegistrationPages;

public class Registration implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonthOfBirth;
    private String strDayOfBirth;
    private String strYearOfBirth;
    private String strPassword;
    private String strConfirmPassword;

    public Registration(String strFirstName, String strLastName, String strEmail, String strMonthOfBirth, String strDayOfBirth, String strYearOfBirth, String strPassword, String strConfirmPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonthOfBirth = strMonthOfBirth;
        this.strDayOfBirth = strDayOfBirth;
        this.strYearOfBirth = strYearOfBirth;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static Registration signUp(String strFirstName, String strLastName, String strEmail, String strMonthOfBirth, String strDayOfBirth, String strYearOfBirth, String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(Registration.class,strFirstName,strLastName,strEmail,strMonthOfBirth,strDayOfBirth,strYearOfBirth,strPassword,strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(RegistrationPages.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(RegistrationPages.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(RegistrationPages.INPUT_EMAIL),
                Enter.keyValues(strMonthOfBirth).into(RegistrationPages.INPUT_BIRTH_MONTH),
                Enter.keyValues(strDayOfBirth).into(RegistrationPages.INPUT_BIRTH_DAY),
                Enter.keyValues(strYearOfBirth).into(RegistrationPages.INPUT_BIRTH_YEAR),
                Click.on(RegistrationPages.NEXT_LOCATION_BUTTON),
                Click.on(RegistrationPages.NEXT_DEVICES_BUTTON),
                Click.on(RegistrationPages.NEXT_LASTSTEP_BUTTON),
                Enter.theValue(strPassword).into(RegistrationPages.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(RegistrationPages.INPUT_CONFIRM_PASSWORD),
                Click.on(RegistrationPages.CHECKBOX_TERMS_OF_USE),
                Click.on(RegistrationPages.CHECKBOX_PRIVACY_POLICY),
                Click.on(RegistrationPages.COMPLETE_SETUP_BUTTON)
        );
    }
}
