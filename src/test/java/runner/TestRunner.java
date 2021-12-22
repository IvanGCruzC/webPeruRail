package runner;

import driver.DriverManager;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utils.Util;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"steps"},
        tags = "@estable",
        plugin = {"pretty",
                "json:target/cucumber.json"
        },
        monochrome = true)
public class TestRunner {

    @BeforeClass
    public static void iniciar() throws IOException {
        DriverManager.obtenerInstancia().inicializarDriver(Util.getPeruRailURLL());
    }

    @AfterClass
    public static void terminar() {
        DriverManager.obtenerInstancia().cerrarDriver();
    }
}
