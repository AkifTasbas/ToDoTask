package toDoTask.step_definitions;

import toDoTask.utilities.Driver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class Aufgabe5StepDefs {
    @Given("User clicks DayNight mode")
    public void user_clicks_DayNight_mode() throws MalformedURLException, InterruptedException {
        MobileElement sonneIcon = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/themeActionButton"));
        sonneIcon.click();

    }

    @Then("the background should be dark")
    public void the_background_should_be_dark() throws IOException, InterruptedException {
        Thread.sleep(3000);
        File file  = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("darkBackground.jpg"));


    }

    @Then("User clicks DayNight mode again")
    public void user_clicks_DayNight_mode_again() throws MalformedURLException, InterruptedException {
        //Thread.sleep(3000);
        MobileElement mondIcon = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/themeActionButton"));
        //Thread.sleep(3000);
        mondIcon.click();
    }

    @Then("the background should be light")
    public void the_background_should_be_light() throws IOException, InterruptedException {
        Thread.sleep(3000);
        File file  = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("lightBackground.jpg"));
    }

}
