package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class DynamicExampleOne {
    private WebDriver driver;
    private By startButton= By.cssSelector("#start button");
    private By loadingIndicator=By.id("loading");
    private By loadedText=By.id("finish");
    public DynamicExampleOne(WebDriver driver){
        this.driver=driver;
    }
    public void clickStart(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIndicator));

    }
    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }

}
