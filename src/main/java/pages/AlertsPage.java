package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertBtn= By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirbtn=By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptbtn=By.xpath(".//button[text()='Click for JS Prompt']");


    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void setTriggerAlertBtn(){
        driver.findElement(triggerAlertBtn).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void setTriggerConfirmBtn(){
        driver.findElement(triggerConfirbtn).click();
    }
    public void rejectAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void setTriggerPromptbtn(){
        driver.findElement(triggerPromptbtn).click();

    }
    public void promptSetInput(String text){
    driver.switchTo().alert().sendKeys(text);
    }

    public String checkAlertStatus(){
        return driver.findElement(By.id("result")).getText();
    }





}
