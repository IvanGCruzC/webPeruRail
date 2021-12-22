package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.PageManager;
import pages.PurchaseSummaryPage;

public class PurchaseSummarySteps {
    private PurchaseSummaryPage purchaseSummaryPage = PageManager.obtenerInstancia().getPurchaseSummaryPage();

    @Then("en la opción purchase summary mostrará el total {string}")
    public void en_la_opción_purchase_summary_mostrará_el_total(String total) throws InterruptedException {
        purchaseSummaryPage.clickPurchaseSummary();
        Thread.sleep(2000);
        Assert.assertEquals(total, purchaseSummaryPage.getTotal());
    }

}
