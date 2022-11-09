package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.PaymentPage;

public class PaymentTest extends BaseTests {

    PaymentPage paymentPage;

    @Test
    public void userCanEnterPaymentDetails() {

        paymentPage = new PaymentPage(driver);
        paymentPage.enterPaymentDetails("1348138989898989","04","27","213","NA AA");
        paymentPage.cancelPayment();
    }
}
