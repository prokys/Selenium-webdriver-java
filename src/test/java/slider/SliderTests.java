package slider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SliderTests extends BaseTests {
    @Test
    public void testSlider(){
        var sliderPage = homePage.clickHorizontalSliderPage();
        sliderPage.moveSlider(8);
        Assert.assertEquals(sliderPage.getValue(), "4");
    }
}
