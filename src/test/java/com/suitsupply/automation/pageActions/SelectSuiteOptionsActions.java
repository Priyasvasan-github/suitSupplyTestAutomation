package com.suitsupply.automation.pageActions;

import com.suitsupply.automation.pageObjects.SelectSuiteOptionsWindow;
import net.thucydides.core.annotations.Step;

/**
 * Created by Sripriya Srinivasan on 11/3/2018.
 */
public class SelectSuiteOptionsActions {

    private SelectSuiteOptionsWindow selectSuiteOptionsWindow;

    /**
     * This method is to return AddToCart button is Displayed or not
     * @return
     */
    @Step
    public boolean isAddToCartEnabled(){
        return selectSuiteOptionsWindow.isAddToBagButtonEnabled();
    }

    /**
     * This method is to navigate to View Cart
     */
    @Step
    public void navigateToViewCart(){
        selectSuiteOptionsWindow.clickAddToBagButton();
    }

    /**
     * This method is to Navigate to Secure Check out view
     */
    @Step
    public void navigateToSecureCheckOut(){
        selectSuiteOptionsWindow.clickSecureCheckoutButton();
    }

    /**
     * Below methods are to verify if filters are  displayed
     * @return
     */
    @Step
    public boolean isColorFilterDisplayed(){
        return selectSuiteOptionsWindow.isColorFilterDisplayed();
    }

    @Step
    public boolean isDesignFilterDisplayed(){
        return selectSuiteOptionsWindow.isDesignFilterDisplayed();
    }

    @Step
    public boolean isCodeFilterDisplayed(){
        return selectSuiteOptionsWindow.isCodeFilterDisplayed();
    }

    /**
     * Below methods are to click on specific item on side pannels
     * @param fabricType
     */
    @Step
    public void chooseFabric(String fabricType){
        selectSuiteOptionsWindow.chooseFabric(fabricType);
    }

    @Step
    public void chooseJacket(String jacketType){
        selectSuiteOptionsWindow.chooseJacketFit(jacketType);
    }

    @Step
    public void chooseTrousers(String trouserFit){
        selectSuiteOptionsWindow.chooseTrousersFit(trouserFit);
    }

    @Step
    public void chooseTurnUp(String turnUp){
        selectSuiteOptionsWindow.chooseTurnUp(turnUp);
    }

    @Step
    public void chooseWaistBand(String waistBand){
        selectSuiteOptionsWindow.chooseWaistBand(waistBand);
    }

    @Step
    public void chooseWaistCoat(String waistCoat){
        selectSuiteOptionsWindow.chooseWaistCoat(waistCoat);
    }

    @Step
    public void chooseExtraTrousers(String extraTrousers){
        selectSuiteOptionsWindow.addExtraTrouser(extraTrousers);
    }

    @Step
    public void chooseTrouserSize(String trouserSize){
        selectSuiteOptionsWindow.selectTrouserSize(trouserSize);
    }

    @Step
    public void chooseJacketSize(String jacketSize){
        selectSuiteOptionsWindow.selectJacketSize(jacketSize);
    }

    /**
     * This method is to select all the options of a custom made suit
     * @param fabric
     * @param jacket
     * @param trouserFit
     * @param turnUp
     * @param waistBand
     * @param waistCoat
     * @param extraTrousers
     * @param trouserSize
     * @param jacketSize
     */
    @Step
    public void selectAllTheOptionsOfSuite(String fabric,String jacket,String trouserFit,String turnUp,String
            waistBand, String waistCoat,String extraTrousers,String trouserSize,String jacketSize){
        chooseFabric(fabric);
        chooseJacket(jacket);
        chooseTrousers(trouserFit);
        chooseTurnUp(turnUp);
        chooseWaistBand(waistBand);
        chooseWaistCoat(waistCoat);
        chooseExtraTrousers(extraTrousers);
        chooseTrouserSize(trouserSize);
        chooseJacketSize(jacketSize);
    }
}
