package automationTest.acceptance.telaMyAccount.pages;

import automationTest.acceptance.telaCarrinho.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class TelaMyAccountPage extends PageObject {

    private static final String URL_FORMULARIO_CADASTRO = "http://practice.automationtesting.in/my-account/";

    public TelaMyAccountPage() {
        super(null);
        this.browser.navigate().to(URL_FORMULARIO_CADASTRO);
    }

    public void preencheFormularioLogin(String name, String password) {
        this.browser.findElement(By.id("username")).sendKeys(name);
        this.browser.findElement(By.id("password")).sendKeys(password);
        this.browser.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).submit();
    }

    public void preencheFormularioCadastro(String email, String password) {
        this.browser.findElement(By.id("reg_email")).sendKeys(email);
        this.browser.findElement(By.id("reg_password")).sendKeys(password);
        this.browser.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).submit();
    }

    public boolean verificaTexto() {
        return this.browser.getPageSource().contains("Login");
    }

    public String getNomeUsuarioLogado() {
        try {
            return browser.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]")).getText();
        } catch (NoSuchElementException e) {
            return null;
        }
    }
    //Formulario login
    public String getUsuarioNaoCadastrado() {
        System.out.println(browser.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]")).getText());
        return browser.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]")).getText();
    }
    public String getSenhaEmBranco() {
        return browser.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]")).getText();
    }
    public String getEmailemBranco () {
        return browser.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]")).getText();
    }

    public String getEmailcomNumeros() {
        return browser.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]")).getText();
    }

    public String getNomeNoCampoEmail() {
        return browser.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]")).getText();
    }

    public String getSenhaIncorreta() {
        return browser.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]")).getText();
    }
    //Formulario Registro

    public Boolean getSenhaFraca(String mensagem) {
        return browser.getPageSource().contains(mensagem);
    }

    public String getEmailemBrancoEsenha() {
        return browser.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]")).getText();
    }

    public String getNomeUsuarioLogadoComSucesso() {
        return browser.findElement(By.xpath("//*[@id=\"page-36\"]/div")).getText();
    }
}

