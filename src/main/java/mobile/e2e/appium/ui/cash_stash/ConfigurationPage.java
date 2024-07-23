package mobile.e2e.appium.ui.cash_stash;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfigurationPage {

    private ConfigurationPage() {
    }

    public static final Target LBL_ITEM = Target.the("Generic label that allows select element by text").locatedBy("//*[contains(@text, '{0}')]");
    public static final Target BTN_CONFIGURATION = Target.the("Button to access to configurations module").located(By.id("menuItem_Settings"));

}
