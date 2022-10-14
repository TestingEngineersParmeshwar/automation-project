package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageAction.EditAccountAction;

public class EditAccountStep {
    WebDriver driver;
    EditAccountAction editAccountAction;

    public EditAccountStep(CommonStep commonStep, EditAccountAction editAccountAction) {
        this.driver = commonStep.getDriver();
        this.editAccountAction = editAccountAction;
    }

    @Given("Open the a applicatioin in url browser")
    public void open_the_a_applicatioin_in_url_browser() {
        driver.get("https://demo.guru99.com/V1/html/editAccount.php");
    }
    @When("Fill the account number {string}")
    public void fillTheAccountNumber(String accountnumber) throws InterruptedException {
        editAccountAction.accountNumber(accountnumber);
    }
    @Then("Click on submit button")
    public void click_on_submit_button() throws InterruptedException {
        editAccountAction.clickOnButton();
    }
}
