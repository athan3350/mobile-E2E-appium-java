package mobile.e2e.appium.tasks.webApp;

import mobile.e2e.appium.ui.swag_labs_login.SwagLabsLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static mobile.e2e.appium.constants.KeysToRememberConstants.BASE_URI_WEB_APP;
import static mobile.e2e.appium.ui.cash_stash.TransactionPage.TXT_FIRST_OPTION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowserTask implements Task {
    private final List<Map<String, String>> dataTransaction;
    Map<String, String> data = new HashMap<>();


    public OpenBrowserTask(List<Map<String, String>> dataTransaction) {
        this.dataTransaction = dataTransaction;
    }

    public static OpenBrowserTask withData(List<Map<String, String>> dataTransaction) {
        return instrumented(OpenBrowserTask.class, dataTransaction);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        data.putAll(dataTransaction.get(0));

        actor.attemptsTo(
                WaitUntil.the(SwagLabsLoginPage.TXT_INSERT_URL, WebElementStateMatchers.isCurrentlyVisible())
                        .forNoMoreThan(10).seconds(),
                Enter.theValue(BASE_URI_WEB_APP).into(SwagLabsLoginPage.TXT_INSERT_URL),
                Click.on(TXT_FIRST_OPTION)
        );
    }
}
