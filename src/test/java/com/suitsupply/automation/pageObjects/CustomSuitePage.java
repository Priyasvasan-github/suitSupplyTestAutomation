package com.suitsupply.automation.pageObjects;

import com.suitsupply.automation.helper.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Sripriya Srinivasan on 11/2/2018.
 */
public class CustomSuitePage extends BasePage{

    @FindBy(xpath ="//li[@data-category-type]//span[contains(text(),'Fabric')]")
    WebElement fabricSideMenu;

    @FindBy(xpath ="//li[@data-category-type]//span[contains(text(),'Jacket Fit')]")
    WebElement jacketFitSideMenu;

    @FindBy(xpath ="//li[@data-category-type]//span[contains(text(),'Trousers Fit')]")
    WebElement trousersFitSideMenu;

    @FindBy(xpath ="//li[@data-category-type]//span[contains(text(),'Turn Up')]")
    WebElement turnUPSideMenu;

    @FindBy(xpath ="//li[@data-category-type]//span[contains(text(),'Waistband')]")
    WebElement waistBandSideMenu;

    @FindBy(xpath ="//li[@data-category-type]//span[contains(text(),'Waistcoat')]")
    WebElement waistCoatSideMenu;

    @FindBy(xpath ="//li[@data-category-type]//span[contains(text(),'Trousers (Additional)')]")
    WebElement extraTrousersSideMenu;

    @FindBy(xpath ="//li[@data-category-type]//span[contains(text(),'Trousers Size')]")
    WebElement trousersSizeSideMenu;

    @FindBy(xpath ="//li[@data-category-type]//span[contains(text(),'Jacket Size')]")
    WebElement jacketSizeSideMenu;

    /**
     * Below methods are to return if side menu items are displayed or not
     * @return
     */
    public boolean isFabricSideMenuDisplayed(){
        return fabricSideMenu.isDisplayed();
    }

    public boolean isJacketSideMenuDisplayed(){
        return jacketFitSideMenu.isDisplayed();
    }

    public boolean isTrousersFitSideMenuDisplayed(){
        return trousersFitSideMenu.isDisplayed();
    }

    public boolean isTurnUpSideMenuDisplayed(){
        return turnUPSideMenu.isDisplayed();
    }

    public boolean isWaistBandSideMenuDisplayed(){
        return waistBandSideMenu.isDisplayed();
    }

    public boolean isWaistCoatSideMenuDisplayed(){
        return waistCoatSideMenu.isDisplayed();
    }

    public boolean isExtraTrousersSideMenuDisplayed(){
        return extraTrousersSideMenu.isDisplayed();
    }

    public boolean isTrousersSizeSideMenuDisplayed(){
        return trousersSizeSideMenu.isDisplayed();
    }

    public boolean isJacketSizeSideMenuDisplayed(){
        return jacketSizeSideMenu.isDisplayed();
    }

    /**
     * Below methods are to click on Side menu item
     */
    public void clickFabricSideMenu(){
         fabricSideMenu.click();
    }

    public void clickJacketFitSideMenu(){
        jacketFitSideMenu.click();
    }

    public void clickTrouserFitSideMenu(){
        trousersFitSideMenu.click();
    }
    public void clickTurnUPSideMenu(){
        turnUPSideMenu.click();
    }
    public void clickWaistBandSideMenu(){
        waistBandSideMenu.click();
    }
    public void clickWaistCoatSideMenu(){
        waistCoatSideMenu.click();
    }
    public void clickExtraTrousersSideMenu(){
        extraTrousersSideMenu.click();
    }
    public void clickTrouserSizeSideMenu(){
        fabricSideMenu.click();
    }
    public void clickJacketSizeSideMenu(){
        fabricSideMenu.click();
    }
}
