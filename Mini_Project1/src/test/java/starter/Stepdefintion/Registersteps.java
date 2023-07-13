package starter.Stepdefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.Pages.Registerpages;

public class Registersteps {

    @Steps
    Registerpages registerpages;

    @And("I click register field")
    public void clickRegisterFiel() {
        registerpages.clickRegisterField();
    }

    @And("I on the register page")
    public void onTheRegisterPage() {
        registerpages.validateOnTheRegisterPage();
    }

    @And("I input new username")
    public void inputNewUsername() {
        registerpages.inputNewUserName("cobaakunlima");
    }

    @And("I input new email")
    public void inputNewEmail() {
        registerpages.inputNewEmail("cobaakaunlima@mail.com");
    }

    @And("I input new password")
    public void inputNewPassword() {
        registerpages.inputNewPassword("123456");
    }

    @And("I click register button")
    public void clickRegisterButton() {
        registerpages.clickRegisterButton();
    }

    @Then("I should be redirected to login page")
    public void rediricetToLoginPgae() {
        registerpages.validateDirectToLoginPage();
    }

    ///negativetest

    @And("I input new username1")
    public void inputnewUername1() {
        registerpages.inputNewEmail1("");
    }

    @And("I input exist email")
    public void inputExistEmail() {
        registerpages.inputExistEmail("cobaakunempat@mail.com");
    }

    @And("I input new password1")
    public void inputNewPassword1() {
        registerpages.inputNewPassword1("456456");
    }

    @Then("I can't regist account")
    public void cantRegistAccount() {
        registerpages.validateUsernameRequired();
        registerpages.validateEmailRequired();
        registerpages.validatePasswordRequired();
    }
}
