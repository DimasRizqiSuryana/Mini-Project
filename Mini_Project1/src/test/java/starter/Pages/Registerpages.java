package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Registerpages extends PageObject {

    private By registerField(){
        return By.xpath("//a[.='Register']");
    }

    private By newUsernameField() {
        return By.xpath("//form[@class='v-form']/div[1]//input[1]");
    }

    private By newEmailField() {
        return By.xpath("//form[@class='v-form']/div[2]//input[1]");
    }

    private By newPasswordField() {
        return By.xpath("//div[3]//input[1]");
    }

    private By registerButton() {
        return By.xpath("//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }

    ///negativetest

    private By usernameRequired() {
        return By.xpath("//div[contains(text(),'fullname is required')]");
    }

    private By emailRequired() {
        return By.xpath("//div[contains(text(),'email is required')]");
    }

    private By passwordRequired() {
        return By.xpath("//div[contains(text(),'password is required')]");
    }

    @Step
    public void clickRegisterField() {
        $(registerField()).click();
    }

    @Step
    public boolean validateOnTheRegisterPage() {
        return $(registerButton()).isDisplayed();
    }

    @Step
    public void inputNewUserName(String newUsername) {
        $(newUsernameField()).type(newUsername);
    }

    @Step
    public void inputNewEmail(String newEmail) {
        $(newEmailField()).type(newEmail);
    }

    @Step
    public void inputNewPassword(String newPassword) {
        $(newPasswordField()).type(newPassword);
    }

    @Step
    public void clickRegisterButton() {
        $(registerButton()).click();
    }

    @Step
    public boolean validateDirectToLoginPage(){
        return $(registerField()).isDisplayed();
    }

    ///negativetest
    @Step
    public void inputExistEmail(String existEmail){
        $(newEmailField()).type(existEmail);
    }

    @Step
    public void inputNewEmail1(String newEmail1) {
        $(newEmailField()).type(newEmail1);
    }

    @Step
    public void inputNewPassword1(String newPassword1) {
        $(newPasswordField()).type(newPassword1);
    }

    @Step
    public boolean validateUsernameRequired(){
        return $(usernameRequired()).isDisplayed();
    }

    @Step
    public boolean validateEmailRequired() {
        return $(emailRequired()).isDisplayed();
    }

    @Step
    public boolean validatePasswordRequired() {
        return $(passwordRequired()).isDisplayed();
    }
}
