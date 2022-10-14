package pageAction;

import org.openqa.selenium.WebDriver;
import pageElement.EditCustomerElement;
import stepDefinitions.CommonStep;

public class EditCustomerAction {
    private WebDriver driver;

    EditCustomerElement editCustomerElements;

    public EditCustomerAction(CommonStep commonStep) {
        this.driver = commonStep.getDriver();
        this.editCustomerElements = new EditCustomerElement(driver);
    }

    public void enterCustomerId(String customerId)
    {
        editCustomerElements.customerId.sendKeys(customerId);
    }
    public void clickOnButton(){

        editCustomerElements.submit.click();
    }
}

