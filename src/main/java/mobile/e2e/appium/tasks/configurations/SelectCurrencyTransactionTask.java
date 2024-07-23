package mobile.e2e.appium.tasks.configurations;

import mobile.e2e.appium.interactions.SelectItemInteraction;
import mobile.e2e.appium.ui.cash_stash.ConfigurationPage;
import mobile.e2e.appium.ui.cash_stash.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static mobile.e2e.appium.ui.cash_stash.ModalPage.BTN_MODAL_CONTINUE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectCurrencyTransactionTask implements Task {
    private final List<Map<String, String>> dataTransaction;
    Map<String, String> data = new HashMap<>();


    public SelectCurrencyTransactionTask(List<Map<String, String>> dataConfiguration) {
        this.dataTransaction = dataConfiguration;
    }

    public static SelectCurrencyTransactionTask now(List<Map<String, String>> dataConfiguration) {
        return instrumented(SelectCurrencyTransactionTask.class, dataConfiguration);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        dataTransaction.get(0).forEach(data::put);

        actor.attemptsTo(
                WaitUntil.the(MainPage.BTN_ADD_EXPENSE_INCOME, WebElementStateMatchers.isCurrentlyVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(MainPage.BTN_ADD_EXPENSE_INCOME),
                Click.on(ConfigurationPage.LBL_ITEM.of("\\$")),
                SelectItemInteraction.select(data.get("currency")),
                Click.on(BTN_MODAL_CONTINUE)
        );
    }
}
