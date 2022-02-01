//package automationTest.E2E;
//
//import automationTest.E2E.pages.TelaCarrinhoPage;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//public class TestCarrinhoE2E {
//    public TelaCarrinhoPage telaCarrinho;
//    String texto1;
//    String texto2;
//
//    @Before
//    public void beforeEach(){
//        telaCarrinho = new TelaCarrinhoPage();
//    }
//
//    @After
//    public void afterEach(){
//        telaCarrinho.fecharTela();
//    }
//    @Test
//    public void adicionarprodutoAoCarrinho(){
//        texto1 = telaCarrinho.pegaQTDItemCarrinho();
//        telaCarrinho.clicaBtnAddProdutoCarrinho();
//        texto2 = telaCarrinho.pegaQTDItemCarrinho();
//        Assert.assertFalse(texto1,equals(texto2));
//    }
//    @Test
//    public void removerProdutosDoCarrinho(){
//        telaCarrinho.clicaBtnAddProdutoCarrinho();
//        texto1 = telaCarrinho.pegaQTDItemCarrinho();
//        telaCarrinho.clicaBtnItemCarrinho();
//        telaCarrinho.clicaBtnRemoveItemCarrinho("");
//        texto2 = telaCarrinho.pegaQTDItemCarrinho();
//        Assert.assertFalse(texto1, equals(texto2));
//    }
//    @Test
//    public void usuarioSaiERetornaAoCarrinho(){
//        telaCarrinho.clicaBtnAddProdutoCarrinho();
//        telaCarrinho.clicaBtnItemCarrinho();
//        texto1 = telaCarrinho.pegaQTDItemCarrinho();
//        telaCarrinho.acessaTelaHome();
//        telaCarrinho.clicaBtnItemCarrinho();
//        texto2 = telaCarrinho.pegaQTDItemCarrinho();
//        telaCarrinho.aguardaCarregarTela(5);
//        Assert.assertTrue(texto1,equals(texto2));
//    }
//}
