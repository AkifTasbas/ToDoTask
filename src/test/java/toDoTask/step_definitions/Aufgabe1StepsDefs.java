package toDoTask.step_definitions;

import toDoTask.utilities.Driver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class Aufgabe1StepsDefs {

    @Given("As a user I click plus button")
    public void as_a_user_I_click_plus_button() throws MalformedURLException, InterruptedException {

        Thread.sleep(3000);
        MobileElement plusButton = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/fab"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(plusButton));
        plusButton.click();
    }


    @Then("The Dialog have to be oppened")
    public void the_Dialog_have_to_be_oppened() throws MalformedURLException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout")));
        MobileElement dialogWindow = Driver.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout"));
        Assert.assertTrue(dialogWindow.isDisplayed());
    }

    @Then("user writes {string} in Text field")
    public void user_writes_in_Text_field(String text) throws MalformedURLException, InterruptedException {
        //"Test" in Textfeld schreiben
        MobileElement textfeld = Driver.getDriver().findElement(By.xpath("//*[@text='My Task']"));
        textfeld.sendKeys(text);
    }

    @Then("user clicks done button")
    public void user_clicks_done_button() throws MalformedURLException, InterruptedException {
        MobileElement doneButton = Driver.getDriver().findElement(By.id("android:id/button1"));
        doneButton.click();
    }

    @Then("new Task have to be created and {string} task can be seen on the list")
    public void new_Task_have_to_be_created_and_task_can_be_seen_on_the_list(String text) throws MalformedURLException, InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='" + text + "']")));
        MobileElement taskTitle = Driver.getDriver().findElement(By.xpath("//*[@text='" + text + "']"));

        Assert.assertTrue(taskTitle.isDisplayed());


    }

}
