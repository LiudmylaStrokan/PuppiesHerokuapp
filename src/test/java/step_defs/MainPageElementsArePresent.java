package step_defs;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.MainGamePage;
import utilities.Helper;

public class MainPageElementsArePresent {

    MainGamePage mainGamePage = new MainGamePage();


    @Then("^user should see \"([^\"]*)\" header$")
    public void user_should_see_header(String header) throws InterruptedException {
       Helper.highlightElement(mainGamePage.mainPageHeader);
        Assert.assertTrue("Header is not displayed", mainGamePage.mainPageHeader.getText().contains(header));
    }

    @Then("^user should see search field$")
    public void user_should_see_search_field() throws InterruptedException {
        Helper.highlightElement(mainGamePage.searchField);
        Assert.assertTrue("Search field is not displayed", mainGamePage.searchField.isDisplayed());
    }

    @Then("^user should be able to type request in the search field$")
    public void user_should_be_able_to_type_request_in_the_search_field() throws InterruptedException {
        String input = "My favorite dog";
        mainGamePage.searchField.sendKeys(input);
        Helper.highlightElement(mainGamePage.searchField);
        Assert.assertTrue("Not able to type into the search field", mainGamePage.searchField.getText().contains(input));
    }
}
