package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import pages.SearchPage;
import pages.PageManager;

import java.util.Map;

public class SearchSteps {
    private SearchPage searchPage = PageManager.obtenerInstancia().getSearchPage();

    @Given("que he seleccionado la ruta")
    public void que_he_seleccionado_la_ruta(DataTable dataTable) {
        Map<String, String> datosRuta = dataTable.asMaps().get(0);
        searchPage.selectDestination(datosRuta.get("destino"))
                .selectRoute(datosRuta.get("ruta"))
                .chooseTrain(datosRuta.get("tren"))
                .selectDate(datosRuta.get("mes_año"), datosRuta.get("dia"))
                .clickSearch();
    }

    @Given("que he seleccionado el destino {string}")
    public void que_he_seleccionado_el_destino(String destino) {
        searchPage.selectDestination(destino);
    }

    @Given("he seleccionado la ruta {string}")
    public void he_seleccionado_la_ruta(String ruta) {
        searchPage.selectRoute(ruta);
    }

    @When("ingreso {int} adultos y {int} niño como pasajeros")
    public void ingreso_adultos_y_niño_como_pasajeros(Integer CantidadAdultos, Integer CantidadNiños) {
        searchPage.clickCountParentsChildren();
        searchPage.setAdultsAume(CantidadAdultos);
        searchPage.setChildrenAume(CantidadNiños);
    }

    @Then("se motrará mensaje diciendo {string}")
    public void se_motrará_mensaje_diciendo(String error) {
        Assert.assertEquals(error, searchPage.getErrorPasajeros());
    }

    @When("doy click en search")
    public void doy_click_en_search() {
        searchPage.clickSearch();
    }

}
