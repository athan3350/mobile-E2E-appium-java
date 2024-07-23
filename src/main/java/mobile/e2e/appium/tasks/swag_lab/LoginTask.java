package mobile.e2e.appium.tasks.swag_lab;

import mobile.e2e.appium.ui.swag_labs_login.SwagLabsLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    private final List<Map<String, String>> dataTransaction;
    Map<String, String> data = new HashMap<>();


    public LoginTask(List<Map<String, String>> dataTransaction) {
        this.dataTransaction = dataTransaction;
    }

    public static LoginTask withData(List<Map<String, String>> dataTransaction) {
        return instrumented(LoginTask.class, dataTransaction);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        data.putAll(dataTransaction.get(0));

        actor.attemptsTo(
                Enter.theValue("standard_user").into(SwagLabsLoginPage.TXT_INSERT_USERNAME),
                Enter.theValue("secret_sauce").into(SwagLabsLoginPage.TXT_INSERT_PASSWORD),
                Click.on(SwagLabsLoginPage.BTN_LOGIN_SUBMIT)
        );
    }
}
