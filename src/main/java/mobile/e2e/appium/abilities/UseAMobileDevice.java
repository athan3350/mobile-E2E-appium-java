package mobile.e2e.appium.abilities;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class UseAMobileDevice extends BrowseTheWeb {

    protected UseAMobileDevice(WebDriver browser) {
        super(browser);
    }

    @Override
    public String toString() {
        return "actor uses a mobile device";
    }

    public static UseAMobileDevice with(WebDriver driver) {
        return new UseAMobileDevice(driver);
    }
}
