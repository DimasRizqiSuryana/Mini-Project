package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class PaymentPage extends PageObject {

    private By payButton(){
        return By.xpath("//button[@id='button-bayar']");
    }

    private By transactionPage() {
        return By.xpath("//h1[.='Transactions']");
    }

    @Step
    public void clickkPayButton() {
        $(payButton()).click();
    }

    @Step
    public boolean validateOnTheTransactionPage() {
        return $(transactionPage()).isDisplayed();
    }
}
