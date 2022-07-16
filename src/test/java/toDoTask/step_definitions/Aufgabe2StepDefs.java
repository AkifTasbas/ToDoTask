package toDoTask.step_definitions;

import toDoTask.utilities.Driver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class Aufgabe2StepDefs {
    @Then("user clicks cancel button")
    public void user_clicks_cancel_button() throws MalformedURLException, InterruptedException {

        MobileElement cancelButton = Driver.getDriver().findElement(By.id("android:id/button2"));
        cancelButton.click();
    }
    @Then("No new task was added, users see What do you want to do today text at the top.")
    public void no_new_task_was_added_users_see_What_do_you_want_to_do_today_text_at_the_top() throws MalformedURLException, InterruptedException {
        MobileElement firstPageText = Driver.getDriver().findElement(By.xpath("//*[@text='What do you want to do today?\n" +
                "You can create new ToDo \n" +
                "using + button\n" +
                "\n" +
                "']"));
        String textOfFirstPage = firstPageText.getText();
        System.out.println("textOfFirstPage = " + textOfFirstPage);
        Assert.assertTrue(textOfFirstPage.contains("What do you want to do today?"));
    }

}
