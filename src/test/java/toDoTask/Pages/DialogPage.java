package toDoTask.Pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import toDoTask.utilities.BrowserUtilities;
import toDoTask.utilities.Driver;



public class DialogPage {
    private MobileElement dialogWindow;
    private MobileElement textfeld;
    private MobileElement doneButton;
    private MobileElement cancelButton;


    public MobileElement getCancelButton() {
        cancelButton = Driver.getDriver().findElement(By.id("android:id/button2"));
        return BrowserUtilities.waitForVisibility(cancelButton,3);
    }
    public MobileElement getTextfeld() {
        textfeld = Driver.getDriver().findElement(By.xpath("//*[@text='My Task']"));
        return BrowserUtilities.waitForVisibility(textfeld, 3);
    }
    public MobileElement getDoneButton() {
        doneButton = Driver.getDriver().findElement(By.id("android:id/button1"));
        return BrowserUtilities.waitForVisibility(doneButton, 3);
    }
    public MobileElement getDialogWindow() {
        dialogWindow = Driver.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout"));
        return BrowserUtilities.waitForVisibility(dialogWindow, 3);
    }


}
