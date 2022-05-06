package mobile.e2e.appium.tasks.transaction;

import mobile.e2e.appium.ui.TransactionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Arrays;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterValueTask implements Task {
    private final Map<String, String> values;

    public EnterValueTask(Map<String, String> values) {
        this.values = values;
    }

    public static EnterValueTask now(Map<String, String> valueTransaction) {
        return instrumented(EnterValueTask.class, valueTransaction);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (values.get("using_keyboard") == null) {
            actor.attemptsTo(
                    Enter.theValue(values.get("value")).into(TransactionPage.TXT_VALUE_TRANSACTION)
            );
            return;
        }

        Arrays.stream(values.get("value").split("(?<=.)"))
                .forEach(digit -> {
                    actor.attemptsTo(Click.on(TransactionPage.BTN_NUMERIC_KEYBOARD_TRANSACTION.of(digit)));
                });
    }
}
