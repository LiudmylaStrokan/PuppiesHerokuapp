package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MainGamePage {

    public MainGamePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='puppy_list']")
    public List<WebElement> listOfAvailablePuppies;

    @FindBy(xpath = "//div[@class='intro_t']")
    public WebElement mainPageHeader;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchField;

    @FindBy(xpath = "//p[@id='notice']/following::h1")
    public WebElement puppyListHeader;
}
