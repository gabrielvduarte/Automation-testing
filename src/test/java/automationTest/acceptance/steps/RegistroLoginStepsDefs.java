package automationTest.acceptance.steps;

import automationTest.E2E.pages.TelaMyAccountPage;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RegistroLoginStepsDefs {

    TelaMyAccountPage myAccountPage;


    @After
    public void afterEach() {
        this.myAccountPage.facharTela();
    }

    @Dado("que o cliente cadastrado acessa a tela de MyAccount")
    public void que_o_cliente_cadastrado_acessa_a_tela_de_my_account() { this.myAccountPage = new TelaMyAccountPage(); }

    @Quando("preenche o formulario de login")
    public void preenche_o_formulario_de_login() {
        this.myAccountPage.preencheFormularioLogin("gato.lino@bol.com.br", "Amora58742247josa");
    }
    @Entao("aparecerá uma mensagem de cadastrado com sucesso")
    public void aparecerá_uma_mensagem_de_cadastrado_com_sucesso() {
        assertEquals(null, myAccountPage.getNomeUsuarioLogado());
    }

    @Dado("que o usuario nao cadastrado tentar se loga na tela de MyAccount")
    public void que_o_usuario_nao_cadastrado_tentar_se_loga_na_tela_de_my_account() { this.myAccountPage = new TelaMyAccountPage(); }

    @Quando("informar nome de usuario não cadastrado e senha")
    public void informar_nome_de_usuario_não_cadastrado_e_senha() {
        this.myAccountPage.preencheFormularioLogin("fulano@bol.com.br", "morango400289");
    }
    @Entao("o usuario continua na mesma tela e retornar a seguinte mensagem {mensagem}")
    public void o_usuario_continua_na_mesma_tela_e_retornar_a_seguinte_mensagem(String mensagem) {
        assertEquals(mensagem, myAccountPage.getUsuarioNaoCadastrado());
    }

    @Dado("que o usuario acesse a tela do MyAccount")
    public void que_o_usuario_acesse_a_tela_do_my_account() { this.myAccountPage = new TelaMyAccountPage(); }

    @Quando("usuario tentar se logar com email completo e senha em branco")
    public void usuario_tentar_se_logar_com_email_completo_e_senha_em_branco() {
        this.myAccountPage.preencheFormularioLogin("fulano@bol.com.br", "");
    }

    @Entao("usuario continuar na pagina de login com a seguinte mensagem de erro {mensagem}")
    public void usuario_continuar_na_pagina_de_login_com_a_seguinte_mensagem_de_erro(String mensagem) {
        assertEquals(mensagem, myAccountPage.getSenhaEmBranco());
    }

   @Dado("que o usuario acesse a telo MyAccount")
   public void que_o_usuario_acesse_a_telo_my_account() { this.myAccountPage = new TelaMyAccountPage(); }

   @Quando("usuario tentar se logar com email em branco e senha correta")
   public void usuario_tentar_se_logar_com_email_em_branco_e_senha_correta() {
       this.myAccountPage.preencheFormularioLogin("","Chorando_manga");
    }

   @Entao("usuario continua na mesma tela de login que retorna a seguinte mensagem {mensagem}")
   public void usuario_continua_na_mesma_tela_de_login_que_retorna_a_seguinte_mensagem(String mensagem) {
       assertEquals(mensagem, myAccountPage.getEmailemBranco);
   }
    /*@Dado("que o usuario acesse a tela MyAccount")
    public void que_o_usuario_acesse_a_tela_my_account() { this.myAccountPage = new TelaMyAccountPage(); }

    @Quando("usuario tentar se logar passado numeros no campo email e senha correta")
    public void usuario_tentar_se_logar_passado_numeros_no_campo_email_e_senha_correta() {
        this.myAccountPage.preencheFormularioLogin("555555882523", "Chorando_manga");
    }

    @Entao("o usuario continuar na mesma tela com a seguinte mensagem {string}")
    public void o_usuario_continuar_na_mesma_tela_com_a_seguinte_mensagem(String string) {

    }

    @Quando("usuario tentar se logar passando nome com sobrenome no campo email")
    public void usuario_tentar_se_logar_passando_nome_com_sobrenome_no_campo_email() {
        this.myAccountPage.preencheFormularioLogin("Fulano raimundo cruz", "Chorando_manga");
    }

    @Entao("a seguinte mensagem sera retornada {string}")
    public void a_seguinte_mensagem_sera_retornada(String string) {

    }

    @Dado("que um usuario ja castrado acessa a tela MyAccount")
    public void que_um_usuario_ja_castrado_acessa_a_tela_my_account() { this.myAccountPage = new TelaMyAccountPage(); }

    @Quando("usuario ja cadastrado tentar se logar novamente")
    public void usuario_ja_cadastrado_tentar_se_logar_novamente() {
        this.myAccountPage.preencheFormularioLogin("gato.lino@bol.com.br", "Amora58742247josa");
        this.myAccountPage.preencheFormularioLogin("gato.lino@bol.com.br", "Amora58742247josa");
    }
    @Entao("devera retornar a seguinte mensagem {string}")
    public void devera_retornar_a_seguinte_mensagem(String string) {

    }*/


}
