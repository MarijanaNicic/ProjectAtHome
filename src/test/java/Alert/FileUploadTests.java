package Alert;

import base.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends baseTests {

    @Test
    public void testFileUpload() {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("D:\\VezbanjeKodKuce\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFile(), "chromedriver.exe", "Not uploaded");
    }
}
