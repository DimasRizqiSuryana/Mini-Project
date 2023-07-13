package starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Chooseproductpages extends PageObject {

    private By detailButton() {
        return By.cssSelector("div:nth-of-type(4) button:nth-of-type(1)");
    }

    private By altaShopField() {
        return By.xpath("//h3[.='AltaShop']");
    }

    private By clickBuyButton() {
        return By.cssSelector("div:nth-of-type(4) .ml-3");
    }

    private By succsessAddItem() {
        return By.xpath("//span[@class='v-badge__badge primary']");
    }

    @Step
    public void clickDetailButtonToSeeDetailProduct() {
        $(detailButton()).click();
    }

    @Step
    public void clickAltashopField() {
        $(altaShopField()).click();
    }

    @Step
    public void clickBuyingButton() {
        $(clickBuyButton()).click();
    }

    public boolean validateSuccsessAddItem() {
        return $(succsessAddItem()).isDisplayed();
    }
}
