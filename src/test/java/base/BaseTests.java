package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        goHome();
        homePage = new HomePage(driver);
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterClass
    public void tearDown(){
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
}

