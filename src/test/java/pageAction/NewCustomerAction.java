package pageAction;

import org.openqa.selenium.WebDriver;
import pageElement.NewCustomerElement;
import stepDefinitions.CommonStep;

public class NewCustomerAction {
    WebDriver driver;
    NewCustomerElement newCustomerElement;

    public NewCustomerAction(CommonStep commonStep) {
        this.driver = commonStep.getDriver();
        this.newCustomerElement = new NewCustomerElement(driver);
    }
    public void customername(String name){
        newCustomerElement.name.sendKeys(name);
        newCustomerElement.radio.click();
    }
    public void date(String mmddyy){
        newCustomerElement.mmddyy.sendKeys(mmddyy);
    }
    public void adress(String address){
        newCustomerElement.address.sendKeys(address);
    }
    public void city(String city){
        newCustomerElement.city.sendKeys(city);

    }
    public void state(String state){
        newCustomerElement.state.sendKeys(state);
    }
    public void Pin(String pin){
        newCustomerElement.pin.sendKeys(pin);
    }
    public void telephone(String number){
        newCustomerElement.telephone.sendKeys(number);
    }
    public void email_id(String email){
        newCustomerElement.email.sendKeys(email);

        newCustomerElement.submit.click();
    }
}
