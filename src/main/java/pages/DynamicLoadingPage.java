package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }
    public DynamicExampleOne clickFirstExample(){
       driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
    return new DynamicExampleOne (driver);
    }
}
