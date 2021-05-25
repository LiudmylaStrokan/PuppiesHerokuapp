package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CompleteAdoptionPage {
    public CompleteAdoptionPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='order_name'] ")
    public WebElement nameInputField;

    @FindBy(xpath = "//textarea[@id='order_address'] ")
    public WebElement addressInputField;

    @FindBy(xpath = "//input[@id='order_email'] ")
    public WebElement emailInputField;

    @FindBy(xpath = "//select[@id='order_pay_type']")
    public WebElement selectPaymentTypeDropdown;

    @FindBy(xpath = "//input[@value='Place Order']")
    public WebElement placeOrderButton;
}
