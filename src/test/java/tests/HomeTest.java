package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTests {

    HomePage homePage;

    @Test
    public void userCanEnterFromANDToPlace() throws InterruptedException {

        homePage = new HomePage(driver);
        Thread.sleep(1000);
        homePage.selectPopularRouteAndDate();
    }

    @Test
    public void userCanClickOnSearchBus() throws InterruptedException {
        homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.searchForBus();
    }

}
