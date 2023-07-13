package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GET_CategoryAll {

    protected String url = "https://altashop-api.fly.dev/api/";

    //POSITIVE

    @Step("I set GET all category api endpoints")
    public String setGetAllCategoryApiEndPoints() {
        return url + "categories";
    }

    @Step("I send GET category HTTP request")
    public void sendGetAllCategoryHttpRequest() {
        SerenityRest.given().when().get(setGetAllCategoryApiEndPoints());
    }

    //NEGATIVE

    @Step("I set typo GET all category api endpoints")
    public String setInvalidGetAllCategoryApiEndpoints() {
        return url + "categorie";
    }
}
