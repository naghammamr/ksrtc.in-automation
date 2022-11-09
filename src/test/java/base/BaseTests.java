package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTests {

    public static WebDriver driver;

    @BeforeSuite
    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
    }

    @AfterSuite(enabled = false)
    public void closeDriver()
    {
        driver.quit();
    }
}
