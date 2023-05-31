package window;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowTests extends BaseTests {
    @Test
    public void openNewTabAndVerifyStartButton(){
        var example2Page = homePage.clickDynamicLoading().newTabExample2();
        getWindowManager().switchToNewTab();
        Assert.assertTrue(example2Page.isStartButtonThere());
    }
}
