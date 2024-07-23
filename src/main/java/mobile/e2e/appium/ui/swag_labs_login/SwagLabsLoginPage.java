package mobile.e2e.appium.ui.swag_labs_login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SwagLabsLoginPage {
    private SwagLabsLoginPage() {
    }

    public static final Target TXT_INSERT_URL = Target.the("URL").located(By.id("search_box_text"));
    public static final Target BTN_LOGIN_SUBMIT = Target.the("button for login Swag Labs").locatedBy("//android.widget.Button[@text=\"Login\"]");
    public static final Target TXT_INSERT_USERNAME = Target.the("textbox to insert username").locatedBy("//android.view.View[1]/android.view.View/android.view.View[1]/android.widget.EditText");
    public static final Target TXT_INSERT_PASSWORD = Target.the("textbox to insert password").locatedBy("//android.view.View[1]/android.view.View/android.view.View[2]/android.widget.EditText");
    public static final Target LBL_CORRECT_LOGIN = Target.the("label of correct login").locatedBy("//android.widget.TextView[@text=\"Swag Labs\"]");


}
