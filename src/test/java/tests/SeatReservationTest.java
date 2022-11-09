package tests;

import base.BaseTests;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.SeatReservationPage;

import java.time.Duration;

public class SeatReservationTest extends BaseTests {

    SeatReservationPage seatReservationPage;

    @Test
    public void userCanReserveASeat() {

        seatReservationPage = new SeatReservationPage(driver);

        seatReservationPage.selectSeat();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        seatReservationPage.selectPoints();
        seatReservationPage.enterCustomerInfo("6789125987","nagham@test.com");
        seatReservationPage.enterPassengerDetails("PName","MALE","25");
        seatReservationPage.submitPayment();
    }

}
