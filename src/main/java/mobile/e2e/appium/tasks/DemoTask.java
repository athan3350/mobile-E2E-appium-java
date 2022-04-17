package mobile.e2e.appium.tasks;

import mobile.e2e.appium.ui.DemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DemoTask implements Task {

    public static DemoTask skip() {
        return instrumented(DemoTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(DemoPage.BTN_NEXT_DEMO),
                Click.on(DemoPage.BTN_NEXT_DEMO),
                Click.on(DemoPage.BTN_NEXT_DEMO)
        );
    }
}
