package mobile.e2e.appium.tasks.configurations;

import mobile.e2e.appium.interactions.SelectItemInteraction;
import mobile.e2e.appium.ui.ConfigurationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectItemToConfigurateTask implements Task {
    private final String dataTransaction;


    public SelectItemToConfigurateTask(String dataTransaction) {
        this.dataTransaction = dataTransaction;
    }

    public static SelectItemToConfigurateTask now(String dataTransaction) {
        return instrumented(SelectItemToConfigurateTask.class, dataTransaction);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ConfigurationPage.BTN_CONFIGURATION),
                SelectItemInteraction.select(dataTransaction)
        );
    }
}
