package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
    By dashboardText = By.xpath("//span[@class='oxd-topbar-header-breadcrumb']");

    public String verifyDashboardText(){
        return getTextFromElement(dashboardText);
    }


}
