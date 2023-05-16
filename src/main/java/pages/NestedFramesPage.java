package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private By leftFrame = By.cssSelector("[body='LEFT']");
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }
    public void switchFrame(String text){
        driver.switchTo().frame(text);
    }
    public String getBodyText(){
        return driver.findElement(body).getText();
    }
    public void getToStart(){
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
}
