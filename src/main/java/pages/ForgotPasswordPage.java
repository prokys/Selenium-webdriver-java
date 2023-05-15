package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrieveButton = By.id("form_submit");
    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }
    public void writeEmail(){
        driver.findElement(emailField).sendKeys("tau@example.com");
    }
    public EmailSentPage clickButton(){
        driver.findElement(retrieveButton).click();
        return new EmailSentPage(driver);
    }
}
