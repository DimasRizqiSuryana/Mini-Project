package starter.user;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class POST_Register extends PageObject {

    protected String url = "https://altashop-api.fly.dev/api/";

    //POSITIVE

    @Step("I set POST Register api endpoints")
    public String setPostRegisterApiEndpoints() {
        return url + "register";
    }

    @Step("I send POST Register HTTP request")
    public void sendPostRegisterHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "cobaakunkamu@mail.com");
        requestBody.put("password", 123456);
        requestBody.put("fullname", "cobaakunkamu");

        SerenityRest.given().header("Conten-Type", "aplication/json").body(requestBody.toJSONString()).post(setPostRegisterApiEndpoints());
    }

    //NEGATIVE

    @Step("I set typo POST register api endpoints")
    public String setInvaliidPostRegisterApiEndpoints() {
        return url + "registers";
    }
}
