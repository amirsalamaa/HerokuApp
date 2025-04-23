package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }


    @AfterClass
    public void teardown() {

            driver.quit();

    }


}
