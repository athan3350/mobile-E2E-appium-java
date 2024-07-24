package mobile.e2e.appium.questions;

import mobile.e2e.appium.ui.swag_labs_login.SwagLabsLoginPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginSwagLabQuestion {

    public static Question<String> getInfoCorrectLogin() {
        return actor -> Text.of(SwagLabsLoginPage.LBL_CORRECT_LOGIN).viewedBy(actor).asString().trim();
    }

}
