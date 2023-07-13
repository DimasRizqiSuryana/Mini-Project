package starter.Stepdefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Pages.Chooseproductpages;
import starter.Pages.Homepages;

public class Chooseproductsteps {

    @Steps
    Chooseproductpages chooseproductpages;

    @Steps
    Homepages homepages;
    @Given("I succsessfully login alta-shop.vercel.app account")
    public void succsessfullyLogin() {
        homepages.validateOnTheHomepage();
    }

    @When("I click detail button to see detail product")
    public void clickDetailButtonToSeeDetailProduct() {
        chooseproductpages.clickDetailButtonToSeeDetailProduct();
    }


    @And("I click Altashop field to back home page to buy product")
    public void clickButtonToBackHomePage() {
        chooseproductpages.clickAltashopField();
    }

    @And("I click buying button at aitem")
    public void clickBuyingButtom() {
        chooseproductpages.clickBuyingButton();
    }

    @Then("I succsessfully add item")
    public void succsessfullyAddItem() {
        chooseproductpages.validateSuccsessAddItem();
    }
}
