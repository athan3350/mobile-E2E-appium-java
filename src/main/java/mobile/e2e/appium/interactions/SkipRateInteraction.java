package mobile.e2e.appium.interactions;

import mobile.e2e.appium.ui.ModalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class SkipRateInteraction implements Interaction {

    public static Interaction skip() {
        return instrumented(SkipRateInteraction.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Check.whether(the(ModalPage.LBL_MODAL_TITLE), isVisible()).andIfSo(Click.on(ModalPage.BTN_MODAL_NO_THANKS))
        );
    }
}
