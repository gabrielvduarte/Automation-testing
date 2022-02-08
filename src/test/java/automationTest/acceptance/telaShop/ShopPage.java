package automationTest.acceptance.telaShop;


import automationTest.acceptance.telaCarrinho.pages.PageObject;
import automationTest.acceptance.telaCarrinho.pages.TelaCarrinhoPage;
import org.openqa.selenium.WebDriver;

public class ShopPage extends PageObject {
    public String URL_SHOP = "http://practice.automationtesting.in/shop/";

    public ShopPage(WebDriver Browser) {
        super(Browser);
    }

    public boolean isPaginaAtual(){
        return browser.getCurrentUrl().equals(URL_SHOP);
    }

    public void acessarAPaginaShop(){
        clicaNoBotao("//*[@id=\"menu-item-40\"]/a");
    }

    public void clicaBtnAddProdutoCarrinho(){
        clicaNoBotao("//*[@id=\"content\"]/ul/li[3]/a[2]");
    }

    public TelaCarrinhoPage acessaCarrinhoPelaPaginaShop(){
        clicaNoBotao("//*[@id=\"wpmenucartli\"]/a");
        return new TelaCarrinhoPage(browser);
    }
}
