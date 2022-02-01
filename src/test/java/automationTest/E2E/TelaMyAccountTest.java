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
        Assertions.assertEquals(null, this.testFormulario.getNomeUsuarioLogado());
    }
    @Test
    public void usarioNaoCadastrado() {
        this.testFormulario.preencheFormularioLogin("fulano@bol.com.br", "58742247amora");
        Assertions.assertTrue(this.testFormulario.verificaTexto());
        Assertions.assertFalse(Boolean.parseBoolean("Error: A user could not be found with this email address"), this.testFormulario.getNomeUsuarioLogado());
    }
    @Test
    public void usuarioTentaComSenhaEmBranco() {
        this.testFormulario.preencheFormularioLogin("gato.lino@bol.com.br", "");
        Assertions.assertTrue(this.testFormulario.verificaTexto());
        Assertions.assertFalse(Boolean.parseBoolean("Error: Password is required."), this.testFormulario.getNomeUsuarioLogado());
    }
    @Test
    public void usuarioTentaComEmailEmBranco() {
        this.testFormulario.preencheFormularioLogin("", "Amora58742247josa");
        Assertions.assertTrue(this.testFormulario.verificaTexto());
        Assertions.assertFalse(Boolean.parseBoolean("Error: Username is required."), this.testFormulario.getNomeUsuarioLogado());
    }
    @Test
    public void tentaSeLogarPassandoNumerosNoCampoNome() {
        this.testFormulario.preencheFormularioLogin("58742247", "58742247amora");
        Assertions.assertTrue(this.testFormulario.verificaTexto());
        Assertions.assertFalse(Boolean.parseBoolean("ERROR: Invalid username. Lost your password?"), this.testFormulario.getNomeUsuarioLogado());
    }
    @Test
    public void tentarSeLogarPassandoNomeNoCampoEmail() {
        this.testFormulario.preencheFormularioLogin("fulano", "Amora58742247amora");
        Assertions.assertTrue(this.testFormulario.verificaTexto());
        Assertions.assertFalse(Boolean.parseBoolean("ERROR: Invalid username. Lost your password?"), this.testFormulario.getNomeUsuarioLogado());
    }
    @Test
    public void usuarioCadastradoTentarSelogarComSenhaIncorreta() {
        this.testFormulario.preencheFormularioLogin("gato.lino@bol.com.br", "Amora58742247amor");
        Assertions.assertTrue(this.testFormulario.verificaTexto());
        Assertions.assertFalse(Boolean.parseBoolean("ERROR: The password you entered for the username gato.lino@bol.com.br is incorrect. Lost your password?"), this.testFormulario.getNomeUsuarioLogado());
    }
    @Test
    public void usuarioCadastradoTentarSelogarMaisDeUmaVez() {
        this.testFormulario.preencheFormularioLogin("gato.lino@bol.com.br", "Amora58742247josa");
        Assertions.assertTrue(this.testFormulario.verificaTexto());
        this.testFormulario.preencheFormularioLogin("gato.lino@bol.com.br", "Amora58742247josa");
        Assertions.assertFalse(Boolean.parseBoolean("ERROR: The password you entered for the username gato.lino@bol.com.br is incorrect. Lost your password?"), this.testFormulario.getNomeUsuarioLogado());
    }
    @Test //Formulario de Registro
    public void usuarioPreencheFormulariodeCadastro() {
        this.testFormulario.preencheFormularioCadastrado("fulano@gmail.com.br", "Chorando_manga");
        Assertions.assertTrue(this.testFormulario.verificaTexto());
        Assertions.assertEquals(null, this.testFormulario.getNomeUsuarioLogado());
    }
    @Test
    public void usarioJaRegistradoTentarSeRegistrar() {
        this.testFormulario.preencheFormularioCadastrado("gato.lino@bol.com.br", "Amora58742247josa");
        Assertions.assertTrue(this.testFormulario.verificaTexto());
        Assertions.assertEquals(Boolean.parseBoolean("Erro: Uma conta já está registrada com seu endereço de e-mail. Por favor entre."), this.testFormulario.getNomeUsuarioLogado());
    }
    @Test
    public void usarioTentaSeCadastrarComSenhaFraca() {
        this.testFormulario.preencheFormularioCadastrado("beltrano@gmail.com.br", "pass5874");
        Assertions.assertTrue(this.testFormulario.verificaTexto());
        Assertions.assertEquals(null, this.testFormulario.getNomeUsuarioLogado());
    }
    @Test
    public void usuarioTentarSeLogaComEmaiEmlBranco() {
        this.testFormulario.preencheFormularioCadastrado("", "Messias58742247");
        Assertions.assertTrue(this.testFormulario.verificaTexto());
        Assertions.assertFalse(Boolean.parseBoolean("Erro: Forneça um endereço de e-mail válido."), this.testFormulario.getNomeUsuarioLogado());
    }
}
