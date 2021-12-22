package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Util;

import java.io.IOException;

public class Hooks {

    @After(order = 0)
    public void afterScenario() throws IOException {
        DriverManager.obtenerInstancia().obtenerDriver().manage().deleteAllCookies();
        DriverManager.obtenerInstancia().obtenerDriver().navigate().to(Util.getPeruRailURLL());
    }

    @After(order = 1)
    public void takeScreenshot(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) DriverManager.obtenerInstancia().obtenerDriver())
                .getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }
}
