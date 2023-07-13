package starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Loginpages extends PageObject {

    private By loginField(){
        return By.xpath("//header/div[1]/button[2]/span[1]/i[1]");
    }

    private By emailField(){
        return By.xpath("//form[@class='v-form']/div[1]//input[1]");
    }

    private By passwordField(){
        return By.xpath("//form[@class='v-form']/div[2]//input[1]");
    }

    private By loginButton(){
        return By.xpath("//body/div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]");
    }

    ///negatiftest
    private By canLoginWithoutEmail() {
        return By.xpath("//div[contains(text(),'email is required')]");
    }

    private By cantLoginWithoutPassword() {
        return By.xpath("//div[contains(text(),'password is required')]");
    }

    private By cantLoginWithIncorrectAccount() {
        return By.xpath("//div[contains(text(),'record not found')]");
    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public void clickLoginField() {
        $(loginField()).click();
    }

    @Step
    public boolean validateOnTheLoginPage() {
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }

    ///negatiftest

    @Step
    public boolean validateCantLoginWithoutEmail() {
        return $(canLoginWithoutEmail()).isDisplayed();
    }

    @Step
    public boolean validateCantLoginWithouutPassword() {
        return $(cantLoginWithoutPassword()).isDisplayed();
    }

    @Step
    public boolean validateCantLoginWithIncorrectAccount() {
        return $(cantLoginWithIncorrectAccount()).isDisplayed();
    }
}

