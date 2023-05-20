package javascript;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class JavaScriptTests extends BaseTests {
    String[] expectedOptions = {"Option 1", "Option 2"};
    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeep().scrollToTable();
    }
    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
    @Test
    public void testMultipleOptions() throws InterruptedException{
        var dropdownPage = homePage.clickDropDown();
        dropdownPage.setDropdownToMultiple();
        dropdownPage.selectFromDropdown("Option 1");
        dropdownPage.selectFromDropdown("Option 2");
        Assert.assertEquals(dropdownPage.getSelectedOption(), Arrays.stream(expectedOptions).toList());
    }
}
