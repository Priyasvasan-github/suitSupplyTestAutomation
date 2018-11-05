package com.suitsupply.automation.pageObjects;

import com.suitsupply.automation.helper.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Sripriya srinivasan on 11/1/2018.
 */

public class HomePage extends BasePage {

    @FindBy(xpath="//span[contains(text(),'Custom made')]")
    WebElement customModeMenuOption;

    @FindBy(xpath="//div[@class='dyo-menu-container _dis-f']//span[contains(text(),'Suit')]")
    WebElement suiteOptionFromCustomMode;

    @FindBy(xpath="//div[@class='dyo-menu-container _dis-f']//span[contains(text(),'Shirt')]")
    WebElement shirtOptionFromCustomMode;

    @FindBy(xpath="//div[@class='dyo-menu-container _dis-f']//span[contains(text(),'Jacket')]")
    WebElement jacketOptionFromCustomMode;

    /**
     * This method is to return if custom mode menu option is displayed or not
     * @return
     */
    public boolean isCustomModeMenuOptionDisplayed(){
        waitForElementToBeDisplayed(customModeMenuOption);
        return customModeMenuOption.isDisplayed();
    }

    /**
     * This Method is used to click on custom mode Menu option
     */
    public void clickCustomModeOption(){
        customModeMenuOption.click();
    }

    /**
     * Below methods are to click on Menu Options Under CustomMade
     */
    public void clickSuiteOptionFromCustomMode(){
        clickCustomModeOption();
        suiteOptionFromCustomMode.click();
    }

    public void clickShirtOptionFromCustomMode(){
        clickCustomModeOption();
        shirtOptionFromCustomMode.click();
    }

    public void clickJacketOptionFromCustomMode(){
        clickCustomModeOption();
        jacketOptionFromCustomMode.click();
    }

}
