package starter.Stepdefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Pages.Transactionpages;

public class Transactionsteps {

    @Steps
    Transactionpages transactionpages;

    @And("I click transaction button")
    public void clickTransactionButton() {
        transactionpages.clickTransactionButton();
    }

    @When("I on the transaction page")
    public void onTheTrasantionPage() {
        transactionpages.validateTransactionPage();
    }
}
