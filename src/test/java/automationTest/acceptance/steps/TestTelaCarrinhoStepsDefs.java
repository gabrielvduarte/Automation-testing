package automationTest.acceptance.steps;

import automationTest.E2E.pages.HomePage;
import automationTest.E2E.pages.TelaCarrinhoPage;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class TestTelaCarrinhoStepsDefs {

    private TelaCarrinhoPage telaCarrinho;
    private HomePage homepage;

    @After
    public void after(){
        telaCarrinho.fecharTela();
    }

    @Dado("que usuario acesse a pagina inicial")
    public void que_usuario_acesse_a_pagina_inicial() {
        homepage = new HomePage(null);
    }

    @Quando("o usuario clica no botão adicionar a cesta")
    public void o_usuario_clica_no_botão_adicionar_a_cesta(){
        homepage.clicaBtnAddProdutoCarrinho();
    }

    @Entao("o numero de produtos no carrinho aumenta")
    public void O_numero_de_produtos_no_carrinho_aumenta(){
        Assert.assertFalse("0 items".equals(telaCarrinho.pegaQTDItemCarrinho()));
    }

    @Entao("aumenta o valor final do carrinho")
    public void aumenta_o_valor_final_do_carrinho(){
        Assert.assertFalse("0.00".equals(telaCarrinho.pegaValorTotalCarrinho()));
    }

    @Entao("aparecera a mensagem do produto excluido do carrinho")
    public void apareceraAMensagemDoProdutoExcluidoDoCarrinho() throws InterruptedException {
        Assert.assertFalse("Return To Shop",equals(telaCarrinho.mensagemCarrinhoVazio()));
    }

    @Quando("remover o produto adicionado no carrinho")
    public void removerOProdutoAdicionadoNoCarrinho() {
        telaCarrinho.aguardaCarregarTela(15);
        telaCarrinho.clicaBtnRemoveItemCarrinho("");
        System.out.println("Deu certo");
    }

    @Quando("ao acessar a tela de carrinho")
    public void ao_Acessar_A_Tela_De_Carrinho() {
        homepage.aguardaCarregarTela(100);
        telaCarrinho = homepage.acessaCarrinhoAposSelecionarProdutoDefault();
    }

    @E("retorna a pagina principal")
    public void retorna_a_pagina_principal(){
        homepage = telaCarrinho.acessaTelaHome();
    }

    @Entao("a quantidade de produtos nao sofre alteracao")
    public void a_quantidade_de_produtos_nao_sofre_alteracao(){
        Assert.assertFalse("0 items".equals(telaCarrinho.pegaQTDItemCarrinho()));
    }


    @E("ao Acessar a tela de carrinho novamente")
    public void aoAcessarATelaDeCarrinhoNovamente() {
        telaCarrinho = homepage.acessaCarrinhoAposSelecionarProdutoPeloSpan();
    }

    @Quando("recarrega a pagina")
    public void recarregaAPagina() {
        homepage.recarregaApagina();
    }

    @Entao("aumenta o valor final do span carrinho")
    public void aumentaOValorFinalDoSpanCarrinho() {
        Assert.assertFalse("0.00".equals(homepage.pegaValorPeloSpan()));
        homepage.fecharTela();
    }
}
