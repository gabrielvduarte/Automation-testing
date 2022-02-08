package automationTest.acceptance.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/automationTest/acceptance/telaCarrinho/features/ValidaTelaCarrinho.feature",
        glue = {"automationTest.acceptance.telaCarrinho.steps"}
)
public class AutomationTestRunner {
}
