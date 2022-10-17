package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageAction.DeletAccountAction;

public class DeletAcoountStep {
    WebDriver driver;
    DeletAccountAction deletAccountAction;

    public DeletAcoountStep(CommonStep commonStep , DeletAccountAction deletAccountAction) {
        this.driver = commonStep.getDriver();
        this.deletAccountAction = deletAccountAction;
    }

    @Given("Open the applications in a url browser")
    public void open_the_applications_in_a_url_browser() {
        driver.get("https://demo.guru99.com/V1/html/deleteAccountInput.php");
    }
    @When("enter the account number is {string}")
    public void enter_the_account_number_is(String accountnumber) throws InterruptedException {
        deletAccountAction.accountNumber(accountnumber);
    }
    @When("click on the submit button")
    public void click_on_the_submit_button() throws InterruptedException {
        deletAccountAction.clickOnButton();
    }
    @Then("account delete should be successful")
    public void account_delete_should_be_successful() {
    }


}
