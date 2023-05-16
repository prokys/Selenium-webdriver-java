package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("E:\\Git\\IdeaProjects\\webdriver_java\\resources\\WebDriver.txt");
        Assert.assertEquals(uploadPage.getUploadFiles(), "WebDriver.txt", "Uploaded files incorrect");
    }

}
