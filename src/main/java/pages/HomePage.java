package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
//    private By formAuthenticationLink = By.linkText("Form Authentication");
//    private By DropdownPage=By.linkText(("Dropdown"));

    // Actions
    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public KeyPresses clickKeyPresses(){
    clickLink("Key Presses");
    return new KeyPresses(driver);
    }


    public AlertsPage clickAlertsPage(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUpload clickFileUploadPage(){
        clickLink("File Upload");
        return new FileUpload(driver);
    }


    public FramesPage clickFramesPage(){
        clickLink("WYSIWYG Editor");
        return new FramesPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoadingPage(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();

    }

}
