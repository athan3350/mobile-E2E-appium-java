package mobile.e2e.appium.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin ={"pretty"},
        features = {"classpath:features"},
        tags = "@LoginFailByEmptyData",
        glue = {"mobile.e2e.appium"}
)public class CurrentTestRunner {
}
