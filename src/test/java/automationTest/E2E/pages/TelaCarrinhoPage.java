package automationTest.E2E.pages;

import automationTest.E2E.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TelaCarrinhoPage extends PageObject {
    public TelaCarrinhoPage() {
        super(null);
    }

    public void clicaNoBotao(String button){
        browser.findElement(By.xpath(button)).click();
    }

    public String pegaElemento(String elemento){
       return browser.findElement(By.className(elemento)).getText();
    }
}
