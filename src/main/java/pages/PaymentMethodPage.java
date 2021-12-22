package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentMethodPage extends  BasePage{
    @FindBy(className = "title-pasajero")
    private WebElement title;

    public String getTitle() {
        return getText(title);
    }
}
