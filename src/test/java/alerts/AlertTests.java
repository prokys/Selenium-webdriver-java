package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        Assert.assertEquals(alertsPage.getResultText(), "You successfully clicked an alert", "Result incorrect");
    }
    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        Assert.assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }
    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "TAU rocks";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        Assert.assertEquals(alertsPage.getResultText(), "You entered: " + text, "Results text incorrect");
    }
}
