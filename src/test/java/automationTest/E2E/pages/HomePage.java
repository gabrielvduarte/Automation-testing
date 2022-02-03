package automationTest.E2E.pages;

import automationTest.E2E.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject {

    public String URL_HOME = "http://practice.automationtesting.in/";

    public HomePage(WebDriver browser){
        super(browser);
    }

    public boolean isPaginaAtual(){
        return browser.getCurrentUrl().equals(URL_HOME);
    }

    public void clicaBtnAddProdutoCarrinho(){
        clicaNoBotao("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[2]");
    }

    public TelaCarrinhoPage acessaCarrinhoAposSelecionarProdutoDefault(){
        clicaNoBotao("//*[@id=\"text-22-sub_row_1-0-2-2-0\"]/div/ul/li/a[3]");
        return new TelaCarrinhoPage(browser);
    }

    public TelaCarrinhoPage acessaCarrinhoAposSelecionarProdutoPeloSpan(){
        clicaNoBotao("//*[@id=\"wpmenucartli\"]/a");
        return new TelaCarrinhoPage(browser);
    }

    public ShopPage acessaCarrinhoAposSelecionarProdutoPeloSpanZerado(){
        clicaNoBotao("//*[@id=\"wpmenucartli\"]/a");
        return new ShopPage(browser);
    }

    public void recarregaApagina(){
        browser.findElement(By.xpath("//*[@id=\"site-logo\"]/a")).click();
    }

    public String pegaValorPeloSpan(){
        return browser.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a/span[2]")).getText();
    }
}
