package mobile.e2e.appium.step_definitions;
import io.cucumber.java.Before;
import mobile.e2e.appium.actors.ActorCast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.util.EnvironmentVariables;

public class Hooks {

    private EnvironmentVariables environmentVariables;

    @Before
    public void setTheStageMobilePlay() {
        OnStage.setTheStage(new ActorCast(environmentVariables));
    }
}
