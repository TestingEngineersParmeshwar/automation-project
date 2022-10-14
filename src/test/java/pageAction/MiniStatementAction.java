package pageAction;

import org.openqa.selenium.WebDriver;
import pageElement.MiniStatementElement;
import stepDefinitions.CommonStep;

public class MiniStatementAction {


    private WebDriver driver;
    MiniStatementElement miniStatementElements;

    public MiniStatementAction(CommonStep commonSteps) {
        this.driver = commonSteps.getDriver();
        this.miniStatementElements = new MiniStatementElement(driver);
    }

    public void accountNo(String accountNo) throws InterruptedException {
        miniStatementElements.accountNo.sendKeys(accountNo);
        Thread.sleep(3000);
    }

    public void clickOnButton() throws InterruptedException {
        miniStatementElements.submit.click();
        Thread.sleep(3000);

    }
}

