package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UTestRegistrationData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.OpenUp;
import tasks.Registration;

import java.util.List;


public class UTestRegistrationStepDefinitions {

    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast()); }


    @Given("^than Juan wants to sign up to the uTest site$")
    public void thanJuanWantsToSignUpToTheUTestSite() throws Exception {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fills out the signup form$")
    public void heFillsOutTheSignupForm(List<UTestRegistrationData> uTestRegistrationData) throws Exception {
        OnStage.theActorCalled("Juan").attemptsTo(Registration.signUp(uTestRegistrationData.get(0).getStrFirstName(),
                uTestRegistrationData.get(0).getStrLastName(),uTestRegistrationData.get(0).getStrEmail(),uTestRegistrationData.get(0).getStrMonthOfBirth(),
                uTestRegistrationData.get(0).getStrDayOfBirth(),uTestRegistrationData.get(0).getStrYearOfBitrh(),uTestRegistrationData.get(0).getStrCity(),
                uTestRegistrationData.get(0).getStrCodPostal(),uTestRegistrationData.get(0).getStrPassword(),uTestRegistrationData.get(0).getStrConfirmPassword()));
    }

    @Then("^he has registered on the website and receives a message$")
    public void heHasRegisteredOnTheWebsiteAndReceivesAMessage(List<UTestRegistrationData> uTestRegistrationData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestRegistrationData.get(0).getStrMessage())));
    }
}
