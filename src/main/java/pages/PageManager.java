package pages;

public class PageManager {
    private static PageManager pageManager;
    private SearchPage searchPage;
    private CabinsPage cabinsPage;
    private PassengerDataPage passengerDataPage;
    private PaymentMethodPage paymentMethodPage;
    private PurchaseSummaryPage purchaseSummaryPage;

    private PageManager() {
    }

    private synchronized static void crearInstancia() {
        if (pageManager == null) {
            pageManager = new PageManager();
        }
    }

    public static PageManager obtenerInstancia() {
        crearInstancia();
        return pageManager;
    }

    public SearchPage getSearchPage() {
        return (searchPage == null) ? searchPage = new SearchPage() : searchPage;
    }

    public CabinsPage getCabinsPage() {
        return (cabinsPage == null) ? cabinsPage = new CabinsPage() : cabinsPage;
    }

    public PassengerDataPage getPassengerDataPage() {
        return (passengerDataPage == null) ? passengerDataPage = new PassengerDataPage() : passengerDataPage;
    }

    public PaymentMethodPage getPaymentMethodPage() {
        return (paymentMethodPage == null) ? paymentMethodPage = new PaymentMethodPage() : paymentMethodPage;
    }

    public PurchaseSummaryPage getPurchaseSummaryPage() {
        return (purchaseSummaryPage == null) ? purchaseSummaryPage = new PurchaseSummaryPage() : purchaseSummaryPage;
    }
}
