package toDoTask.Pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import toDoTask.utilities.BrowserUtilities;
import toDoTask.utilities.Driver;

public class TaskListPage extends BasePage{

    private MobileElement taskTitle;
    private MobileElement müllTonnenIcon;

    public MobileElement getMüllTonnenIcon() {
        müllTonnenIcon = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/delete"));
        return BrowserUtilities.waitForVisibility(müllTonnenIcon, 3);
    }

    public MobileElement getTaskTitle(String text){
        taskTitle=Driver.getDriver().findElement(By.xpath("//*[@text='" + text + "']"));
        return BrowserUtilities.waitForVisibility(taskTitle, 3);
    }




}
