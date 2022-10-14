package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageAction.MiniStatementAction;

public class MiniStatmentstep {
    WebDriver driver;
    MiniStatementAction miniStatementAction;

    public MiniStatmentstep(CommonStep commonStep , MiniStatementAction miniStatementAction) {
        this.driver = commonStep.getDriver();
        this.miniStatementAction = miniStatementAction;
    }

    @Given("open application in url browsers")
    public void open_application_in_url_browsers() {
        driver.get("https://demo.guru99.com/V1/html/MiniStatementInput.php");
    }
    @When("enter the account no is {string}")
    public void enter_the_account_no_is(String accountnumber) throws InterruptedException {
        miniStatementAction.accountNo(accountnumber);
    }
    @When("click the submit buttons")
    public void click_the_submit_buttons() throws InterruptedException {
        miniStatementAction.clickOnButton();
    }
    @Then("mini statement open should be successful")
    public void mini_statement_open_should_be_successful() {
    }

}
