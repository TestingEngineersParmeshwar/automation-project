package pageElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizedStatementElement {
    WebDriver driver;

    @FindBy(name = "accountno")
    public WebElement accountNo;

    @FindBy(name = "fdate")
    public WebElement fromDate;

    @FindBy(name = "tdate")
    public WebElement toDate;

    @FindBy(name = "loweramt")
    public WebElement lowerLimit;

    @FindBy(name = "tranno")
    public WebElement numberOFTransaction;

    @FindBy(name = "AccSubmit")
    public WebElement submit;

    public CustomizedStatementElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
