package automationTest.acceptance;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/ValidaTelaCarrinho.feature",
        tags = "@UtilizaCupom"
)
public class AutomationTestRunner {
}
