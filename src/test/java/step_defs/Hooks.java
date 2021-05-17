package step_defs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;


import java.util.concurrent.TimeUnit;

public class Hooks {
@Before
public void setUp() throws Exception{
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
        }

@After
public void tearDown(Scenario scenario){
        try{
        if(scenario.isFailed()){
final byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        scenario.embed(screenshot,"image/png");
        }
        }catch(Exception e){
        System.out.println("The error happened while taking screenshot and cleaning up after the test");
        e.getMessage();
        }
        Driver.closeDriver();
        }

}