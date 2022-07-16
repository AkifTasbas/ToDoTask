package toDoTask.step_definitions;

import toDoTask.utilities.Driver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class Aufgabe3StepDefs {
    @Then("error message should be seen on the screen")
    public void error_message_should_be_seen_on_the_screen() throws IOException, InterruptedException {

        WebDriverWait waitForToast = new WebDriverWait(Driver.getDriver(),25);

        waitForToast.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.Toast")));
        MobileElement toastMessage=Driver.getDriver().findElement(By.xpath("/hierarchy/android.widget.Toast"));
        String toastMessageText=toastMessage.getText();
        String expectedErrorMessage="Oops, Cannot set an empty ToDo!!!";
        Assert.assertEquals(toastMessageText,expectedErrorMessage);

        //Thread.sleep(2000);
        File file  = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("ScreenshotFehlerMeldung.jpg"));
    }
}
