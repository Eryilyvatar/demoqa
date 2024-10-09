package pages.componenents;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class UploadPicture {
    public void setPicture(String value) {

        $("#uploadPicture").uploadFile(new File("src/test/resources/" + value));
    }
}
