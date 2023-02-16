package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Utility {

    By orangeHRMLogo = By.xpath("//div[@class='oxd-brand-banner']/img");
    By adminMenu = By.xpath("//nav[@class='oxd-navbar-nav']/div[2]/ul/li[1]");
    By pimSideMenu = By.xpath("//div[@class='oxd-sidepanel-body']/ul/li[2]");
    By leaveSideMenu = By.xpath("//div[@class='oxd-sidepanel-body']/ul/li[3]");
    By dashboardSideMenu = By.xpath("//div[@class='oxd-sidepanel-body']/ul/li[8]");
    By welcomeTextMsg = By.xpath("//span[@class='oxd-topbar-header-breadcrumb']");
    By adminTab = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']");
    By userProfileLogo = By.xpath("//div[@class='oxd-topbar-header']/div[2]/ul/li/span");
    By mouseHoverlogOut = By.linkText("Logout");


    public String verifyorangeHRMLogo() {
       return getTextFromElement(orangeHRMLogo);
    }
    public String pimMenu (){
        return getTextFromElement(pimSideMenu);
    }
    public String leaveMenu(){
        return getTextFromElement(leaveSideMenu);
    }
    public String dashboarMenu(){
        return getTextFromElement(dashboardSideMenu);
    }
    public String verifywelcomeMsgText(){
        return getTextFromElement(welcomeTextMsg);
    }
    public String adminMenu(){
        return getTextFromElement(adminMenu);
    }
    public void clickOnAdminTab(){
        clickOnElement(adminTab);
    }
    public void clickOnUserProfileLogo(){
        clickOnElement(userProfileLogo);
    }
    public void mouseHoverToLogoutAndClick( ) {
        mouseHoverToElementAndClick(mouseHoverlogOut);
    }
}
