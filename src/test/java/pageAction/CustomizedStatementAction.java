package pageAction;

import org.openqa.selenium.WebDriver;
import pageElement.CustomizedStatementElement;
import stepDefinitions.CommonStep;

public class CustomizedStatementAction {

    private WebDriver driver;

    CustomizedStatementElement customizedStatementElements;

    public CustomizedStatementAction(CommonStep commonSteps) {
        this.driver = commonSteps.getDriver();
        this.customizedStatementElements = new CustomizedStatementElement(driver);

    }
    public void accountNo(String accountNo){
        customizedStatementElements.accountNo.sendKeys(accountNo);
    }
    public void fromDate(String fromDate){
        customizedStatementElements.fromDate.sendKeys(fromDate);
    }
    public void toDate(String toDate){
        customizedStatementElements.toDate.sendKeys(toDate);
    }
    public void lowerLimit(String lowerLimit){
        customizedStatementElements.lowerLimit.sendKeys(lowerLimit);
    }
    public void numberOfTransaction(String numberOfTransaction) throws InterruptedException {
        customizedStatementElements.numberOFTransaction.sendKeys(numberOfTransaction);
        Thread.sleep(3000);
    }
    public  void clickOnButton() throws InterruptedException {
        customizedStatementElements.submit.click();
        Thread.sleep(2000);

    }
}


