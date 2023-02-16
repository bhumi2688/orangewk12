package com.orangehrm.testsuite;

import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginpage = new LoginPage();
    HomePage homepage = new HomePage();

    @Test
    public void verifyUserShouldLoginSuccessfully(){
        loginpage.enterUserName("Admin");
        loginpage.enterPassword("admin123");
        loginpage.clickonLoginButton();
        String actualMsg = homepage.verifywelcomeMsgText();
        String expectedMsg = "Dashboard";
        Assert.assertEquals(actualMsg,expectedMsg,"Text is verified");
    }
    @Test
    public void verifyLogoDisplayOnHomePage(){
        loginpage.enterUserName("Admin");
        loginpage.enterPassword("admin123");
        loginpage.clickonLoginButton();
        String actualMsg = homepage.verifywelcomeMsgText();
        String expectedMsg = "Dashboard";
        Assert.assertEquals(actualMsg,expectedMsg,"Text is verified");
        homepage.verifyorangeHRMLogo();
    }
    @Test
    public void verifyUserShouldLogOutSuccessfully(){
        loginpage.enterUserName("Admin");
        loginpage.enterPassword("admin123");
        loginpage.clickonLoginButton();
        homepage.clickOnUserProfileLogo();
        homepage.mouseHoverToLogoutAndClick();
        String actualMsg = loginpage.verifyLoginPanelText();
        String expectedMsg = "Login";
        Assert.assertEquals(actualMsg,expectedMsg,"Text is verified");



    }
}
