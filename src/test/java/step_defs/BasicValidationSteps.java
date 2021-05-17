package step_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.MainGamePage;
import utilities.Driver;

public class BasicValidationSteps {
    WebDriver driver = Driver.getDriver();
    MainGamePage mainGamePage = new MainGamePage();

    @Given("^User have opened fake bar bar challenge$")
    public void user_have_opened_fake_bar_bar_challenge() {
        driver.navigate().to("http://ec2-54-208-152-154.compute-1.amazonaws.com/");
    }

    @Then("^user should be able to see and click on Reset Button$")
    public void user_should_be_able_to_see_and_click_on_Reset_Button() throws Throwable {
        Assert.assertTrue("Reset Button is not displayed", mainGamePage.resetButton.isDisplayed());
        Assert.assertTrue("Reset Button is not clickable", mainGamePage.resetButton.isEnabled());
    }

    @Then("^user should be able to see and click on Weight Button$")
    public void user_should_be_able_to_see_and_click_on_Weight_Button() throws Throwable {
        Assert.assertTrue("Reset Button is not displayed", mainGamePage.weightButton.isDisplayed());
        Assert.assertTrue("Reset Button is not clickable", mainGamePage.weightButton.isEnabled());
    }

    @Then("^user should see the measure results field$")
    public void user_should_see_the_measure_results_field() {
        Assert.assertTrue("Measure result field is not displayed", mainGamePage.resultField.isDisplayed());
    }

}
