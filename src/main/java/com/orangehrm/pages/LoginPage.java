package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type='submit']");
    By loginPanel = By.xpath("//div[@class='orangehrm-login-form']");
    By loginPanelText = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");


    public void enterUserName(String Username){
        sendTextToElement(userNameField,Username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickonLoginButton(){
        clickOnElement(loginButton);
    }
    public String loginPanelForm(){
        return getTextFromElement(loginPanel);
    }
    public String verifyLoginPanelText(){
        return getTextFromElement(loginPanelText);
    }


}
