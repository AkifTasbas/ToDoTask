package toDoTask.Pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import toDoTask.utilities.Driver;

public class BasePage {

   public MobileElement dayIcon = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/themeActionButton"));
   public MobileElement nightIcon = Driver.getDriver().findElement(By.id("com.example.yeshasprabhakar.todo:id/themeActionButton"));

}
