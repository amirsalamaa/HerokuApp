package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private String editroIframeId="mce_0_ifr";
    private By textArea=By.id("tinymce");

    public FramesPage(WebDriver driver){this.driver=driver;}

    private void switchToEditArea(){
        driver.switchTo().frame(editroIframeId);
    }

    public void setTextArea(){
        switchToEditArea();
        driver.findElement(textArea).sendKeys();
        switchTomainArea();
    }
    
    public void cleartextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchTomainArea();
    }
    private void switchTomainArea(){
        driver.switchTo().parentFrame();
    }



}
