package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Cartpages extends PageObject {

    private By CartButton(){
        return By.xpath("//button[.='1']");
    }

    private By PlussButton(){
        return By.xpath("//button[.='+']");
    }

    private By quantityIncrease() {
        return By.xpath("//div[.='Total Qty3']");
    }

    private By totalBayarField() {
        return By.xpath("//div[.='Total Bayar897']");
    }

    private By MinusButton() {
        return By.xpath("//button[.='-']");
    }

    private By quantityDecrease() {
        return By.xpath("//div[.='Total Qty2']");
    }

    @Step
    public void clickCartButton(){
        $(CartButton()).click();
    }

    @Step
    public boolean validateOnTheCartPage() {
       return  $(totalBayarField()).isDisplayed();
    }

    @Step
    public void clickPlussButton() {
        $(PlussButton()).click();
    }

    @Step
    public boolean validateItemWasIncrease() {
      return $(quantityIncrease()).isDisplayed();
    }

    @Step
    public void clickMinesButton() {
        $(MinusButton()).click();
    }

    @Step
    public boolean validateItemWasDecrease() {
       return  $(quantityDecrease()).isDisplayed();
    }


}
