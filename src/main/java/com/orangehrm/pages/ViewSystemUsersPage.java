package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {


    By systemUserText = By.xpath("//div[@class='oxd-table-filter-header-title']");
    By userNameField = By.xpath("//div[@class='oxd-form-row']/div/div[1]//input[@class='oxd-input oxd-input--active']");
    By viewUserRollDropDown = By.xpath("//div[@class='oxd-table-filter-area']/form/div/div/div[2]/div/div/div/div//div[@class='oxd-select-text-input']");
    By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    By searchButton = By.xpath("//div[@class='oxd-form-actions']/button[2]");
    By resetButton = By.xpath("//div[@class='oxd-form-actions']/button[1]");
    By addbutton = By.xpath("//div[@class='orangehrm-header-container']/button");
    By deleteButton =By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/div/button//i[@class='oxd-icon bi-trash-fill oxd-button-icon']");
    By viewStatusDropDown = By.xpath("//div[@class='oxd-form-row']/div[1]/div[4]/div/div[2]");
    By userText = By.linkText("Users");
    By viewAdminDropDown = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");
    By john = By.xpath("//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Anthony  Nolan')]");
    By disableDropDown = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]");
    By resultList = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//span[text()='(1) Record Found']");
        //By.xpath("//div[@class='oxd-table-card']");
    By checkboxUser = By.xpath("//div[@class='oxd-table-body']/div[1]/div/div//div/label//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']");
    By enViewStatusDropDown = By.xpath("//div[@class='oxd-form-row']/div[1]/div[4]/div/div[2]");
    By enableStatus = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Enabled')]");
    By deletePopUp = By.xpath("//div[@class='orangehrm-modal-footer']/button[2]//i[@class='oxd-icon bi-trash oxd-button-icon']");
    By noRecordFound = By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/span[text()='No Records Found']");

    public String verifySystemUsersText(){
        return getTextFromElement(systemUserText);
    }
    public void enterUsernameField(String username){
        sendTextToElement(userNameField,username);
    }
   public void selectViewUserRollDropDown() throws InterruptedException {
        clickOnElement(viewUserRollDropDown);
        Thread.sleep(1000);
        clickOnElement(viewAdminDropDown);
    }

    public  void selectViewStatusAddDropDown() throws InterruptedException {
        clickOnElement(viewStatusDropDown);
        Thread.sleep(1000);
        clickOnElement(disableDropDown);
    }
    public  void selectenViewStatusAddDropDown() throws InterruptedException {
        clickOnElement(enViewStatusDropDown);
        Thread.sleep(1000);
        clickOnElement(enableStatus);
    }
    public void enterEmployeeName() throws InterruptedException {
        sendTextToElement(employeeNameField, "P");
        Thread.sleep(3000);
        clickOnElement(john);
    }
    public void clickOnSearchButton(){
        clickOnElement(searchButton);
    }
    public void clickOnResetButton(){
        clickOnElement(resetButton);
    }
    public void clickOnAddButton(){
        clickOnElement(addbutton);
    }
    public void clickOnDeleteButton(){
        clickOnElement(deleteButton);
    }
    public String verifyUserText(){
        return getTextFromElement(userText);
    }
    public String verifyResultList(){
        return getTextFromElement(resultList);
    }
    public void clickOnCheckBox(){
        clickOnElement(checkboxUser);
    }
    public void clickOnPopUpDelete(){
        clickOnElement(deletePopUp);
    }
    public String verifyNoRecordFound(){
        return getTextFromElement(noRecordFound);
    }



}
