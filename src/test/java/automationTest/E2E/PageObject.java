package automationTest.E2E;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject {

    public WebDriver browser;

    public PageObject(WebDriver Browser) {
        if (Browser == null) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            browser = new ChromeDriver();
            browser.navigate().to("http://practice.automationtesting.in/");
        }else{
            browser = Browser;
        }
    }

    public void facharTela(){
        browser.quit();
    }
}
