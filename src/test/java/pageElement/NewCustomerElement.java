package pageElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerElement {

    WebDriver driver;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "rad1")
    public WebElement radio;

    @FindBy(name = "dob")
    public WebDriver mmddyy;

    @FindBy(name = "addr")
    public WebElement address;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "state")
    public WebElement state;

    @FindBy(name = "pinno")
    public WebElement pin;

    @FindBy(name = "telephoneno")
    public WebElement telephone;

    @FindBy(name = "emailid")
    public WebElement email;

    @FindBy(name = "sub")
    public WebElement submit;

    public NewCustomerElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
