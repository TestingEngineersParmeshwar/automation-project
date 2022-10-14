package pageAction;

import org.openqa.selenium.WebDriver;
import pageElement.DeletAccountElement;
import stepDefinitions.CommonStep;

public class DeletAccountAction {

    private WebDriver driver;

    DeletAccountElement deleteAccountElements;

    public DeletAccountAction(CommonStep commonSteps) {
        this.driver = commonSteps.getDriver();
        this.deleteAccountElements = new DeletAccountElement(driver);
    }
    public void accountNumber(String accountNumber) throws InterruptedException {
        deleteAccountElements.accountNumber.sendKeys(accountNumber);
        Thread.sleep(3000);
    }
    public void clickOnButton() throws InterruptedException {
        deleteAccountElements.submit.click();
        Thread.sleep(3000);
    }
}
