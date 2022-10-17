package pageAction;

import org.openqa.selenium.WebDriver;
import pageElement.DeletCustomerElement;
import stepDefinitions.CommonStep;

public class DeletCustomerAction {
    WebDriver driver;
    DeletCustomerElement deletCustomerElement;

    public DeletCustomerAction(CommonStep commonStep) {
        this.driver = commonStep.getDriver();
        this.deletCustomerElement = new DeletCustomerElement(driver);
    }

     public void customerid(String emailid) throws InterruptedException {

        deletCustomerElement.customerId.sendKeys(emailid);
         Thread.sleep(3000);

         deletCustomerElement.submit.click();
        Thread.sleep(3000);
     }
}
