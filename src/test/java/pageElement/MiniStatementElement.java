package pageElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniStatementElement {
    WebDriver driver;

    @FindBy(name = "accountno")
    public WebElement accountNo;

    @FindBy(name = "AccSubmit")
    public WebElement submit;

    public MiniStatementElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
