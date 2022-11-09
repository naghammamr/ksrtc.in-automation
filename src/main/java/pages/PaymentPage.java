package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends PageBase {

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "cnumber")
    WebElement cardNumField;

    @FindBy(id = "expmon")
    WebElement monthExpirationField;

    @FindBy(id = "expyr")
    WebElement yearExpirationField;

    @FindBy(id = "cvv2")
    WebElement CVVField;

    @FindBy(id = "cname2")
    WebElement holderNameField;

    @FindBy(id = "goBack")
    WebElement cancelBtn;

    public void enterPaymentDetails(String cardNum, String month, String year, String cvv, String holderName) {

        cardNumField.sendKeys(cardNum);
        monthExpirationField.sendKeys(month);
        yearExpirationField.sendKeys(year);
        CVVField.sendKeys(cvv);
        holderNameField.sendKeys(holderName);
    }

    public void cancelPayment() {
        cancelBtn.click();
    }

}
