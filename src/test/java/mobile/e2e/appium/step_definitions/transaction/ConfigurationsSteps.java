package mobile.e2e.appium.step_definitions.transaction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mobile.e2e.appium.interactions.SkipRateTask;
import mobile.e2e.appium.questions.MainQuestion;
import mobile.e2e.appium.tasks.DemoTask;
import mobile.e2e.appium.tasks.TransactionTask;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

public class ConfigurationsSteps {

    @When("He wants to select the currency")
    public void selectCurrency(List<Map<String, String>> dataCurrency) {
        OnStage.theActorInTheSpotlight().attemptsTo(

        );
    }
}
