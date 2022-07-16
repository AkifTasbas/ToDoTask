package toDoTask.step_definitions;

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
import toDoTask.utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class Task4StepsDefs {
    @Then("user clicks trash icon")

    public void user_clicks_trash_icon() throws IOException, InterruptedException {
        MobileElement mülltonnenIcon = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/delete"));
        mülltonnenIcon.click();
        Thread.sleep(2000);
        File file  = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("ScreenshotDeletedSuccesfully.jpg"));
    }
    @Then("{string} text should be seen on the screen")
    public void text_should_be_seen_on_the_screen(String deleteMessage) throws MalformedURLException, InterruptedException {

        WebDriverWait waitForToast = new WebDriverWait(Driver.getDriver(),25);

        waitForToast.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.Toast")));
        MobileElement toastMessage=Driver.getDriver().findElement(By.xpath("/hierarchy/android.widget.Toast"));
        String toastMessageText=toastMessage.getText();
        //System.out.println("toastMessageText = " + toastMessageText);
        String expectedMessage=deleteMessage;
        Assert.assertEquals(toastMessageText,expectedMessage);

    }

    @Then("new Task must be deleted and {string} task must not be able to seen on the list")
    public void new_Task_must_be_deleted_and_task_must_not_be_able_to_seen_on_the_list(String text) {
        try {
            MobileElement taskTitle = Driver.getDriver().findElement(By.xpath("//*[@text='"+text+"']"));
        }
        catch (NoSuchElementException e){
            System.out.println("The task can not be found in the list");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
