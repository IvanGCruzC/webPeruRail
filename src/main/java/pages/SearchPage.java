package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
    @FindBy(id = "roundtrip")
    private WebElement roundTrip;
    @FindBy(id = "oneway")
    private WebElement oneWay;
    @FindBy(id = "destinoSelect")
    private WebElement destination;
    @FindBy(id = "rutaSelect")
    private WebElement rutaSelect;
    @FindBy(id = "cbTrenSelect")
    private WebElement cbTrenSelect;
    @FindBy(id = "btn_search")
    private WebElement search;
    @FindBy(id = "salida")
    private WebElement salida;
    @FindBy(className = "ui-datepicker-title")
    private WebElement monthYear;
    @FindBy(className = "ui-state-default")
    private WebElement day;
    @FindBy(xpath = "//span[text()='Next']")
    private WebElement btnNext;
    @FindBy(id = "countParentsChildren")
    private WebElement countParentsChildren;
    @FindBy(id = "adultsAume")
    private WebElement adultsAume;
    @FindBy(id = "childrenAume")
    private WebElement childrenAume;
    @FindBy(id = "error-pasajeros")
    private WebElement errorPasajeros;


    public SearchPage selectDestination(String destination) {
        selectOption(this.destination, destination);
        return this;
    }

    public SearchPage selectRoute(String route) {
        selectOption(rutaSelect, route);
        return this;
    }

    public SearchPage chooseTrain(String train) {
        selectOption(cbTrenSelect, train);
        return this;
    }

    public SearchPage selectDate(String mes_año, String dia) {
        click(salida);
        while (!(monthYear.getText().equalsIgnoreCase(mes_año))) {
            click(btnNext);
        }
        click(By.xpath("//a[text()='" + dia + "']"));
        return this;
    }

    public void clickCountParentsChildren() {
        click(countParentsChildren);
    }

    public void setAdultsAume(Integer count) {
        clickForCount(adultsAume, count);
    }

    public void setChildrenAume(Integer count) {
        clickForCount(childrenAume, count);
    }

    public void clickSearch() {
        click(search);
    }

    public String getErrorPasajeros() {
        return getText(errorPasajeros);
    }
}
