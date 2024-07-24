package mobile.e2e.appium.step_definitions.swag_lab;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mobile.e2e.appium.questions.LoginSwagLabQuestion;
import mobile.e2e.appium.tasks.swag_lab.LoginTask;
import mobile.e2e.appium.tasks.webApp.OpenBrowserTask;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class LoginSteps {

    @When("Wants to log in in the Swag lab web app")
    public void logInSauceDemo(List<Map<String, String>> dataSauceLab) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenBrowserTask.withData(dataSauceLab),
                LoginTask.withData(dataSauceLab)
        );
    }

    @Then("Will be able to see that the login was correct")
    public void changeCurrencyMain(List<Map<String, String>> dataSauceLab) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("The label login was: ", LoginSwagLabQuestion.getInfoCorrectLogin(), is(dataSauceLab.get(0).get("labelLogin")))
        );
    }
}
