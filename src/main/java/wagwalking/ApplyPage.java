package wagwalking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ApplyPage extends BasePage {

    public ApplyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[name=\"password\"")
    private WebElement passwordField;

    @FindBy(css = "input[name=firstName]")
    private WebElement firstNameFields;

    @FindBy(css = "input[name=lastName]")
    private WebElement lastNameFields;

    @FindBy(css = "input[name=phone]")
    private WebElement phoneFields;



    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }
    public String getEmail(){
        wait.until(ExpectedConditions.visibilityOf(emailField));
        String email = emailField.getAttribute("value");
        return email;
    }


    public void inputFirstName(String firstName){
        firstNameFields.sendKeys(firstName);
    }
    public String getFirstName(){
        wait.until(ExpectedConditions.visibilityOf(firstNameFields));
        String firstName = firstNameFields.getAttribute("value");
        return firstName;
    }


    public void inputLastName(String lastName) {
        lastNameFields.sendKeys(lastName);
    }
    public String getLastName(){
        wait.until(ExpectedConditions.visibilityOf(lastNameFields));
        String lastName = lastNameFields.getAttribute("value");
        return lastName;
    }


    public void inputPhone(String phone) {
        phoneFields.sendKeys(phone);
    }
    public String getPhone(){
        wait.until(ExpectedConditions.visibilityOf(phoneFields));
        String phone = phoneFields.getAttribute("value");
        return phone;
    }






//    @FindBy(css = "input")
//    private List<WebElement> inputFields;
//
//    public void inputEmail(String email){
//        inputFields.get(0).sendKeys(email);
////        emailField.sendKeys(email);
//    }
//    public String getEmail(){
//        wait.until(ExpectedConditions.visibilityOf(inputFields.get(0)));
//        String  email = inputFields.get(0).getAttribute("Value");
//        return email;
//    }
//
//    public void inputPassword(String password){
//        passwordField.sendKeys(password);
//    }

}
