package mobile.e2e.appium.step_definitions.transaction;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import mobile.e2e.appium.interactions.SkipDemoInteraction;
import mobile.e2e.appium.questions.ConfigurationQuestion;
import mobile.e2e.appium.tasks.configurations.SelectCurrencyMainTask;
import mobile.e2e.appium.tasks.configurations.SelectCurrencyTransactionTask;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class ConfigurationsSteps {

    @When("He wants to select the currency from the main menu")
    public void selectCurrencyMain(List<Map<String, String>> dataConfiguration) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SkipDemoInteraction.skip(),
                SelectCurrencyMainTask.now(dataConfiguration)
        );
    }

    @When("He wants to select the currency from the transaction module")
    public void selectCurrencyTransaction(List<Map<String, String>> dataConfiguration) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SkipDemoInteraction.skip(),
                SelectCurrencyTransactionTask.now(dataConfiguration)
        );
    }

    @And("He will be able to see that he can transact in his new currency {word}")
    public void changeCurrencyMain(String currency) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("The new currency is: ", ConfigurationQuestion.getInfoCurrentCurrency(currency), is(currency))
        );
    }
}
