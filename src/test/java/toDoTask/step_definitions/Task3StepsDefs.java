package toDoTask.step_definitions;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import toDoTask.utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class Task3StepsDefs {
    @Then("{string} message must be seen on the screen")
    public void message_must_be_seen_on_the_screen(String failureMessage) throws IOException, InterruptedException {

        WebDriverWait waitForToast = new WebDriverWait(Driver.getDriver(),25);

        waitForToast.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.Toast")));
        MobileElement toastMessage=Driver.getDriver().findElement(By.xpath("/hierarchy/android.widget.Toast"));
        String toastMessageText=toastMessage.getText();
        String expectedErrorMessage=failureMessage;
        Assert.assertEquals(toastMessageText,expectedErrorMessage);

        //Thread.sleep(2000);
        File file  = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("ScreenshotFehlerMeldung.jpg"));
    }
}
