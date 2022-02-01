package automationTest.E2E.pages;

import automationTest.E2E.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class TelaCarrinhoPage extends PageObject {

    String URL_TELA_CARRINHO = "http://practice.automationtesting.in/basket/";

    public TelaCarrinhoPage(WebDriver browser) {
        super(browser);
    }

    public void clicaBtnItemCarrinho(){
        browser.findElement(By.className("wpmenucart-contents")).click();
    }

    public void clicaBtnRemoveItemCarrinho(String linha){
        if (Objects.equals(linha, "")){
            browser.findElement(By.cssSelector("#page-34 > div > div.woocommerce > form > table > tbody > tr.cart_item > td.product-remove > a")).click();
        } else {
            browser.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td["+ linha +"]/a")).click();
        }
    }

    public String mensagemCarrinhoVazio() throws InterruptedException {
        Thread.sleep(1500);
        return browser.findElement(By.className("return-to-shop")).getText();
    }

    public String pegaQTDItemCarrinho(){
       return browser.findElement(By.cssSelector("#page-34 > div > div.woocommerce > form > table > tbody > tr.cart_item > td.product-quantity > div > input")).getCssValue("value");
    }

    public String pegaValorTotalCarrinho(){
        return browser.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[6]/span")).getText();
    }

    public void acessarTelaCarrinho(){
        browser.navigate().to(URL_TELA_CARRINHO);
    }
}
