package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonStep {
    WebDriver driver;
    public WebDriver getDriver(){
        return driver;
    }
    @Before
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }
    @After
    public void codeend() throws InterruptedException {
        driver.quit();
        Thread.sleep(2000);
    }

}
