package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class MainGamePage {

    public MainGamePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()= 'Reset'] ")
    public WebElement resetButton;

    @FindBy(xpath = "//button[text()= 'Weigh'] ")
    public WebElement weightButton;

    @FindBy(xpath = "//div[text()= 'Result']//following-sibling::button")
    public WebElement resultField;

    @FindBy(xpath = "//input[@data-side='left']")
    public List<WebElement> leftBowls;

    @FindBy(xpath = "//input[@data-side='right']")
    public List<WebElement> rightBowls;

    @FindBy(tagName = "li")
    public List<WebElement> weighingsListResult;

    @FindBy(xpath = "//button[@class='square']")
    public List<WebElement> goldBarNumber;

}
