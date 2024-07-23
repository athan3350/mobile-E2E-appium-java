package mobile.e2e.appium.actors;

import mobile.e2e.appium.abilities.UseAMobileDevice;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;

public class SetActor extends Cast {

    public final EnvironmentVariables environmentVariables;

    public SetActor(EnvironmentVariables environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    @Override
    public Actor actorNamed(String actorName, Ability... abilities) {
        return super.actorNamed(actorName, UseAMobileDevice.with(theDefaultDriverFor(actorName)));
    }

    private WebDriver theDefaultDriverFor(String actorName) {
        return ThucydidesWebDriverSupport.getWebdriverManager().getWebdriverByName(actorName);
    }
}
