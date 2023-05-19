package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepPage {
    private WebDriver driver;
    private By table = By.id("large-table");
    public LargeAndDeepPage (WebDriver driver){
        this.driver = driver;
    }
    public void scrollToTable(){
        WebElement tableElement = driver.findElement(table);
        String script = "argument[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, tableElement);
    }
}
