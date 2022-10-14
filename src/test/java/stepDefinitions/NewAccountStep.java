package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageAction.NewAccountAction;

public class NewAccountStep {
    WebDriver driver;
    NewAccountAction newAccountAction;

    public NewAccountStep(CommonStep commonStep, NewAccountAction newAccountAction) {
        this.driver = commonStep.driver;
        this.newAccountAction = newAccountAction;
    }

    @Given("open the application a url browser")
    public void open_the_application_a_url_browser() {
        driver.get("https://demo.guru99.com/V1/html/addAccount.php");

    }
    @When("Enter customerId is {string}")
    public void enter_customer_id_is(String id) throws InterruptedException {
        newAccountAction.enterCustomerId(id);
    }
    @When("Select the account type is {string}")
    public void select_the_account_type_is(String saving) throws InterruptedException {
        newAccountAction.enterAccountType(saving);
    }

    @When("fil the initial deposit is {string}")
    public void fil_the_initial_deposit_is(String amount) throws InterruptedException {
        newAccountAction.initialDeposit(amount);
    }
    @When("Click on submit")
    public void click_on_submit() {
        newAccountAction.clickOnButton();
    }
    @Then("Open the New account should be successful")
    public void open_the_new_account_should_be_successful() {
    }

}
