package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);

        driver.quit();
    }
//    public void chapter3Exercise(){
//        driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/");
//        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
//        shiftingContent.click();
//        WebElement example1 = driver.findElement(By.linkText("Example 1: Menu Element"));
//        example1.click();
//        List<WebElement> listOfElements = driver.findElements(By.tagName("li"));
//        System.out.println(listOfElements.size());
//        driver.quit();
//    }
    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}

