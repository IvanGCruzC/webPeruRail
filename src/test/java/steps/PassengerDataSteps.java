package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import pages.PageManager;
import pages.PassengerDataPage;

import java.util.Map;

public class PassengerDataSteps {
    private PassengerDataPage passengerDataPage = PageManager.obtenerInstancia().getPassengerDataPage();

    @Given("ingresado la informacion de los pasajeros")
    public void ingresado_la_informacion_de_los_pasajeros(DataTable dataTable) {
        Map<String, String> datosPasajero = dataTable.asMaps().get(0);
        passengerDataPage.withFirstName(datosPasajero.get("nombre"))
                         .withLastName(datosPasajero.get("apellidos"))
                         .withDateOfBirth()
                         .withNationality(datosPasajero.get("nacionalidad"))
                         .withDocumentId(datosPasajero.get("tipo_documento"))
                         .withDocumentNumber(datosPasajero.get("num_documento"))
                         .withSex(datosPasajero.get("sexo"))
                         .withTelephone(datosPasajero.get("telefono"))
                         .withEmail(datosPasajero.get("correo"))
                         .withEmailConfirm(datosPasajero.get("correo"));
    }

    @When("doy click en continuar en la página de data de pasajero")
    public void doy_click_en_continuar_en_la_página_de_data_de_pasajero() {
        passengerDataPage.clickContinue();
    }

}
