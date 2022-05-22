package mobile.e2e.appium.step_definitions.transaction;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import mobile.e2e.appium.interactions.SkipDemoInteraction;
import mobile.e2e.appium.tasks.category.AddCategoryTask;
import mobile.e2e.appium.tasks.configurations.SelectItemToConfigurateTask;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static mobile.e2e.appium.constants.GeneralConstants.MANAGE_CATEGORY;


public class CategorySteps {

    @When("He wants to add a new category")
    public void selectCurrencyTransaction(List<Map<String, String>> dataCategory) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SkipDemoInteraction.skip(),
                SelectItemToConfigurateTask.now(MANAGE_CATEGORY),
                AddCategoryTask.now(dataCategory)
        );
    }

    @And("He could see that the new category will be added")
    public void validateCategoryAdded() {
    }

}
