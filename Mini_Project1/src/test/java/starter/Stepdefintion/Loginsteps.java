package starter.Stepdefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Pages.Homepages;
import starter.Pages.Loginpages;

public class Loginsteps {

    @Steps
    Loginpages loginpages;

    @Steps
    Homepages homepages;

    @Given("I open alta-shop.vercel.app")
    public void openAltaShopPage(){
        loginpages.openPage();
    }

    @When("I click login field")
    public void clickLoginField(){
        loginpages.clickLoginField();
    }

    @And("I on the login page")
    public void onTheLoginPage(){
        loginpages.validateOnTheLoginPage();
    }

    @And("I input valid email")
    public void inputValidEmail(){
        loginpages.inputEmail("someone@mail.com");
    }

    @And("I input valid password")
    public void inputValidPassword(){
        loginpages.inputPassword("123123");
    }

    @And("I click login button")
    public void clickLoginButton(){
        loginpages.clickLoginButton();

    }

    @Then("I succsessfully login")
    public void succsessLogin(){
        homepages.validateOnTheHomepage();
    }

    ////negatiftest

    @And("I input invalid email")
    public void inputInvalidEmail() {
        loginpages.inputEmail("cobaakun@mail.com");
    }

    @And("I input invalid password")
    public void inputInvalidPassword() {
        loginpages.inputPassword("coba123");
    }

    @Then("I can't login to altasop account")
    public void cantLoginToAltasopAccount() {
        loginpages.validateCantLoginWithoutEmail();
        loginpages.validateCantLoginWithouutPassword();
        loginpages.validateCantLoginWithIncorrectAccount();
    }
}
