package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageAction.LoginAction;

public class LoginStep {

  WebDriver driver;
  public LoginAction loginAction;

  public LoginStep(CommonStep commonStep,LoginAction loginAction) {
    this.driver = commonStep.getDriver();
    this.loginAction = loginAction;
  }

    @Given("i open application guru99 in browser")
    public void i_open_application_guru99_in_browser() {
        driver.get("https://demo.guru99.com/V1/");

    }
    @When("i enter username {string}, password {string} click to login")
    public void i_enter_username_password_click_to_login(String username, String password) {
    loginAction.username(username);
    loginAction.password(password);

    }
    @Then("login is successful")
    public void login_is_successful() {

    }


}
