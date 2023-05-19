package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By text = By.id("finish");

    public DynamicLoadingExample2Page(WebDriver driver){
        this.driver = driver;
    }
    public void clickStartButton(){
        driver.findElement(startButton).click();
    }

    public String getHelloWorldText(){
        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(text));

        return driver.findElement(text).getText();
    }

}
