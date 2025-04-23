package FileUpload;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUpload;

public class FileUploadTest extends BaseTests {
    @Test
    public void testFileUpload(){
        FileUpload fileUpload=homePage.clickFileUploadPage();
    fileUpload.UploadFile("C:\\Users\\AMIR SALAMA\\IdeaProjects\\herokuApp\\.idea\\Amir 2.pdf");
    fileUpload.clickUpload();
        Assert.assertEquals(fileUpload.getUploadedFile(),"\n" +
                "    Amir 2.pdf\n" +
                "  ","uploading failed");
    }
}
