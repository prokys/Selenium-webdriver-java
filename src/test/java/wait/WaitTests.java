package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTests extends BaseTests {
    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        Assert.assertEquals(loadingPage.returnLoadedTest(), "Hello World!", "Loaded text incorrect");
    }
    @Test
    public void testUntilVisible() throws InterruptedException{
        var dynamicLoadingPage = homePage.clickDynamicLoading().clickExample2();
        dynamicLoadingPage.clickStartButton();
        Assert.assertEquals(dynamicLoadingPage.getHelloWorldText(),"Hello World!", "Loaded text incorrect" );
    }
}
