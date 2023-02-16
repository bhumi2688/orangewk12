package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

    By usermanagementTab = By.xpath("//div[@class='oxd-topbar-body']/nav/ul/li[1]");
    By jobTab = By.xpath("//div[@class='oxd-topbar-body']/nav/ul/li[2]");
    By organizationTab = By.xpath("//div[@class='oxd-topbar-body']/nav/ul/li[3]");

    public void selectUserManagementDropDwon(String user) {
        selectByVisibleTextFromDropDown(usermanagementTab, user);
    }
    public void selectJobDropDown(String job){
        selectByVisibleTextFromDropDown(jobTab,job);
    }
    public void selectOrganizationDropDown(String org){
        selectByVisibleTextFromDropDown(organizationTab,org);
    }



}
