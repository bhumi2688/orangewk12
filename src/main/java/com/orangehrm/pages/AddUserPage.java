package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage extends Utility {

    By useraddRoleDropDown = By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By userName = By.xpath("//div[@class='oxd-form-row']/div/div[1]//input[@class='oxd-input oxd-input--active']");
    By statusaddDropDown = By.xpath("//div[@class='oxd-form-row']/div[1]/div[3]/div/div[2]/div/div");
    By passwordfield = By.xpath("//div[@class='oxd-form-row user-password-row']/div[1]/div[1]/div[1]/div[2]/input");
    By confirmPassword = By.xpath("//div[@class='oxd-form-row user-password-row']/div[1]/div[2]/div[1]/div[2]/input");
    By saveButton = By.xpath("//div[@class='oxd-form-actions']/button[2]");
    By cancelButton = By.xpath("//div[@class='orangehrm-card-container']/form/div[3]/button[1]");
    By addUserText = By.xpath("//div[@class='orangehrm-card-container']/h6");
    By adminDropDown = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");
    By disableDropDown = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]");
    By paul = By.xpath("//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Paul  Collings')]");


    public void selectaddUserRollDropDown() throws InterruptedException {
        clickOnElement(useraddRoleDropDown);
        Thread.sleep(1000);
        clickOnElement(adminDropDown);
    }

    public void enterEmployeeName() throws InterruptedException {
        sendTextToElement(employeeName,"P");
        Thread.sleep(3000);
        clickOnElement(paul);
    }
    public void enterUsername(String UserName){
        sendTextToElement(userName,UserName);
    }
    public void selectStatusAddDropDown() throws InterruptedException {
        clickOnElement(statusaddDropDown);
        Thread.sleep(1000);
        clickOnElement(disableDropDown);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordfield,password);
    }
    public void enterConfirmPassword(String confirmpassword){
        sendTextToElement(confirmPassword,confirmpassword);
    }
    public void clickOnSaveButton(){
        clickOnElement(saveButton);
    }
    public void clickOnCancelButton(){
        clickOnElement(cancelButton);
    }
    public String verifyAddUserText(){
        return getTextFromElement(addUserText);
    }


}
