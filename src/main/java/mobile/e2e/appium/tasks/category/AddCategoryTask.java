package mobile.e2e.appium.tasks.category;

import mobile.e2e.appium.interactions.SelectItemInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static mobile.e2e.appium.ui.CategoryPage.*;
import static mobile.e2e.appium.ui.ModalPage.BTN_MODAL_CONTINUE;
import static mobile.e2e.appium.ui.ModalPage.BTN_MODAL_CUSTOM;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddCategoryTask implements Task {
    private final List<Map<String, String>> dataTransaction;
    Map<String, String> data = new HashMap<>();


    public AddCategoryTask(List<Map<String, String>> dataTransaction) {
        this.dataTransaction = dataTransaction;
    }

    public static AddCategoryTask now(List<Map<String, String>> dataTransaction) {
        return instrumented(AddCategoryTask.class, dataTransaction);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        dataTransaction.get(0).forEach(data::put);

        actor.attemptsTo(
                Click.on(BTN_ADD_CATEGORY),
                Enter.theValue(data.get("category")).into(TXT_NAME_CATEGORY),
                SelectItemInteraction.select("Color"),
                Click.on(BTN_MODAL_CUSTOM),
                Click.on(TXT_ENTER_COLOR),
                Enter.theValue(data.get("hexadecimal_color")).into(TXT_ENTER_COLOR),
                Click.on(BTN_MODAL_CONTINUE),
                Click.on(IMG_CATEGORY.of("5")),
                Click.on(BTN_CONFIRM_CATEGORY),
                Click.on(BTN_SEARCH_CATEGORY),
                Click.on(TXT_SEARCH_CATEGORY),
                Enter.theValue(data.get("category")).into(TXT_SEARCH_CATEGORY),
                SelectItemInteraction.select(data.get("category"))
        );
    }
}
