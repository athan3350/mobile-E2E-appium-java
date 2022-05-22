package mobile.e2e.appium.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ModalPage {
    private ModalPage() {
    }

    public static final Target LBL_MODAL_TITLE = Target.the("Label with the modal title").located(By.id("alertTitle"));
    public static final Target BTN_MODAL_NO_THANKS = Target.the("Button to skip rating app").located(By.id("android:id/button2"));
    public static final Target BTN_MODAL_CONTINUE = Target.the("Button to confirm the modal").located(By.id("android:id/button1"));

}
