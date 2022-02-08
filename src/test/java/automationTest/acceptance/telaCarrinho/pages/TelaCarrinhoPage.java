package automationTest.acceptance.telaCarrinho.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;
public class TelaCarrinhoPage extends PageObject {

    public TelaCarrinhoPage(WebDriver browser) {
        super(browser);
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
        return browser.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[2]/p[1]")).getText();
    }

    public void adicionaProdutosManualmente(String produtos){
        browser.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input")).sendKeys(produtos);
    }

    public void adicionaCupom(String cupom) throws InterruptedException {
        Thread.sleep(1500);
        browser.findElement(By.xpath("//*[@id=\"coupon_code\"]")).sendKeys(cupom);
    }

    public void aplicaCupom(){
        clicaNoBotao("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[2]/td/div/input[2]");
    }

    public String pegaQTDItemCarrinho(){
       return browser.findElement(By.cssSelector("#page-34 > div > div.woocommerce > form > table > tbody > tr.cart_item > td.product-quantity > div > input")).getCssValue("value");
    }

    public String pegaValorTotalCarrinho(){
        return browser.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[6]/span")).getText();
    }

    public void atualizaCesta() throws InterruptedException {
        Thread.sleep(1500);
        clicaNoBotao("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[2]/td/input[1]");
    }

    public void limpaInput(){
        browser.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input")).clear();
    }

    public boolean verificaSeTemOElemento(String elemento){
       return browser.getPageSource().contains(elemento);
    }
}
