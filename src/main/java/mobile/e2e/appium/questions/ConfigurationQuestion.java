package mobile.e2e.appium.questions;

import mobile.e2e.appium.ui.ConfigurationPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ConfigurationQuestion {

    public static Question<String> getInfoCurrentCurrency(String currency) {
        return actor -> Text.of(ConfigurationPage.LBL_ITEM.of(currency)).viewedBy(actor).asString().trim();
    }

}
