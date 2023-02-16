package com.orangehrm.testsuite;

import com.google.common.base.Verify;
import com.orangehrm.pages.AddUserPage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.ViewSystemUsersPage;
import com.orangehrm.testbase.TestBase;
import javafx.scene.control.Tab;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.security.util.Password;

public class UsersTest extends TestBase {

    LoginPage loginpage = new LoginPage();
    HomePage homePage = new HomePage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();
    AddUserPage adduserpage = new AddUserPage();

    @Test
    public void adminShouldAddUserSuccessfully() throws InterruptedException {
        loginpage.enterUserName("Admin");
        loginpage.enterPassword("admin123");
        loginpage.clickonLoginButton();
        homePage.clickOnAdminTab();
        String actualText = viewSystemUsersPage.verifySystemUsersText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Text is verified");
        viewSystemUsersPage.clickOnAddButton();
        String actualMsg = adduserpage.verifyAddUserText();
        String expectedMsg = "Add User";
        Assert.assertEquals(actualMsg, expectedMsg, "Text is verified");
        adduserpage.selectaddUserRollDropDown();
        adduserpage.enterEmployeeName();
        adduserpage.selectStatusAddDropDown();
        adduserpage.enterUsername("ramon");
        adduserpage.enterPassword("Paul12345@");
        adduserpage.enterConfirmPassword("Paul12345@");
        adduserpage.clickOnSaveButton();
        //verify message successfully saved

    }

    @Test
    public void searchTheUserCreatedItandVerifyIt() throws InterruptedException {
        loginpage.enterUserName("Admin");
        loginpage.enterPassword("admin123");
        loginpage.clickonLoginButton();
        homePage.clickOnAdminTab();
        String actualText = viewSystemUsersPage.verifySystemUsersText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Text is verified");
        viewSystemUsersPage.enterUsernameField("PaulC");
        viewSystemUsersPage.selectViewUserRollDropDown();
        viewSystemUsersPage.selectViewStatusAddDropDown();
        viewSystemUsersPage.clickOnSearchButton();
        //verify result


    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessfully() throws InterruptedException {
        loginpage.enterUserName("Admin");
        loginpage.enterPassword("admin123");
        loginpage.clickonLoginButton();
        homePage.clickOnAdminTab();
        String actualText = viewSystemUsersPage.verifySystemUsersText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Text is verified");
        adduserpage.enterUsername("ramon");
        viewSystemUsersPage.selectViewUserRollDropDown();
        viewSystemUsersPage.selectenViewStatusAddDropDown();
        viewSystemUsersPage.clickOnSearchButton();
       // verifyResultList();
        viewSystemUsersPage.clickOnCheckBox();
        viewSystemUsersPage.clickOnDeleteButton();
        viewSystemUsersPage.clickOnPopUpDelete();
        //verify message successfully deleted
    }

    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException {
        loginpage.enterUserName("Admin");
        loginpage.enterPassword("admin123");
        loginpage.clickonLoginButton();
        homePage.clickOnAdminTab();
        String actualText = viewSystemUsersPage.verifySystemUsersText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Text is verified");
        adduserpage.enterUsername("ramon");
        viewSystemUsersPage.selectViewUserRollDropDown();
        viewSystemUsersPage.selectenViewStatusAddDropDown();
        viewSystemUsersPage.clickOnSearchButton();
        String actualText1= viewSystemUsersPage.verifyNoRecordFound();
        String expectedText1 = "No Records Found";
        Assert.assertEquals(actualText1,expectedText1,"Text is verified");


    }


}





