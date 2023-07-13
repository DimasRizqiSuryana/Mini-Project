package test.automation.stepdefinitons;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.automation.pages.ProductListScreen;

public class ProduckListSteps {

    ProductListScreen productListScreen = new ProductListScreen();

    @When("I click button beli")
    public void iClickButtonBeli() {
        productListScreen.clickButtonBeli();
    }

    @Then("Product successfully added to cart")
    public void productSuccessfullyAddedToCart() {
        productListScreen.verifyCartAdded();
    }
}
