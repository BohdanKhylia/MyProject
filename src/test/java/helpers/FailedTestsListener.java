package helpers;

import com.codeborne.selenide.Screenshots;
import com.google.common.io.Files;
import io.qameta.allure.Attachment;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class FailedTestsListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            saveScreenshotPNG();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG () throws IOException {
        File file = Screenshots.takeScreenShotAsFile();
        return Files.toByteArray(file);
    }
}
