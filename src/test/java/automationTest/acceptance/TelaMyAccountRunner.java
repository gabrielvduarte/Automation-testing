package automationTest.acceptance;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature/telaMyAccount.feature",
        glue = {"automationTest.acceptance.steps.telaRegistroLogin"}
)
public class TelaMyAccountRunner {
}
