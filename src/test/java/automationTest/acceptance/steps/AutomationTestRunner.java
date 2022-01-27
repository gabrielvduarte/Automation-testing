package automationTest.acceptance.steps;

import automationTest.E2E.pages.TelaCarrinhoPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class AutomationTestRunner {
    public TelaCarrinhoPage telaCarrinho;

    @Before
    public void beforeEach(){
        telaCarrinho = new TelaCarrinhoPage();
    }

    @After
    public void afterEach(){
        telaCarrinho.fecharTela();
    }

    @Test

    public void adicionarprodutoAoCarrinho(){
        String texto1;
        String texto2;
        texto1 = telaCarrinho.pegaElemento("cartcontents");
        telaCarrinho.clicaNoBotao("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[2]");
        texto2 = telaCarrinho.pegaElemento("cartcontents");
        Assert.assertFalse(texto1,equals(texto2));
    }
}
