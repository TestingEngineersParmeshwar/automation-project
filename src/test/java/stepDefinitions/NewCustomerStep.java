package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageAction.NewCustomerAction;

public class NewCustomerStep {
    WebDriver driver;
    public NewCustomerAction newCustomerAction;

    public NewCustomerStep(CommonStep commonStep, NewCustomerAction newCustomerAction) {
        this.driver = commonStep.getDriver();
        this.newCustomerAction = newCustomerAction;
    }

    @Given("Open add customer url in browser")
    public void open_add_customer_url_in_browser() {
         driver.get("https://demo.guru99.com/V1/html/addcustomerpage.php");

    }
    @When("add the customer name {string}")
    public void add_the_customer_name(String name) {
        newCustomerAction.customername(name);

    }
    @When("add date of customer {string}")
    public void add_date_of_customer(String date) {
        newCustomerAction.date(date);
    }
    @When("add address of customer {string}")
    public void add_address_of_customer(String address) {
        newCustomerAction.adress(address);
    }
    @When("add customer city {string}")
    public void add_customer_city(String city) {
        newCustomerAction.city(city);
    }
    @When("add state {string}")
    public void add_state(String state) {
        newCustomerAction.state(state);
    }
    @When("add pin {string}")
    public void add_pin(String pin) {
        newCustomerAction.Pin(pin);
    }
    @When("add telephone number {string}")
    public void add_telephone_number(String number) {
        newCustomerAction.telephone(number);
    }
    @When("Email id {string}")
    public void email_id(String email) {
        newCustomerAction.email_id(email);
    }
    @Then("add customer should be successful")
    public void add_customer_should_be_successful() {
    }

}
