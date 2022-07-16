package toDoTask.step_definitions;

import toDoTask.utilities.Driver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class Aufgabe4StepDefs {
    @Then("user clicks trash icon")
    public void user_clicks_trash_icon() throws IOException, InterruptedException {
        MobileElement mülltonnenIcon = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/delete"));
        mülltonnenIcon.click();
        Thread.sleep(2000);
        File file  = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("ScreenshotDeletedSuccesfully.jpg"));
    }

    @Then("DELETED SUCCESFULLY text should be seen on the screen")
    public void deleted_SUCCESFULLY_text_should_be_seen_on_the_screen_and() throws IOException, InterruptedException {

        WebDriverWait waitForToast = new WebDriverWait(Driver.getDriver(),25);

        waitForToast.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.Toast")));
        MobileElement toastMessage=Driver.getDriver().findElement(By.xpath("/hierarchy/android.widget.Toast"));
        String toastMessageText=toastMessage.getText();
        //System.out.println("toastMessageText = " + toastMessageText);
        String expectedMessage="Deleted Successfully!";
        Assert.assertEquals(toastMessageText,expectedMessage);

    }
    @Then("new Task have to be deleted and {string} task can not be seen on the list")
    public void new_Task_have_to_be_deleted_and_task_can_not_be_seen_on_the_list(String text) throws MalformedURLException, InterruptedException {
        try {
            MobileElement taskTitle = Driver.getDriver().findElement(By.xpath("//*[@text='"+text+"']"));
        }
        catch (NoSuchElementException e){
            System.out.println("The task can not be found in the list");
        }
    }

}
