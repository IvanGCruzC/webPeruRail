package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseSummaryPage extends BasePage{
    @FindBy(xpath = "//*[@id='compra']/a")
    private WebElement purchaseSummary;
    @FindBy(xpath = "//span[@id='priceUSDrc']")
    private WebElement total;

    public void clickPurchaseSummary() {
        click(purchaseSummary);
    }

    public String getTotal() {
        return getText(total);
    }
}
