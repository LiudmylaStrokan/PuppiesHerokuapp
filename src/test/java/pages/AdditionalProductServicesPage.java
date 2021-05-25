package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdditionalProductServicesPage {

    public AdditionalProductServicesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='intro']/following::table")
    public List<WebElement> tableOfAdditionalProducts;

    @FindBy(xpath = "//input[@value='Complete the Adoption']")
    public WebElement completeTheAdoptionButton;

    @FindBy(xpath = "//div[@id='intro']/following::table//tr/td/input[@type='checkbox']")
    public List<WebElement> checkboxList;
}
