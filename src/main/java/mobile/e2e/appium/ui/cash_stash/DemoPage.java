package mobile.e2e.appium.ui.cash_stash;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoPage {
    private DemoPage() {
    }

    public static final Target BTN_NEXT_DEMO = Target.the("Button for continue with the demo").located(By.id("aboutApp_nextButton"));

}
