package pageAction;

import org.openqa.selenium.WebDriver;
import pageElement.LoginElement;
import stepDefinitions.CommonStep;

public class LoginAction {
   private WebDriver driver;
public LoginElement loginElement;

    public LoginAction(CommonStep commonStep) {
        this.driver = commonStep.getDriver();
        this.loginElement = new LoginElement(driver);

    }

    public void username(String username) throws InterruptedException {

        loginElement.username.sendKeys(username);
        Thread.sleep(2000);
    }
     public void password(String password) throws InterruptedException {
        loginElement.password.sendKeys(password);
        Thread.sleep(2000);
     }
     public void click() throws InterruptedException {
        loginElement.click.click();
        Thread.sleep(3000);
     }
}
