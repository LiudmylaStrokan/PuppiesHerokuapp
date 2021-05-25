package step_defs;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.Driver;
import utilities.Helper;

import java.util.List;
import java.util.Map;


public class AdoptAvailableDogSteps {

    WebDriver driver = Driver.getDriver();
    MainGamePage mainGamePage = new MainGamePage();
    ViewDetailsAboutPuppyPage viewDetailsAboutPuppyPage = new ViewDetailsAboutPuppyPage();
    AdditionalProductServicesPage additionalProductServicesPage = new AdditionalProductServicesPage();
    CompleteAdoptionPage completeAdoptionPage = new CompleteAdoptionPage();
    WebElement brookLink;
    @Given("^user has opened http://puppies\\.herokuapp\\.com/ page in the browser$")
    public void user_has_opened_http_puppies_herokuapp_com_page_in_the_browser() {
        driver.navigate().to("http://puppies.herokuapp.com/");
    }

    @Then("^user should see \"([^\"]*)\" puppy available on the page$")
    public void userShouldSeePuppyAvailableOnThePage(String puppyName) throws InterruptedException {
        brookLink = driver.findElement(By.xpath("//div[@class = 'puppy_list']//*[contains(text(),'Brook')]"));
        Helper.highlightElement(brookLink);
        Assert.assertTrue(""+puppyName+" does not present on the page", brookLink.isDisplayed());
    }
    @And("^user clicks View Details Button by \"([^\"]*)\" puppy$")
    public void userClicksViewDetailsButtonByPuppy(String puppyNameForSearch) throws InterruptedException {
        WebElement viewDetailsButton = brookLink.findElement(By.xpath("./following::input"));
        Helper.highlightElement(viewDetailsButton);
        viewDetailsButton.click();
    }

    @When("^user should see a puppy's photo displayed on the page$")
    public void user_should_see_a_puppy_s_photo_displayed_on_the_page() throws InterruptedException {
        Helper.highlightElement(viewDetailsAboutPuppyPage.puppyImage);
        Assert.assertTrue(viewDetailsAboutPuppyPage.puppyImage.isDisplayed());
    }

    @When("^user clicks on Adopt Me! button$")
    public void user_clicks_on_Adopt_Me_button() throws InterruptedException {
        Helper.highlightElement(viewDetailsAboutPuppyPage.adoptButton);
        viewDetailsAboutPuppyPage.adoptButton.click();
    }

    @When("^user clicks Complete the Adoption Button$")
    public void user_clicks_Complete_the_Adoption_Button() throws InterruptedException {
        Helper.highlightElement(additionalProductServicesPage.completeTheAdoptionButton);
        additionalProductServicesPage.completeTheAdoptionButton.click();
    }

    @When("^user fills out fields with the following information$")
    public void user_fills_out_fields_with_the_following_information(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
        Helper.highlightElement(completeAdoptionPage.nameInputField);
        completeAdoptionPage.nameInputField.sendKeys(credentials.get(0).get("Name"));
        Helper.highlightElement(completeAdoptionPage.addressInputField);
        completeAdoptionPage.addressInputField.sendKeys(credentials.get(0).get("Address"));
        Helper.highlightElement(completeAdoptionPage.emailInputField);
        completeAdoptionPage.emailInputField.sendKeys(credentials.get(0).get("Email"));
        Helper.highlightElement(completeAdoptionPage.selectPaymentTypeDropdown);
        Select dropdown = new Select(completeAdoptionPage.selectPaymentTypeDropdown);
        dropdown.selectByVisibleText(credentials.get(0).get("Payment Type"));

    }

    @Then("^place oder button should be displayed$")
    public void place_oder_button_should_be_displayed() throws InterruptedException {
        Helper.highlightElement(completeAdoptionPage.placeOrderButton);
        Assert.assertTrue(completeAdoptionPage.placeOrderButton.isDisplayed());
    }
}


