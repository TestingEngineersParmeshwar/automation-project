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

    public void username(String username){

        loginElement.username.sendKeys(username);
    }
     public void password(String password){
        loginElement.password.sendKeys(password);
     }
}
