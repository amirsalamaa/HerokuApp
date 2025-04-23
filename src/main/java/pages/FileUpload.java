package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUpload {
    private WebDriver driver;
    private By inputField=By.id("file-upload");
    private By uploadButton=By.id("file-submit");


    public FileUpload(WebDriver driver){
        this.driver=driver;
    }
    public void clickUpload(){
        driver.findElement(uploadButton).click();
    }
    public void UploadFile(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
    }
    public String getUploadedFile(){
        return driver.findElement(By.id("uploaded-files")).getText();

    }

}
