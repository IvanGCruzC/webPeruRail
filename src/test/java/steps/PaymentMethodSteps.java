package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.PageManager;
import pages.PaymentMethodPage;

public class PaymentMethodSteps {
    private PaymentMethodPage paymentMethodPage = PageManager.obtenerInstancia().getPaymentMethodPage();

    @Then("se mostrarĂ¡ la pantalla de pago {string}")
    public void se_mostrarĂ¡_la_pantalla_de_pago(String title) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(title, paymentMethodPage.getTitle());
    }
}
