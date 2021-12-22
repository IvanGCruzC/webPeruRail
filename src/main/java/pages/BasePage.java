package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    private WebDriver driver;

    public BasePage() {
        this.driver = DriverManager.obtenerInstancia()
                                   .obtenerDriver();
        PageFactory.initElements(this.driver, this);
    }

    public void click(WebElement webElement) {
        webElement.click();
    }

    public void click(By by) {
        click(driver.findElement(by));
    }

    public void clickForCount(WebElement webElement, Integer count) {
        for (int i = 0; i < count; i++) {
            click(webElement);
        }
    }
    public void sendKeys(WebElement webElement, String string) {
        webElement.sendKeys(string);
    }

    public String getText(WebElement webElement) {
        return webElement.getText();
    }

    public void selectOption(WebElement webElement, String option) {
        try {
            Select select = new Select(webElement);
            select.selectByVisibleText(option);
        } catch (Exception e) {
            throw e;
        }
    }

    public void scroll(WebElement webElement) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", webElement);
    }
}
