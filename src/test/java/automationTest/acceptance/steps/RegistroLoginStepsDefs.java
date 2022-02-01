package automationTest.acceptance.steps;

import automationTest.E2E.pages.TelaMyAccountPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class RegistroLoginStepsDefs {

    TelaMyAccountPage myAccountPage;

    @Before
    public void beforeEach() {
        this.myAccountPage = new TelaMyAccountPage(); //Estanciando minha variavel
    }
    @After
    public void afterEach() {
        this.myAccountPage.facharTela();
    }
@Test
    @Dado("que o cliente cadastrado acessa a tela de MyAccount")
    public void que_o_cliente_cadastrado_acessa_a_tela_de_my_account() {
        this.myAccountPage = new TelaMyAccountPage();
    }

    @Quando("preenche o formulario de registro")
    public void preenche_o_formulario_de_registro() {
        this.myAccountPage.preencheFormularioLogin("gato.lino@bol.com.br", "Amora58742247josa");
    }
    @Entao("aparecerá uma mensagem de cadastrado com sucesso")
    public void aparecerá_uma_mensagem_de_cadastrado_com_sucesso() {
        assertEquals(null, myAccountPage.getNomeUsuarioLogado());
    }
@Test
    @Dado("que o usuario acesse a tela do MyAccount")
    public void que_o_usuario_acesse_a_tela_do_my_account() {this.myAccountPage = new TelaMyAccountPage(); }


    @Quando("usuario tentar se logar com email completo e senha em branco")
    public void usuario_tentar_se_logar_com_email_completo_e_senha_em_branco() {
      this.myAccountPage.preencheFormularioLogin("gato.lino@bol.com.br", "");
    }

    @Entao("usuario continuar na pagina de login com a seguinte mensagem de erro {mensagem}")
    public void usuario_continuar_na_pagina_de_login_com_a_seguinte_mensagem_de_erro(String mensagem) {
        assertEquals(mensagem, myAccountPage.getNomeUsuarioLogado());
    }

}
