package toDoTask.step_definitions;


import toDoTask.Pages.StartPage;
import toDoTask.utilities.BrowserUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Task5StepsDefs {
    StartPage startPage=new StartPage();

    @Given("User clicks DayNight mode")
    public void user_clicks_DayNight_mode() {
        startPage.dayIcon.click();
    }

    @Then("the background should be dark")
    public void the_background_should_be_dark(){
        BrowserUtilities.waitFor(3);
        System.out.println("Now dark screen must be seen");
    }

    @Then("User clicks DayNight mode again")
    public void user_clicks_DayNight_mode_again(){
        startPage.nightIcon.click();
    }

    @Then("the background should be light")
    public void the_background_should_be_light(){
        BrowserUtilities.waitFor(3);
        System.out.println("Now light screen must be seen");
    }

}
