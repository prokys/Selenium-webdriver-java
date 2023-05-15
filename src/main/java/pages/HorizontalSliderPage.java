package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage{
    private WebDriver driver;
    private By slider = By.tagName("input");
    private By value = By.tagName("span");
    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }
    public void moveSlider(int value){
        for(int i=0; i<value; i++){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public String getValue(){
        return driver.findElement(value).getText();
    }
}
