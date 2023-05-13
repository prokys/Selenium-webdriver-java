package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;

    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        WebElement inputsLink = driver.findElement(new By.ByLinkText("Inputs"));
        inputsLink.click();

        System.out.println(driver.getTitle());
        driver.quit();
    }
    public void chapter3Exercise(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement shiftingContent = driver.findElement(new By.ByLinkText("Shifting Content"));
        shiftingContent.click();
        WebElement example1 = driver.findElement(new By.ByLinkText("Example 1: Menu Element"));
        example1.click();
        List<WebElement> listOfElements = driver.findElements(By.tagName("li"));
        System.out.println(listOfElements.size());
        driver.quit();

    }
    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.chapter3Exercise();
    }
}

