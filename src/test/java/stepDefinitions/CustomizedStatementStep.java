package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageAction.CustomizedStatementAction;

public class CustomizedStatementStep {

    WebDriver driver;
    CustomizedStatementAction customizedStatementAction;

    public CustomizedStatementStep(CommonStep commonStep, CustomizedStatementAction customizedStatementAction) {
        this.driver = commonStep.getDriver();
        this.customizedStatementAction = customizedStatementAction;
    }

    @Given("Open a application in url browser")
    public void open_a_application_in_url_browser() {
        driver.get("https://demo.guru99.com/V1/html/CustomisedStatementInput.php");
    }
    @When("Enter the account number is {string}")
    public void enter_the_account_number_is(String accountnumber) {
        customizedStatementAction.accountNo(accountnumber);
    }
    @When("Enter from date {string}")
    public void enter_from_date(String fromdate) {
        customizedStatementAction.fromDate(fromdate);
    }
    @When("Enter To date {string}")
    public void enter_to_date(String todate) {
        customizedStatementAction.toDate(todate);
    }
    @When("Enter amount lower limit {string}")
    public void enter_amount_lower_limit(String amount) {
        customizedStatementAction.lowerLimit(amount);
    }
    @When("enter the number of transaction is {string}")
    public void enter_the_number_of_transaction_is(String number) throws InterruptedException {
        customizedStatementAction.numberOfTransaction(number);
    }
    @Then("click on the submit buttons")
    public void click_on_the_submit_buttons() throws InterruptedException {
        customizedStatementAction.clickOnButton();
    }

}
