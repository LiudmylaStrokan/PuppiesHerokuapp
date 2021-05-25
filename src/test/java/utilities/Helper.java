package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Helper {

    public static void mouseClick(WebElement element){
        new WebDriverWait(Driver.getDriver(),7).until(ExpectedConditions.elementToBeClickable(element));
        Actions actions = new Actions(Driver.getDriver());
        actions.click(element).perform();
    }

    public static void javascriptClick(WebElement element){
        new WebDriverWait(Driver.getDriver(),7).until(ExpectedConditions.elementToBeClickable(element));
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].click();",element);

    }
    public static void waitForElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(),10).until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementToBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(),10).until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void weClick(WebElement element){
        waitForElementToBeClickable(element);
        waitForElementToBeDisplayed(element);
        element.click();
    }

    public static void highlightElement(WebElement element) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        String style = "border:4px solid red";
        js.executeScript("arguments[0].setAttribute('style',arguments[1]);",element,style);
        Thread.sleep(2000);
    }
}
