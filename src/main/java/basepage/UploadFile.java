package basepage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class UploadFile extends HomePage {
    private SelenideElement uploadFile=$x("//input[@id='file-upload']");
    private SelenideElement uploadFileButton=$x("//input[@id='file-submit']");
    private SelenideElement sussesMesage=$x("//h3");
    private SelenideElement uploadFileDescription=$x("//div[@id='upload-files']");
public void uploadFile(String pathToFile){
    uploadFile.sendKeys(pathToFile);
}
public void doUpload(){
    uploadFileButton.click();
}
public String getSuccessMesage(){
    return sussesMesage.shouldBe(Condition.visible).getText();
}
public String getDescription(){
  return uploadFileDescription.shouldBe(Condition.visible).getText();
}
}
