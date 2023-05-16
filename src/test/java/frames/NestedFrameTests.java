package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFrameTests extends BaseTests {
    public final String left = "LEFT";
    public final String bottom = "BOTTOM";
    @Test
    public void testFrameSwitch(){
        var framePage = homePage.clickFrames();
        var nestedPage = framePage.clickNestedFrames();
        nestedPage.switchFrame("frame-top");
        nestedPage.switchFrame("frame-left");
        String leftText = nestedPage.getBodyText();
        nestedPage.getToStart();
        nestedPage.switchFrame("frame-bottom");
        String bottomText = nestedPage.getBodyText();
        Assert.assertEquals(leftText, left, "Body text is not left");
        Assert.assertEquals(bottomText, bottom, "Body text is not bottom");
    }
}
