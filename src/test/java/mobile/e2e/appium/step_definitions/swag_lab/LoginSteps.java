package mobile.e2e.appium.step_definitions.swag_lab;

import io.cucumber.java.en.When;
import mobile.e2e.appium.tasks.swag_lab.LoginTask;
import mobile.e2e.appium.tasks.webApp.OpenBrowserTask;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

public class LoginSteps {

    @When("Wants to log in in the Swag lab web app")
    public void logInSauceDemo(List<Map<String, String>> dataTransaction) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenBrowserTask.withData(dataTransaction),
                LoginTask.withData(dataTransaction)
        );
    }
}
