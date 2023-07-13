package starter.Stepdefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Pages.Homepages;
import starter.Pages.Logoutpages;

public class Logoutsteps {

    @Steps
    Logoutpages logoutpages;

    @Steps
    Homepages homepages;

    @Given("I open altahsop with login condition")
    public void openAltashopWithLoginCondition() {
        homepages.validateOnTheHomepage();
    }

    @When("I click user button")
    public void clickUserButton() {
        logoutpages.clickUserButtun();
    }

    @And("I click Logout button")
    public void clickLogoutButton() {
        logoutpages.clickLogoutButton();
    }

    @Then("I succsessfully logout")
    public void succsessfullyLogout() {
        logoutpages.validateAccountWasLogout();
    }
}
