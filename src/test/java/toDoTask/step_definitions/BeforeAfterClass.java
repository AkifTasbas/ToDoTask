package toDoTask.step_definitions;

import toDoTask.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class BeforeAfterClass {

    @Before
    public void setUp() throws MalformedURLException, InterruptedException {
        Driver.getDriver();
        System.out.println("\tSuccesfully connected to Native App");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario){

        Driver.closeDriver();
        System.out.println("\tThe App closed succesfully ");

    }

}
