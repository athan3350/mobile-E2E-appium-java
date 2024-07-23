package mobile.e2e.appium.interactions;

import mobile.e2e.appium.ui.cash_stash.ConfigurationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectItemInteraction implements Interaction {
    private final String valueToFind;

    public SelectItemInteraction(String valueToFind) {
        this.valueToFind = valueToFind;
    }

    public static Interaction select(String valueToFind) {
        return instrumented(SelectItemInteraction.class, valueToFind);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ConfigurationPage.LBL_ITEM.of(valueToFind))
        );

    }
}
