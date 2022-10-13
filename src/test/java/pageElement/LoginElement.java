package pageElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElement {
    WebDriver driver;


     @FindBy(xpath = "//input[@name='uid']")
      public WebElement username;

     @FindBy(xpath = "//input[@name='password']")
      public  WebElement password;


    public LoginElement(WebDriver driver) {
    this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
