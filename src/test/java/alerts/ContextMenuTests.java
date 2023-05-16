package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTests extends BaseTests {
    @Test
    public void verifyTextAndClickAlert(){
        var contextMenu = homePage.clickContextMenu();
        contextMenu.clickBoxObject();
        Assert.assertEquals(contextMenu.getAlertText(), "You selected a context menu", "Message not right");
        contextMenu.clickAlert();
    }

}
