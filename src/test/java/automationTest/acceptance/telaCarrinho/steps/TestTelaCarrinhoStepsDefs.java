package automationTest.acceptance.telaCarrinho.steps;

import automationTest.acceptance.telaHome.HomePage;
import automationTest.acceptance.telaShop.ShopPage;
import automationTest.acceptance.telaCarrinho.pages.TelaCarrinhoPage;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class TestTelaCarrinhoStepsDefs {

    private TelaCarrinhoPage telaCarrinho;
    private HomePage homepage;
    private ShopPage shopPage;

    @After
    public void after(){
        if(homepage == null && !homepage.isPaginaAtual()) {
            telaCarrinho.fecharTela();
        }else {
            homepage.fecharTela();
        }
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

    @Entao("aparecera a mensagem da cesta vazia")
    public void apareceraAMensagemDaCestaVazia() throws InterruptedException {
        Assert.assertFalse("Your basket is currently empty.",equals(telaCarrinho.mensagemCarrinhoVazio()));
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


    @Quando("recarrega a pagina")
    public void recarregaAPagina() {
        homepage.recarregaApagina();
    }

    @Entao("aumenta o valor final do span carrinho")
    public void aumentaOValorFinalDoSpanCarrinho() {
        Assert.assertFalse("0.00".equals(homepage.pegaValorPeloSpan()));
    }

        @Entao("o usuario e redirecionado a tela shop")
        public void oUsuarioERedirecionadoATelaShop() {
            Assert.assertTrue(shopPage.isPaginaAtual());
        }

    @E("ao Acessar a tela de carrinho pelo span")
    public void aoAcessarATelaDeCarrinhoPeloSpan() {
        telaCarrinho = homepage.acessaCarrinhoAposSelecionarProdutoPeloSpan();
    }

    @Quando("ao Acessar a tela de carrinho pelo span zerado")
    public void aoAcessarATelaDeCarrinhoPeloSpanZerado() {
        shopPage = homepage.acessaCarrinhoAposSelecionarProdutoPeloSpanZerado();
    }

    @E("e adiciona manualmente zero produtos")
    public void eAdicionaManualmenteZeroProdutos() {
        telaCarrinho.limpaInput();
        telaCarrinho.adicionaProdutosManualmente("0");
    }

    @E("atualiza sua cesta")
    public void atualizaSuaCesta() throws InterruptedException {
        telaCarrinho.atualizaCesta();
    }

    @E("adiciona cupom")
    public void adicionaCupom()throws InterruptedException {
        telaCarrinho.adicionaCupom("krishnasakinala");
    }

    @E("aplica o cupom")
    public void aplicaOCupom() {
        telaCarrinho.aplicaCupom();
    }

    @Entao("o cupom e exibido na tela")
    public void oCupomEExibidoNaTela() {
       Assert.assertFalse(telaCarrinho.verificaSeTemOElemento("Coupon: krishnasakinala"));
    }

    @E("e adiciona manualmente a quantidade de produtos")
    public void eAdicionaManualmenteAQuantidadeDeProdutos() {
        telaCarrinho.limpaInput();
        telaCarrinho.adicionaProdutosManualmente("2");
    }
}
