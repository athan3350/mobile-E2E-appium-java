package mobile.e2e.appium.step_definitions.transaction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mobile.e2e.appium.interactions.SkipDemoInteraction;
import mobile.e2e.appium.questions.MainQuestion;
import mobile.e2e.appium.interactions.SkipRateInteraction;
import mobile.e2e.appium.tasks.transaction.TransactionTask;
import net.serenitybdd.screenplay.actors.OnStage;

import static org.hamcrest.Matchers.is;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TransactionSteps {

    @Given("{word} is an user")
    public void initializeActor(String nameActor) {
        OnStage.theActorCalled(nameActor).describedAs("Cash stash's actor");
    }

    @When("He wants to add a new expense\\income")
    public void addExpenseIncome(List<Map<String, String>> dataTransaction) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SkipDemoInteraction.skip(),
                TransactionTask.withData(dataTransaction),
                SkipRateInteraction.skip()
        );
    }

    @Then("He will see that his expense has been added")
    public void checkExpense(List<Map<String, String>> dataBalance) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("The total balance is: ", MainQuestion.getInfoBalanceTotal(), is("$ -" + dataBalance.get(0).get("totalBalance"))),
                seeThat("The daily balance is: ", MainQuestion.getInfoBalanceDaily(), is("Total:$ -" + dataBalance.get(0).get("totalBalance")))
        );
    }

    @Then("He will see that his income has been added")
    public void checkIncome(List<Map<String, String>> dataBalance) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("The total balance is: ", MainQuestion.getInfoBalanceTotal(), is("$ " + dataBalance.get(0).get("totalBalance"))),
                seeThat("The daily balance is: ", MainQuestion.getInfoBalanceDaily(), is("Total:$ " + dataBalance.get(0).get("totalBalance")))
        );
    }


}
