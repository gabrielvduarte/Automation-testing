package automationTest.E2E;

import automationTest.E2E.pages.TelaMyAccountPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TelaMyAccountTest {
    private TelaMyAccountPage testFormulario;

    @Before
    public void beforeEach() {
        this.testFormulario = new TelaMyAccountPage();
    }
    @After
    public void afterEach() {
        this.testFormulario.facharTela();
    }
    @Test
    public void deveEfetuaCadastro() {
        this.testFormulario.preencheFormularioLogin("gato.lino@bol.com.br", "Amora58742247josa");
        Assertions.assertTrue(this.testFormulario.verificaTexto());
        Assertions.assertEquals("gato.lino", this.testFormulario.getNomeUsuarioLogado());
    }
}
