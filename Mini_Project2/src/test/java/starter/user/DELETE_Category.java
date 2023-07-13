package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DELETE_Category {

    protected String url = "https://altashop-api.fly.dev/api/";

    //POSITIVE

    @Step("I set DELETE category api endpoints")
    public String setDeleteCategoryApiEndpoints() {
        return url + "categories/1";
    }

    @Step("I send DELETE category HTTP request")
    public void sendDeleteCategoryHttpRequest() {
        SerenityRest.given().delete(setDeleteCategoryApiEndpoints());
    }

    //NEGATIVE

    @Step("I set DELETE category to invalid api endpoints")
    public String setInvalidDeleteCategoryApiEndpoints() {
        return url + "categories/1";
    }
}
