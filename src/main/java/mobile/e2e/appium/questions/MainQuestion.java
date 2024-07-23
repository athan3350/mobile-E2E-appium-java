package mobile.e2e.appium.questions;

import mobile.e2e.appium.ui.cash_stash.MainPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MainQuestion {

    public static Question<String> getInfoBalanceTotal() {
        return actor -> Text.of(MainPage.LBL_INFO_BALANCE_TOTAL).viewedBy(actor).asString();
    }

    public static Question<String> getInfoBalanceDaily() {
        return actor -> Text.of(MainPage.LBL_INFO_BALANCE_DAILY).viewedBy(actor).asString();
    }
}
