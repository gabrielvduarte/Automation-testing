package automationTest.acceptance.steps;

import automationTest.E2E.pages.TelaMyAccountPage;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class RegistroLoginStepsDefs {

    TelaMyAccountPage myAccountPage;


    @After
    public void afterEach() {
        this.myAccountPage.fecharTela();
    }


    @Dado("que o cliente cadastrado acessa a tela de MyAccount")
    public void que_o_cliente_cadastrado_acessa_a_tela_de_my_account() { this.myAccountPage = new TelaMyAccountPage(); }

    @Quando("preenche o formulario de login")
    public void preenche_o_formulario_de_login() {
        this.myAccountPage.preencheFormularioLogin("gato.lino@bol.com.br", "Amora58742247josa");
    }
    @Entao("aparecerá uma mensagem {string}")
    public void aparecerá_uma_mensagem(String mensagem) {
        assertFalse(equals(myAccountPage.getNomeUsuarioLogadoComSucesso()), mensagem);
    }

    @Dado("que o usuario nao cadastrado tentar se loga na tela de MyAccount")
    public void que_o_usuario_nao_cadastrado_tentar_se_loga_na_tela_de_my_account() { this.myAccountPage = new TelaMyAccountPage(); }

    @Quando("informar nome de usuario não cadastrado e senha")
    public void informar_nome_de_usuario_não_cadastrado_e_senha() {
        this.myAccountPage.preencheFormularioLogin("fulano@bol.com.br", "morango400289");
    }
    @Entao("o usuario continua na mesma tela e retornar a seguinte mensagem {string}")
    public void o_usuario_continua_na_mesma_tela_e_retornar_a_seguinte_mensagem(String mensagem) {
        assertFalse(equals(myAccountPage.getUsuarioNaoCadastrado()), mensagem);
    }

    @Dado("que o usuario acesse a tela do MyAccount")
    public void que_o_usuario_acesse_a_tela_do_my_account() { this.myAccountPage = new TelaMyAccountPage(); }

    @Quando("usuario tentar se logar com email completo e senha em branco")
    public void usuario_tentar_se_logar_com_email_completo_e_senha_em_branco() {
        this.myAccountPage.preencheFormularioLogin("fulano@bol.com.br", "");
    }

    @Entao("usuario continuar na pagina de login com a seguinte mensagem de erro {string}")
    public void usuario_continuar_na_pagina_de_login_com_a_seguinte_mensagem_de_erro(String mensagem) {
        assertFalse(equals(myAccountPage.getSenhaEmBranco()), mensagem);
    }

   @Dado("que o usuario acesse a telo MyAccount")
   public void que_o_usuario_acesse_a_telo_my_account() { this.myAccountPage = new TelaMyAccountPage(); }

   @Quando("usuario tentar se logar com email em branco e senha correta")
   public void usuario_tentar_se_logar_com_email_em_branco_e_senha_correta() {
       this.myAccountPage.preencheFormularioLogin("","Chorando_manga");
    }

   @Entao("usuario continua na mesma tela de login que retorna a seguinte mensagem {string}")
   public void usuario_continua_na_mesma_tela_de_login_que_retorna_a_seguinte_mensagem(String mensagem) {
       assertFalse(equals(myAccountPage.getEmailemBranco()), mensagem);
   }

    @Dado("que o usuario acesse a tela MyAccount")
    public void que_o_usuario_acesse_a_tela_my_account() { this.myAccountPage = new TelaMyAccountPage(); }

    @Quando("usuario tentar se logar passado numeros no campo email e senha correta")
    public void usuario_tentar_se_logar_passado_numeros_no_campo_email_e_senha_correta() {
        this.myAccountPage.preencheFormularioLogin("555555882523", "Chorando_manga");
    }

    @Entao("o usuario continuar na mesma tela com a seguinte mensagem {string}")
    public void o_usuario_continuar_na_mesma_tela_com_a_seguinte_mensagem(String mensagem) {
        assertFalse(equals(myAccountPage.getEmailcomNumeros()), mensagem);
    }

    @Quando("usuario tentar se logar passando nome com sobrenome no campo email")
    public void usuario_tentar_se_logar_passando_nome_com_sobrenome_no_campo_email() {
        this.myAccountPage.preencheFormularioLogin("Fulano raimundo cruz", "Chorando_manga");
    }

    @Entao("a seguinte mensagem sera retornada {string}")
    public void a_seguinte_mensagem_sera_retornada(String mensagem) {
        assertFalse(equals(myAccountPage.getNomeNoCampoEmail()), mensagem);
    }

    @Quando("usuario ja cadastrado tentar se loga com email correto e com a senha incorreta")
    public void usuario_ja_cadastrado_tentar_se_registra_com_email_correto_e_com_a_senha_incorreta() {
        this.myAccountPage.preencheFormularioLogin("gato.lino@bol.com.br", "Amora58742247amor");
    }
    @Entao("devera retornar a seguinte mensagem {string}")
    public void devera_retornar_a_seguinte_mensagem(String mensagem) {
        assertFalse(equals(myAccountPage.getSenhaIncorreta()), mensagem);
    }
    //Formulario de Registro

    @Quando("preenche o formulario de registro")
    public void preenche_o_formulario_de_registro() {
      this.myAccountPage.preencheFormularioCadastro("fulano@gmail.com.br","Chorando_manga");
    }
    @Entao("sera retornado a mensagem {string}")
    public void sera_retornado_a_mensagem(String mensagem) {
        assertFalse(equals(myAccountPage.getNomeUsuarioLogadoComSucesso()), mensagem);
    }

    @Dado("que o cliente ainda nao cadastrado acessa a tela de MyAccount")
    public void que_o_cliente_ainda_nao_cadastrado_acessa_a_tela_de_my_account() { this.myAccountPage = new TelaMyAccountPage(); }

    @Quando("preenche o formulario de registro com senha fraca")
    public void preenche_o_formulario_de_registro_com_senha_fraca() {
        this.myAccountPage.preencheFormularioCadastro("gato.lino@bol.com.br", "12345");
    }
    @Entao("ele continua na pagina de MyAccount com a mensagem {string}")
    public void ele_continua_na_pagina_de_my_account_com_a_mensagem(String mensagem) {
        Assert.assertFalse(myAccountPage.getSenhaFraca(mensagem));
    }

    @Quando("preenche o formulario de registro com email em branco e senha corretamente")
    public void preenche_o_formulario_de_registro_com_email_em_branco_e_senha_corretamente() {
       this.myAccountPage.preencheFormularioCadastro("", "Messias58742247");
    }
    @Entao("ele sera retornado a seguinte mensagem {string}")
    public void ele_sera_retornado_a_seguinte_mensagem(String mensagem) {
        assertFalse(equals(myAccountPage.getEmailemBranco()), mensagem);
    }

    @Quando("preenche formulario com email em branco e senha")
    public void preenche_formulario_com_email_em_branco_e_senha() {
      this.myAccountPage.preencheFormularioCadastro("", "");
    }
    @Entao("retornara  mensagem {string}")
    public void retornara_mensagem(String mensagem) {
        assertFalse(equals(myAccountPage.getEmailemBrancoEsenha()), mensagem);
    }

    @Quando("preenche o formulario de registro com email e senha corretamente")
    public void preenche_o_formulario_de_registro_com_email_e_senha_corretamente() {
      this.myAccountPage.preencheFormularioCadastro("beltrano@gmail.con", "Beltrano587422159");
    }

    @E("preenche o formulario de login com dados validos")
    public void preenche_o_formulario_de_login_com_dados_validos() {
      this.myAccountPage.preencheFormularioLogin("beltrano@gmail.con", "Beltrano587422159");
    }

    @Entao("retornara a seguinte mensagem {string}")
    public void retornara_a_seguinte_mensagem(String mensagem) {
        assertFalse(equals(myAccountPage.getNomeUsuarioLogadoComSucesso()), mensagem);
    }


}
