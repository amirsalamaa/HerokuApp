package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea {
WebDriver driver;

public SecureArea(WebDriver driver){
    this.driver=driver;

}
//locators
    private By statusAlert= By.id("flash");
//Actions
    public String StatusCheck(){
       return driver.findElement(statusAlert).getText();
    }
}
