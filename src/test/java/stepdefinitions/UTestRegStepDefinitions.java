package stepdefinitions;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.ExceptionError;
import model.UTestRegData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import questions.TheText;
import tasks.*;
import userinterface.WelcomeMesPage;
import utilities.MsgError;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class UTestRegStepDefinitions {

    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast()); }


    @Given("^than Juan wants to sign up to the uTest site$")
    public void thanJuanWantsToSignUpToTheUTestSite() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fills out the signup form$")
    public void heFillsOutTheSignupForm(List<UTestRegData> uTestRegData) {
        OnStage.theActorCalled("Juan").attemptsTo(RegistrationOne.signUp(uTestRegData));

        OnStage.theActorCalled("Juan").attemptsTo(RegistrationTwo.signUpTwo(uTestRegData));

        OnStage.theActorCalled("Juan").attemptsTo(RegistrationThree.signUpThree(uTestRegData));

        OnStage.theActorCalled("Juan").attemptsTo(tasks.RegistrationFour.signUpFour(uTestRegData));
    }

    @Then("^he has registered on the website and receives a message (.*)$")
    public void heHasRegisteredOnTheWebsiteAndReceivesAMessage(String answerData) {
        OnStage.theActorInTheSpotlight().should(seeThat(
                TheText.of(WelcomeMesPage.WELCOME_MESSAGE), is(equalTo(answerData)))
                .orComplainWith(ExceptionError.class, MsgError.MSG_CODE_ERROR.getMsg()));
    }

    //    @Then("^he has registered on the website and receives a message$")
//    public void heHasRegisteredOnTheWebsiteAndReceivesAMessage(List<UTestRegData> uTestRegData) throws Exception {
//        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestRegData.get(0).getStrMessage())));
//    }
}
