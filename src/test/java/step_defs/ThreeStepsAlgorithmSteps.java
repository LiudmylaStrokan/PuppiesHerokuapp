package step_defs;

import cucumber.api.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainGamePage;
import utilities.Driver;

public class ThreeStepsAlgorithmSteps {
    WebDriver driver = Driver.getDriver();
    MainGamePage mainGamePage = new MainGamePage();
    WebDriverWait wait = new WebDriverWait(driver, 15);

    @Then("^User runs the three steps algorithm to resolve the challenge$")
    public void userRunsTheThreeStepsAlgorithmToResolveTheChallenge() {

        int number = 0;
        for (WebElement grid : mainGamePage.leftBowls) {
            grid.sendKeys(Integer.toString(number));
            number++;
            if (number == 4) break;
        }
        for (WebElement grid : mainGamePage.rightBowls) {
            grid.sendKeys(Integer.toString(number));
            number++;
            if (number == 8) break;
        }
        mainGamePage.weightButton.click();
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(mainGamePage.resultField, "?")));
        if (mainGamePage.resultField.getText().contains("=")) {
            mainGamePage.goldBarNumber.get(8).click();
            System.out.println("The fake gold bar is #8");
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println(driver.switchTo().alert().getText());
            driver.switchTo().alert().accept();
        } else if (mainGamePage.resultField.getText().contains("<")) {
            mainGamePage.resetButton.click();
            int number1 = 0;
            int number2 = 2;
            for (WebElement grid : mainGamePage.leftBowls) {
                grid.sendKeys(Integer.toString(number1));
                number1++;
                if (number1 == 2) break;
            }
            for (WebElement grid : mainGamePage.rightBowls) {
                grid.sendKeys(Integer.toString(number2));
                number2++;
                if (number2 == 4) break;
            }
            mainGamePage.weightButton.click();
            wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(mainGamePage.resultField, "?")));
            if (mainGamePage.resultField.getText().contains("<")) {
                mainGamePage.resetButton.click();
                mainGamePage.leftBowls.get(0).sendKeys("0");
                mainGamePage.rightBowls.get(0).sendKeys("1");

                mainGamePage.weightButton.click();
                wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(mainGamePage.resultField, "?")));
                if (mainGamePage.resultField.getText().contains(">")) {
                    mainGamePage.goldBarNumber.get(1).click();
                    System.out.println("The fake gold bar is #1");
                }
                if (mainGamePage.resultField.getText().contains("<")) {
                    mainGamePage.goldBarNumber.get(0).click();
                    System.out.println("The fake gold bar is #0");
                }
            }
            if (mainGamePage.resultField.getText().contains(">")) {
                mainGamePage.resetButton.click();
                mainGamePage.leftBowls.get(0).sendKeys("2");
                mainGamePage.rightBowls.get(0).sendKeys("3");

                mainGamePage.weightButton.click();
                wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(mainGamePage.resultField, "?")));
                if (mainGamePage.resultField.getText().contains("<")) {
                    mainGamePage.goldBarNumber.get(2).click();
                    System.out.println("The fake gold bar is #2");
                    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
                    System.out.println(driver.switchTo().alert().getText());
                    driver.switchTo().alert().accept();
                }

                if (mainGamePage.resultField.getText().contains(">")) {
                    mainGamePage.goldBarNumber.get(3).click();
                    System.out.println("The fake gold bar is #3");
                    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
                    System.out.println(driver.switchTo().alert().getText());
                    driver.switchTo().alert().accept();
                }
            }
        } else if (mainGamePage.resultField.getText().contains(">")) {
            int number3 = 4;
            int number4 = 6;
            mainGamePage.resetButton.click();
            for (WebElement grid : mainGamePage.leftBowls) {
                grid.sendKeys(Integer.toString(number3));
                number3++;
                if (number3 == 6) break;
            }
            for (WebElement grid : mainGamePage.rightBowls) {
                grid.sendKeys(Integer.toString(number4));
                number4++;
                if (number4 == 8) break;
            }
            mainGamePage.weightButton.click();
            wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(mainGamePage.resultField, "?")));
            if (mainGamePage.resultField.getText().contains("<")) {
                mainGamePage.resetButton.click();
                mainGamePage.leftBowls.get(0).sendKeys("4");
                mainGamePage.rightBowls.get(0).sendKeys("5");

                mainGamePage.weightButton.click();
                wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(mainGamePage.resultField, "?")));
                if (mainGamePage.resultField.getText().contains(">")) {
                    mainGamePage.goldBarNumber.get(5).click();
                    System.out.println("The fake gold bar is #5");
                    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
                    System.out.println(driver.switchTo().alert().getText());
                    driver.switchTo().alert().accept();
                }
                if (mainGamePage.resultField.getText().contains("<")) {
                    mainGamePage.goldBarNumber.get(4).click();
                    System.out.println("The fake gold bar is #6");
                    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
                    System.out.println(driver.switchTo().alert().getText());
                    driver.switchTo().alert().accept();
                }
            }

            if (mainGamePage.resultField.getText().contains(">")) {
                mainGamePage.resetButton.click();
                mainGamePage.leftBowls.get(0).sendKeys("6");
                mainGamePage.rightBowls.get(0).sendKeys("7");

                mainGamePage.weightButton.click();
                wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(mainGamePage.resultField, "?")));
                if (mainGamePage.resultField.getText().contains("<")) {
                    mainGamePage.goldBarNumber.get(6).click();
                    System.out.println("The fake gold bar is #6");
                    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
                    System.out.println(driver.switchTo().alert().getText());
                    driver.switchTo().alert().accept();
                }
                if (mainGamePage.resultField.getText().contains(">")) {
                    mainGamePage.goldBarNumber.get(7).click();
                    System.out.println("The fake gold bar is #7");
                    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
                    System.out.println(driver.switchTo().alert().getText());
                    driver.switchTo().alert().accept();
                }
            }
        }
    }
}
