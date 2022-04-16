package mobile.e2e.appium.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import mobile.e2e.appium.ui.MainPage;
import mobile.e2e.appium.ui.TransactionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionTask implements Task {
    private final List<Map<String, String>> dataTransaction;
    Map<String, String> data = new HashMap<>();


    public TransactionTask(List<Map<String, String>> dataTransaction) {
        this.dataTransaction = dataTransaction;
    }

    public static TransactionTask withData(List<Map<String, String>> dataTransaction) {
        return instrumented(TransactionTask.class, dataTransaction);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        dataTransaction.get(0).forEach(data::put);

        actor.attemptsTo(
                WaitUntil.the(MainPage.BTN_ADD_EXPENSE_INCOME, WebElementStateMatchers.isCurrentlyVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(MainPage.BTN_ADD_EXPENSE_INCOME),
                Click.on(TransactionPage.CMB_CATEGORY),
                Click.on(TransactionPage.LBL_TYPE.of(data.get("type_transaction"))),
                Click.on(TransactionPage.LBL_CATEGORY.of(data.get("category"))),
                Enter.theValue(data.get("value")).into(TransactionPage.TXT_VALUE_TRANSACTION),
                Click.on(TransactionPage.BTN_CONFIRM_TRANSACTION)
        );
    }
}
