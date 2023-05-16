package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By boxObject = By.id("hot-spot");


    public ContextMenuPage (WebDriver driver){
        this.driver = driver;
    }
    public void clickBoxObject(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(boxObject)).contextClick().perform();
    }
    public String  getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void clickAlert(){
        driver.switchTo().alert().accept();
    }
}
