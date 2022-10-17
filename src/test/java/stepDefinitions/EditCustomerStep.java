package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageAction.EditCustomerAction;

public class EditCustomerStep {
    WebDriver driver;
    EditCustomerAction editCustomerAction;

    public EditCustomerStep(CommonStep commonStep , EditCustomerAction editCustomerAction) {
        this.driver = commonStep.getDriver();
        this.editCustomerAction = editCustomerAction;
    }

    @Given("Open the application in url browser")
    public void open_the_application_in_url_browser() {
        driver.get("https://demo.guru99.com/V1/html/EditCustomer.php");

    }
    @When("Enter customerId is {string} and click on sumbit button")
    public void enter_customer_id_is_and_click_on_sumbit_button(String custmid) throws InterruptedException {

        editCustomerAction.enterCustomerId(custmid);

        editCustomerAction.clickOnButton();
        Thread.sleep(3000);

    }
    @Then("customer edit form should be successful")
    public void customer_edit_form_should_be_successful() {

    }


}
