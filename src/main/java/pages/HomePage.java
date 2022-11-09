package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='carousel-inner']//a[@class='carousel-control-next']")
    WebElement routeSlider;

    @FindBy(xpath = "//li//a[contains(.,' Chikkamagaluru - Bengaluru')]")
    WebElement routeLink;

    @FindBy(xpath = "//td[3]//a[@class='ui-state-default']")
    WebElement arrivalDate;

    //
    //@FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block btn-booking']")
    ///WebElement searchForBusBtn;

    public By searchForBusBtn = By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']");

    @FindBy(id = "corover-close-btn")
    WebElement closepopupBtn;

    public void selectPopularRouteAndDate() {

        routeSlider.click();
        routeLink.click();
        arrivalDate.click();
    }

    public void searchForBus(WebDriver driver) {
        closepopupBtn.click();
        driver.findElement(searchForBusBtn).click();
    }

}