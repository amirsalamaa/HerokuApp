package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
        //constructor
        public LoginPage(WebDriver driver){this.driver=driver;}

    //locators
   private By usernameField= By.id("username");
        private By passwordField=By.id("password");
        private By loginButton=By.xpath("//*[@id=\"login\"]/button");

        //Actions
    public SecureArea loginHandler(String username,String password){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new SecureArea(driver);
    }

}
