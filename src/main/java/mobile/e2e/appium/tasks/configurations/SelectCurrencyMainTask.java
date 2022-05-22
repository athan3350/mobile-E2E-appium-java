package mobile.e2e.appium.tasks.configurations;

import mobile.e2e.appium.interactions.SelectItemInteraction;
import mobile.e2e.appium.ui.ConfigurationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static mobile.e2e.appium.constants.GeneralConstants.SELECT_CURRENCY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectCurrencyMainTask implements Task {
    private final List<Map<String, String>> dataTransaction;
    Map<String, String> data = new HashMap<>();


    public SelectCurrencyMainTask(List<Map<String, String>> dataConfiguration) {
        this.dataTransaction = dataConfiguration;
    }

    public static SelectCurrencyMainTask now(List<Map<String, String>> dataConfiguration) {
        return instrumented(SelectCurrencyMainTask.class, dataConfiguration);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        dataTransaction.get(0).forEach(data::put);

        actor.attemptsTo(
                SelectItemInteraction.select(data.get("currency"))
        );
    }
}
