package pages;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CabinsPage extends BasePage {
    @FindBy(name = "selectRooms[suite]")
    private WebElement suite;
    @FindBy(name = "selectRooms[twin]")
    private WebElement twin;
    @FindBy(name = "selectRooms[bunk]")
    private WebElement bunk;
    @FindBy(className = "btn-container")
    private WebElement noCabins;
    @FindBy(id = "continuar_bae")
    private WebElement continuar;
    @FindBy(name = "selectRooms[suite][cabinas][cab1][nin]")
    private WebElement numberChildren;
    @FindBy(className = "sb-content")
    private WebElement popup;


    public void selectCabin(String CabinType, String numberCabins) {
        WebElement webElement = null;
        switch (CabinType){
            case "SUITE":
                webElement = suite;
                break;
            case "TWIN":
                webElement = twin;
                break;
            case "BUNK":
                webElement = bunk;
                break;
            default:
                break;
        }
        scroll(webElement);
        selectOption(webElement, numberCabins);
    }

    public String getNoCabins() {
        scroll(noCabins);
        return getText(noCabins);
    }

    public void selectNumberChildren(String number) {
        selectOption(numberChildren, number);
    }

    public String getTextPopup() {
        return getText(popup);
    }

    public void clickContinue() {
        scroll(continuar);
        click(continuar);
    }
}
