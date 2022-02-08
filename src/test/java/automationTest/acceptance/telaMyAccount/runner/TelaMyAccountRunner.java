package automationTest.acceptance.telaMyAccount.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/automationTest/acceptance/telaMyAccount/features/telaMyAccount.feature",
        glue = {"automationTest.acceptance.telaMyAccount.steps"}
)
public class TelaMyAccountRunner {
}