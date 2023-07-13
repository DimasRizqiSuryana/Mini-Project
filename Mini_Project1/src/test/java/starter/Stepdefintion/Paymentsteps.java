package starter.Stepdefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.Pages.PaymentPage;

public class Paymentsteps {

    @Steps
    PaymentPage paymentPage;

    @And("I click pay button")
    public void clickPayButton() {
        paymentPage.clickkPayButton();
    }

    @Then("I succsessfully pay my item")
    public void succsessfullyPayItem() {
        paymentPage.validateOnTheTransactionPage();
    }
}
