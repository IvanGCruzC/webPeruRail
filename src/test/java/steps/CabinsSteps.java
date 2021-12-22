package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import pages.CabinsPage;
import pages.PageManager;

import java.util.Map;

public class CabinsSteps {
    private CabinsPage cabinsPage = PageManager.obtenerInstancia().getCabinsPage();

    @Given("seleccionado la cabina")
    public void seleccionado_las_cabinas_y_pasajeros(DataTable dataTable) {
        Map<String, String> datosCabinas = dataTable.asMaps().get(0);
        cabinsPage.selectCabin(datosCabinas.get("cabina"), datosCabinas.get("cantidad"));
        cabinsPage.clickContinue();
    }

    @Then("se mostrará el mensaje {string}")
    public void se_mostrará_el_mensaje(String mensaje) {
        Assert.assertEquals(mensaje, cabinsPage.getNoCabins());
    }

    @Given("he seleccionado {string} {string} con {int} pasajeros niños")
    public void he_seleccionado_con_solo_pasajeros_niños(String cantidad, String cabina, Integer cantidadNiños) {
        cabinsPage.selectCabin(cabina, cantidad);
        cabinsPage.selectNumberChildren(Integer.toString(cantidadNiños));
    }

    @Given("selecciono {string} {string}")
    public void selecciono(String cantidad, String cabina) {
        cabinsPage.selectCabin(cabina, cantidad);
    }

    @When("doy click en continuar en la página de cabinas")
    public void doy_click_en_continuar_en_la_página_de_cabinas() {
        cabinsPage.clickContinue();
    }

    @Then("se mostrará un popup con el mensaje {string}")
    public void se_mostrará_un_popup_con_el_mensaje(String mensaje) throws InterruptedException {
        Assert.assertEquals(mensaje, cabinsPage.getTextPopup());
    }

}
