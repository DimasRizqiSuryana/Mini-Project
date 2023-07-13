package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Logoutpages extends PageObject {

    private By userButton() {
        return By.xpath("//div[@class='v-toolbar__content']/button[2]");
    }

    private By logoutButton() {
        return By.xpath("//div[@class='v-list v-sheet theme--light']/div[contains(.,'Logout')]");
    }

    private By loginField() {
        return By.xpath("//button[2]");
    }

    @Step
    public void clickUserButtun() {
        $(userButton()).click();
    }

    @Step
    public void clickLogoutButton() {
        $(logoutButton()).click();
    }

    @Step
    public boolean validateAccountWasLogout() {
        return $(loginField()).isDisplayed();
    }
}
