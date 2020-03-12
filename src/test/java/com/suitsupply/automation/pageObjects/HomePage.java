package com.suitsupply.automation.pageObjects;

import com.suitsupply.automation.helper.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Sripriya srinivasan on 11/1/2018.
 */

public class HomePage extends BasePage {

    @FindBy(xpath="//img[@alt='Hero']")
    WebElement homePageBanner;

    @FindBy(xpath="//a[contains(text(),'Men')]")
    WebElement optionOfMenSelection;

    @FindBy(css="#navigationModal #CustomMade button")
    WebElement customModeMenuOption;

    @FindBy(xpath="//div[@id='navigationModal']//a[@id='CustomMadeSuit' and contains(text(),'Suit')]")
    WebElement suiteOptionFromCustomMode;

    @FindBy(css="#navigationModal #CustomMadeTrouser")
    WebElement trouserOptionFromCustomMode;

    @FindBy(css="#navigationModal #CustomMadeJacket")
    WebElement jacketOptionFromCustomMode;

    /**
     * This method is to return if custom mode menu option is displayed or not
     * @return
     */
    public boolean isHomePageBannerDisplayed(){
        waitForElementToBeDisplayed(homePageBanner);
        return homePageBanner.isDisplayed();
    }

    /**
     * This Method is used to click on custom mode Menu option
     */
    public void clickOnMenMenuOption(){
        optionOfMenSelection.click();
    }

    /**
     * This Method is used to click on custom mode Menu option
     */
    public void clickCustomModeOption(){
        waitForElementToBeClickable(customModeMenuOption);
        customModeMenuOption.click();
        setWaitForElementTimeout(500);
    }

    /**
     * Below methods are to click on Menu Options Under CustomMade
     */
    public void clickSuiteOptionFromCustomMode(){
        clickCustomModeOption();
        waitForElementToBeClickable(suiteOptionFromCustomMode);
        suiteOptionFromCustomMode.click();
    }

    public void clickTrouserOptionFromCustomMode(){
        clickCustomModeOption();
        waitForElementToBeClickable(trouserOptionFromCustomMode);
        trouserOptionFromCustomMode.click();
    }

    public void clickJacketOptionFromCustomMode(){
        clickCustomModeOption();
        waitForElementToBeClickable(jacketOptionFromCustomMode);
        jacketOptionFromCustomMode.click();
    }

}
