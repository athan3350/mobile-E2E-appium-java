package mobile.e2e.appium.step_definitions.login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

public class LoginSteps {

    @Given("{word} is a Cash stash's user")
    public void initializeActor(String nameActor) {
        OnStage.theActorCalled(nameActor).describedAs("Cash stash's actor");
    }
}
