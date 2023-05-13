package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticatorLink = By.linkText("Form Authentication");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticatorLink).click();
        return new LoginPage(driver);
    }
}
