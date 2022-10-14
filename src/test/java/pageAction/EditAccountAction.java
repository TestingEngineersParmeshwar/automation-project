package pageAction;

import org.openqa.selenium.WebDriver;
import pageElement.EditAccountElement;
import stepDefinitions.CommonStep;

public class EditAccountAction {
    WebDriver driver;
    EditAccountElement editAccountElements;

    public EditAccountAction(CommonStep commonStep) {
       this.driver = commonStep.getDriver();
       this.editAccountElements = new EditAccountElement(driver);

    }
    public void accountNumber(String  accountNumber) throws InterruptedException {
        editAccountElements.accountNumber.sendKeys(accountNumber);
        Thread.sleep(2000);
    }
    public void clickOnButton() throws InterruptedException {
        editAccountElements.submit.click();
        Thread.sleep(2000);
    }
}

