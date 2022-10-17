package pageElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageAction.EditAccountAction;
import stepDefinitions.CommonStep;

public class EditAccountElement {
    WebDriver driver;

    @FindBy(name = "accountno")
    public WebElement accountNumber;

    @FindBy(name = "AccSubmit")
    public WebElement submit;

    public EditAccountElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
