package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.DELETE_Category;
import starter.user.GET_Category;
import starter.user.GET_CategoryAll;
import starter.user.POST_Category;

public class User_Category_steps {

    @Steps
    POST_Category postCategory;

    @Steps
    GET_Category getCategory;

    @Steps
    GET_CategoryAll getCategoryAll;

    @Steps
    DELETE_Category deleteCategory;

    //POSTCategory
    ///POSITIVE

    @Given("I set POST category api endpoints")
    public void setPostCategoryApiEndpoints() {
        postCategory.setPostCategoryApiEndpoints();
    }

    @When("I send POST category HTTP request")
    public void sendPostCategoryHttpRequest() {
        postCategory.sendPostCategoryHttpRequest();
    }

    @Then("I receive valid data for new category posts")
    public void reciveValidDataNewCategoryPost() {
        postCategory.validateDataNewCategoryPost();
    }

    ///NEGATIVE

    @Given("I set typo POST category api endpoints")
    public void setInvalidPostCategoryApiEndpoints() {
        postCategory.setInvalidPostCategoryApiEndpoits();
    }

    //GET
    ///POSITIVE

    @Given("I set GET category api endpoints")
    public void setGetCategoryApiEndpoints() {
        getCategory.setGetCategoryApiEndPoints();
    }

    @When("I send GET category HTTP request")
    public void sendGetCategoryHttpRequest() {
        getCategory.sendGetCategoryHttpRequest();
    }

    ///NEGATIVE

    @Given("I set typo GET category api endpoints")
    public void setInvalidGetCategoryApiEndpoints() {
        getCategory.setInvalidGetCategoryApiEndpoints();
    }

    //GET
    ///POSITIVE

    @Given("I set GET all category api endpoints")
    public void setGetAllCategoryApiEndpoints() {
        getCategoryAll.setGetAllCategoryApiEndPoints();
    }

    @When("I send all category HTTP request")
    public void sendGetAllCategoryHttpRequest() {
        getCategoryAll.sendGetAllCategoryHttpRequest();
    }

    ///NEGATIVE

    @Given("I set typo GET all category api endpoints")
    public void setInvalidGetAllCategoryApiEndpoints() {
        getCategoryAll.setInvalidGetAllCategoryApiEndpoints();
    }

    //DELETE
    //POSITIVE

    @Given("I set DELETE category api endpoints")
    public void setDeleteCategoryApiEndpoints() {
        deleteCategory.setDeleteCategoryApiEndpoints();
    }

    @When("I send DELETE category HTTP request")
    public void sendDeleteCategoryHttpRequest() {
        deleteCategory.sendDeleteCategoryHttpRequest();
    }

    ///NEGAATIVE

    @Given("I set DELETE category to invalid api endpoints")
    public void setiInvalidDeleteCategoryEndpoints() {
        deleteCategory.setInvalidDeleteCategoryApiEndpoints();
    }
}
