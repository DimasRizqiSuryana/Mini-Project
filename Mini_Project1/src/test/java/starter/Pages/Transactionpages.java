package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Transactionpages extends PageObject {

    private By transactionButton() {
        return By.xpath("//div[@class='v-list v-sheet theme--light']/div[contains(.,'Transaksi')]");
    }

    private By transactionField() {
        return By.xpath("//h1[.='Transactions']");
    }

    @Step
    public void clickTransactionButton(){
        $(transactionButton()).click();
    }

    @Step
    public boolean validateTransactionPage() {
        return $(transactionField()).isDisplayed();
    }
}
