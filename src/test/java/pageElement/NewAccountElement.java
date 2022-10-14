package pageElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountElement {
    WebDriver driver;

    @FindBy(name = "cusid")
    public WebElement customerId;

    @FindBy(name = "selaccount")
    public WebElement accountType;

    @FindBy(name = "inideposit")
    public WebElement initialsDeposit;

    @FindBy(name = "button2")
    public  WebElement submit;

    public NewAccountElement( WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
