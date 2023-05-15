package password;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTests {
    private String expectedMessage = "Your e-mail's been sent!";
    @Test
    public void forgotPasswordTest() throws InterruptedException{
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.writeEmail();
        Thread.sleep(1000);
        EmailSentPage emailSentPage = forgotPasswordPage.clickButton();
        Thread.sleep(1000);
        Assert.assertEquals(emailSentPage.getMessage(), expectedMessage);
    }
}
