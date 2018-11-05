package com.suitsupply.automation.pageObjects;

import com.suitsupply.automation.helper.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Srinivas Budha on 11/3/2018.
 */
public class SelectSuiteOptionsWindow extends BasePage {

    @FindBy(xpath="//*[@class='side-bar--a__content _po-r js-side-bar-content']//button[contains(text(),'Add To Bag')]")
    WebElement addToBagButton;

    @FindBy(css="div[class='slide-panel--a__content']")
    WebElement selectionPannel;

    @FindBy (xpath = "//div[contains(text(),'Skip waistcoat')]")
    WebElement skipWaistCoat;

    @FindBy (xpath = "//div[contains(text(),'Skip Extra Trousers')]")
    WebElement skipExtraTrousers;

    @FindBy (xpath = "//span[@class='filter__search-field-title js-menu-fade' and contains(text(),'Color')]")
    WebElement colorFilterOnFabric;

    @FindBy (xpath = "//span[@class='filter__search-field-title js-menu-fade' and contains(text(),'Design')]")
    WebElement designFilterOnFabric;

    @FindBy(xpath="//div[@class='checkbox']/label[contains(text(),'44')]")
    WebElement sizeCheckBox;

    @FindBy (xpath = "//span[@class='filter__search-field-title js-menu-fade' and contains(text(),'Code')]")
    WebElement codeFilterOnFabric;

    @FindBy(xpath="//a[contains(text(),'Secure checkout')]")
    WebElement secureCheckOutButton;

    /**
     * Below methods are to interact with side panel and select respective items
     */
    public void chooseFabric(String fabricType) {
        chooseAObjectFromSidemenu(fabricType);
    }

    public void chooseJacketFit(String jacketFitType) {
        chooseAObjectFromSidemenu(jacketFitType);
    }

    public void chooseTrousersFit(String trouserFirType) {
        chooseAObjectFromSidemenu(trouserFirType);
    }

    public void chooseTurnUp(String turnUpFitType) {
        chooseAObjectFromSidemenu(turnUpFitType);
    }

    public void chooseWaistBand(String waistBandType) {
        chooseAObjectFromSidemenu(waistBandType);
    }

    public void chooseWaistCoat(String waistCoatType) {
        if(waistCoatType.equalsIgnoreCase("SKIP")){
            waitForElementToBeClickable(skipWaistCoat);
            skipWaistCoat.click();
        }else{
            chooseAObjectFromSidemenu(waistCoatType);
        }
    }

    public void addExtraTrouser(String extraTrouser) {
        if(extraTrouser.equalsIgnoreCase("SKIP")){
            waitForElementToBeClickable(skipExtraTrousers);
            skipExtraTrousers.click();
        }else{
            chooseAObjectFromSidemenu(extraTrouser);
        }
    }

    public void selectTrouserSize(String trouserSize) {
        selectSize(trouserSize);
    }

    public void selectJacketSize(String jacketSize) {
        selectSize(jacketSize);
    }

    /**
     * This method is to check if ADD to cart button is displayed or not
     * @return
     */
    public boolean isAddToBagButtonEnabled(){
       boolean flag=false;
        try{
            if(addToBagButton.isEnabled()){
                flag=true;
            }
            return flag;
        }catch (ElementNotVisibleException e){
            return flag;
        }

    }

    /**
     * This method is to click on AddToBag button
     */
    public void clickAddToBagButton(){
        waitForElementToBeClickable(addToBagButton);
        addToBagButton.click();
    }

    /**
     * This method is to click on Secure Checkout button
     */
    public void clickSecureCheckoutButton(){
        waitForElementToBeClickable(secureCheckOutButton);
        secureCheckOutButton.click();
    }

    /**
     * Below methods are to check if filters are displayed on the side panel
     * @return
     */
    public boolean isColorFilterDisplayed(){
        return colorFilterOnFabric.isDisplayed();
    }

    public boolean isDesignFilterDisplayed(){
        return designFilterOnFabric.isDisplayed();
    }

    public boolean isCodeFilterDisplayed(){
        return codeFilterOnFabric.isDisplayed();
    }

    /**
     * This method is to click on the objectType in side pannel
     * @param objectType
     */
    private void chooseAObjectFromSidemenu(String objectType) {
        waitForElementToBeClickable(selectionPannel);
        WebElement identifyObject = getDriver().findElement(By.xpath("//div[@data-item-name='"+ objectType +"']"));
        waitForElementToBeClickable(identifyObject);
        identifyObject.click();
    }

    /**
     * This method is to click on size selection panel
     * @param size
     */
    private void selectSize(String size) {
        waitForElementToBeDisplayed(selectionPannel);
        waitForElementToBeClickable(sizeCheckBox);
        WebElement sizeCheckBox = getDriver().findElement(By.xpath("//div[@class='checkbox']/label[contains(text(),'" + size + "')]"));
        sizeCheckBox.click();
    }
}
