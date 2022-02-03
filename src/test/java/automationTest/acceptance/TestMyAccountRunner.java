package automationTest.acceptance;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "../resources/feature/telaMyAccount.feature", glue = "../java/automationTest/acceptance/steps")
public class TestMyAccountRunner {
}
