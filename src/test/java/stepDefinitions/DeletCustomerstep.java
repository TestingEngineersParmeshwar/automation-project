package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageAction.DeletCustomerAction;

public class DeletCustomerstep {
    WebDriver driver;
    DeletCustomerAction deletCustomerAction;

    public DeletCustomerstep(CommonStep commonStep, DeletCustomerAction deletCustomerAction) {
        this.driver= commonStep.getDriver();
        this.deletCustomerAction = deletCustomerAction;
    }

    @Given("open a application in url browser")
    public void open_a_application_in_url_browser() {
        driver.get("https://demo.guru99.com/V1/html/DeleteCustomerInput.php");

    }
    @When("enter the cutomerId is {string} and click the submit button")
    public void enter_the_cutomer_id_is_and_click_the_submit_button(String emailids) throws InterruptedException {

        deletCustomerAction.customerid(emailids);
    }
    @Then("delete customer should be sucessful")
    public void delete_customer_should_be_sucessful() {
    }

}
