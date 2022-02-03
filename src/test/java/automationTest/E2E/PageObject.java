package automationTest.E2E;

import automationTest.E2E.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageObject {

    public WebDriver browser;

    public PageObject(WebDriver Browser) {
        if (Browser == null) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            browser = new ChromeDriver();
            browser.navigate().to("http://practice.automationtesting.in/");
        }else{
            browser = Browser;
        }
    }

    public HomePage acessaTelaHome(){
        browser.findElement(By.xpath("//*[@id=\"site-logo\"]/a")).click();
        return new HomePage(browser);
    }

    public void clicaNoBotao(String button){
        browser.findElement(By.xpath(button)).click();
    }

    public void aguardaCarregarTela(Integer tempoCarregamentoSegundos){
        browser.manage().timeouts().implicitlyWait(tempoCarregamentoSegundos, TimeUnit.SECONDS);
    }

    public void fecharTela(){
        browser.quit();
    }
}
