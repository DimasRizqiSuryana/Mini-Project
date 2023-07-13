package starter.Stepdefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Pages.Cartpages;
import starter.Pages.Homepages;

public class Cartsteps {

    @Steps
    Cartpages cartpages;

    @Steps
    Homepages homepages;

    @Given("I open and login altahsop account")
    public void openAndLoginAltashopAccount() {
        homepages.validateOnTheHomepage();
    }

    @When("I go to cart button")
    public void goToCartButton() {
        cartpages.clickCartButton();
    }

    @And("I on the cart page")
    public void onTheCartPage() {
        cartpages.validateOnTheCartPage();
    }

    @And("I click pluss button to increase quantity my item")
    public void clickPlussButtonToIncreaseItem() {
        cartpages.clickPlussButton();
    }

    @Then("I succsessfully increase my item")
    public void succsessfullyIncreaseItem() {
        cartpages.validateItemWasIncrease();
    }

    @And("I click mines button to decrease quantity my item")
    public void clickMinesButtonToDecreaseItem(){
        cartpages.clickMinesButton();
    }

    @Then("I succsessfully decrease my item")
    public void succsessfullyDecreaseItem() {
        cartpages.validateItemWasDecrease();
    }
}
