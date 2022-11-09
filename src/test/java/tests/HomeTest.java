package tests;

import base.BaseTests;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.HomePage;
import java.time.Duration;

public class HomeTest extends BaseTests {

    HomePage homePage;

    @Test
    public void userCanEnterFromANDToPlace() {

        homePage = new HomePage(driver);
        homePage.selectPopularRouteAndDate();
        homePage.searchForBus(driver);

    }

    @Test(dependsOnMethods = "userCanEnterFromANDToPlace")
    public void userCanClickOnSearchBus()
    {
        homePage = new HomePage(driver);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));

        homePage.searchForBus(driver);
    }

}
