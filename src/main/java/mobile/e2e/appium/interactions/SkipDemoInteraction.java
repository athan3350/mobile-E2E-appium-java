package mobile.e2e.appium.interactions;

import mobile.e2e.appium.ui.DemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SkipDemoInteraction implements Interaction {

    public static Interaction skip() {
        return instrumented(SkipDemoInteraction.class);
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
