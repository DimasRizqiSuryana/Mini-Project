package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class GET_Category {

    protected String url = "https://altashop-api.fly.dev/api/";

    //POSITIVE

    @Step("I set GET category api endpoints")
    public String setGetCategoryApiEndPoints() {
        return url + "categories/13946";
    }

    @Step("I send GET category HTTP request")
    public void sendGetCategoryHttpRequest() {
        SerenityRest.given().header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkpvaG4gRG9lIiwiRW1haWwiOiJzb21lb25lQG1haWwuY29tIn0.WvBSxcQEqqniC1v08LzkrHcELegs0b7vtjGPWiaEWcI").when().get(setGetCategoryApiEndPoints());
    }

    //NEGATIVE

    @Step("I set typo GET category api endpoints")
    public String setInvalidGetCategoryApiEndpoints() {
        return url + "categories/1";
    }
}
