package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViewDetailsAboutPuppyPage {

    public ViewDetailsAboutPuppyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//img[@alt='Brook']")
    public WebElement puppyImage;

    @FindBy(xpath = "//input[@value='Adopt Me!']")
    public WebElement adoptButton;
}
