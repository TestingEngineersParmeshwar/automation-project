package pageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageElement.NewAccountElement;
import stepDefinitions.CommonStep;

public class NewAccountAction {
    WebDriver driver;
    NewAccountElement  newAccountElement;

    public NewAccountAction(CommonStep commonStep ) {
        this.driver = commonStep.getDriver();
        this.newAccountElement = new NewAccountElement(driver);
    }

    public void enterCustomerId(String customerId) throws InterruptedException {

        newAccountElement.customerId.sendKeys(customerId);
        Thread.sleep(2000);
    }
    public void enterAccountType(String accountType) throws InterruptedException {

        newAccountElement.accountType.sendKeys(accountType);
        Thread.sleep(2000);

    }
    public void initialDeposit(String initialDeposit) throws InterruptedException {

        newAccountElement.initialsDeposit.sendKeys(initialDeposit);
        Thread.sleep(2000);

    }
    public void clickOnButton(){
        newAccountElement.submit.click();
    }
}
