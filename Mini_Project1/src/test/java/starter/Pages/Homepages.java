package starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Homepages extends PageObject {

    private By userfield(){
        return By.xpath("//div[@class='v-toolbar__content']/button[2]");
    }

    @Step
    public void validateOnTheHomepage() {
        $(userfield()).isDisplayed();
    }
}
