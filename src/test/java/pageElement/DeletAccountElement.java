package pageElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletAccountElement {
    WebDriver driver;

    @FindBy(name = "accountno")
    public WebElement accountNumber;

    @FindBy(name = "AccSubmit")
    public WebElement submit;

    public DeletAccountElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}